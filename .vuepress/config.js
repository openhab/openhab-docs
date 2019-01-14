const DocsSidebarNavigation = require('./docs-sidebar.js')

const fs = require ('fs-extra')
const path = require('path')
// const CopyWebpackPlugin = require('copy-webpack-plugin')

const HighlightDsl = require('./highlight-dsl')
const HighlightRules = require('./highlight-rules')

const base = process.env.OH_DOCS_VERSION ? `/v${process.env.OH_DOCS_VERSION}/` : '/'

module.exports = {
  title: 'Documentation Preview',
  description: 'This is a preview of the main parts of the documentation, found in the openhab/openhab-docs repository',
  dest: 'vuepress',
  host: 'localhost',
  base,
  shouldPrefetch: () => false,
  head: [
    ['link', { rel: 'stylesheet', href: `/fonts/fonts.css` }],
    ['link', { rel: 'icon', href: `/favicon.ico` }],
    ['link', { rel: 'shortcut icon', href: `/favicon.ico` }],
    ['link', { rel: 'apple-touch-icon', href: `/apple-icon.png` }],
    // ['link', { rel: 'stylesheet', href: `https://fonts.googleapis.com/css?family=Open+Sans:300,400` }],
    ['meta', { property: 'og:type', content: 'website' }],
    ['meta', { property: 'og:image', content: 'https://www.openhab.org/og-image.png' }],
    // ['meta', { property: 'og:title', content: 'openHAB' }],
    // ['meta', { property: 'og:description', content: 'a vendor and technology agnostic open source automation software for your home' }],
    // ['script', { src: `https://identity.netlify.com/v1/netlify-identity-widget.js` }]
  ],
  markdown: {
    config: (md) => {
      md.options.linkify = true
      const highlight = md.options.highlight
      md.options.highlight = (str, lang) => {
        /* Simple heuristics to detect rules & other openHAB DSL code snippets and override the language */
        if (str.match(/\b(?:Color|Contact|Dimmer|Group|Number|Player|Rollershutter|Switch|Location|Frame|Default|Text|Group|Selection|Setpoint|Slider|Colorpicker|Chart|Webview|Mapview|Image|Video|Item|Thing|Bridge|Time|Type|Sitemap|sitemap)\b/)) {
          lang = 'dsl'
        }
        if (str.match(/\b(?:String|DateTime)\b/) && lang !== 'java' && lang !== 'xml') {
          lang = 'dsl'
        }
        if ((str.match(/\brule\b/) && str.match(/\bwhen\b/) && str.match(/\bthen\b/) && str.match(/\bend\b/)) ||
          str.match(/received update/) || str.match(/changed.*(?:from|to)/) || str.match(/Channel.*triggered/) ||
          str.match(/\bval\b/) || str.match(/\bvar\b/) /* <-- dangerous! */) {
          
          if (lang !== 'nginx' && lang !== 'shell') lang = 'rules'
        }
        if (lang === 'shell' || lang === 'sh' || lang === 'shell_session') lang = 'bash'
        if (lang === 'conf') lang = 'dsl'
        if (lang === 'JSON') lang = 'json'
        // if (lang === 'xtend' || lang === 'text' || !lang) {
        //   console.log('Cannot determine language of code: ' + lang)
        //   console.log(str)
        // }

        if (!Prism.languages.dsl || !Prism.languages.rules) {
          Prism.languages.dsl = HighlightDsl
          Prism.languages.rules = HighlightRules
        }

        return highlight(str, lang)
      }
    }
  },
  // configureWebpack: (config, isServer) => {
  //   config.plugins.push(new CopyWebpackPlugin([
  //     { from: '.vuepress/_redirects', to: '.'},
  //     { from: '.vuepress/_headers', to: '.'},
  //   ]))
  // },
  serviceWorker: false,
  themeConfig: {
    logo: `/openhab-logo.png`,
    // repo: 'openhab',
    editLinks: false,
    activeHeaderLinks: false,
    sidebarDepth: 0,
    docsDir: 'docs',
    nav: [
      {
        text: 'Documentation',
        link: '/docs/',
      },
      {
        text: 'GitHub',
        link: 'https://github.com/openhab/openhab-docs',
      }
    ],
    sidebar: {
      '/docs/': DocsSidebarNavigation.filter((s, i) => s.title !== 'Concepts')
    }
  }
}
