import { DefaultThemeConfig, UserConfig, defineConfig } from "vuepress/config";

const DocsSidebarNavigation = require('./docs-sidebar.js')

const base = process.env.OH_DOCS_VERSION
    ? `/v${process.env.OH_DOCS_VERSION}/`
    : '/'

const config: UserConfig<DefaultThemeConfig> = {
    title: 'Documentation Preview',
    description: 'This is a preview of the main parts of the documentation, found in the openhab/openhab-docs repository',
    dest: 'vuepress',
    host: 'localhost',
    plugins: [
        // @ts-ignore
        'tabs',
        'container'
    ],
    // @ts-ignore
    base: base,
    patterns: [
        'docs/**/*.md',
        'addons/integrations/**/*.md',
        '**/*.vue'],
    configureWebpack: {
        module: {
            rules: [
                {
                    test: /\.(drawio|xml|txt)$/,
                    exclude: /node_modules/,
                    use: 'null-loader'
                }
            ]
        }
    },
    head: [
        ['link', { rel: 'stylesheet', href: `/fonts/fonts.css` }],
        ['link', { rel: 'icon', href: `/favicon.ico` }],
        ['link', { rel: 'shortcut icon', href: `/favicon.ico` }],
        ['link', { rel: 'apple-touch-icon', href: `/apple-icon.png` }],
        ['meta', { property: 'og:type', content: 'website' }],
        ['meta', { property: 'og:image', content: 'https://www.openhab.org/og-image.png' }],

    ],
    themeConfig: {
        logo: `/openhab-logo.svg`,
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
            '/docs/': DocsSidebarNavigation
        }
    }
};

export default defineConfig(config);
