module.exports = [
  {
    title: 'Welcome to openHAB',
    collapsable: false,
    children: [
      ''
    ]
  },
  {
    title: 'Concepts',
    collapsable: false,
    children: [
      ['concepts/', 'Concepts Overview'],
      'concepts/things',
      'concepts/items',
      'concepts/discovery',
      'concepts/audio',
      'concepts/units-of-measurement',  // from v2.3 onwards
    ]
  },
  {
    title: 'Installation Guide',
    collapsable: false,
    children: [
      'installation/',
      ['installation/linux', 'Linux'],
      ['installation/windows', 'Windows'],
      ['installation/macos', 'macOS'],
      'installation/openhabian',
      'installation/rasppi',
      'installation/armbian',
      'installation/docker',
      'installation/synology',
      'installation/qnap',
      ['installation/security', 'Security']
    ]
  },
  {
    title: 'New User Tutorial',
    collapsable: false,
    children: [
      ['tutorial/', 'Tutorial Overview'],
      'tutorial/1sttimesetup',
      'tutorial/uis',
      'tutorial/configuration',
      'tutorial/sitemap',
      'tutorial/rules',
      'tutorial/logs',
      ['tutorial/persistence', 'Persistence']
    ]
  },
  {
    title: 'Configuration Guide',
    collapsable: false,
    children: [
      ['configuration/', 'Configuration Overview'],
      'configuration/addons',
      'configuration/things',
      'configuration/items',
      'configuration/sitemaps',
      'configuration/persistence',
      'configuration/rules-dsl',
      'configuration/transformations',
      'configuration/actions',
      'configuration/iconsets/classic/',
      'configuration/jsr223',
      'configuration/services',
      'configuration/multimedia',
      ['configuration/migration/', 'Migration from 1.x']
    ]
  },
  {
    title: 'Interfaces and Ecosystem',
    collapsable: false,
    children: [
      'configuration/packages',
      'configuration/editors',
      'configuration/homebuilder',
      ['configuration/ui/habot/', 'HABot'],
      'configuration/habpanel',
      ['configuration/ui/basic/', 'Basic UI'],
      'configuration/rules-ng',
      ['apps/android', 'Android App'],
      'apps/ios',
      'apps/windows',
      ['ecosystem/alexa/', 'Amazon Alexa'],
      ['ecosystem/google-assistant/', 'Google Assistant'], // from v2.3 onwards
      ['../addons/integrations/homekit/', 'Apple HomeKit'],
      ['ecosystem/ifttt/', 'IFTTT'],
      ['ecosystem/mycroft/', 'Mycroft.AI'],
    ]
  },
  {
    title: 'Administration Guide',
    collapsable: false,
    children: [
      'administration/',
      'administration/console',
      'administration/runtime',
      'administration/bundles',
      'administration/logging',
      'administration/jsondb',
      'administration/serial'
    ]
  },
  {
    title: 'Developer Guide',
    collapsable: false,
    children: [
      ['developer/', 'Overview & Introduction'],
      'developer/guidelines',
      'developer/bindings/',
      'developer/module-types/',
      'developer/transformations/',
      'developer/ioservices/',
      'developer/persistence/',
      'developer/audio/',
    ]
  },
  {
    title: 'Developer Appendix',
    collapsable: false,
    children: [
      'developer/buildsystem',
      'developer/osgi/osgi',
      'developer/utils/tools',
      'developer/utils/i18n',
      'developer/utils/events',
      'developer/tests',
      'developer/contributing',
      'developer/governance',
      'developer/legacy/compatibilitylayer',
      {
        title: 'Javadoc',
        path: 'https://next.openhab.org/javadoc/latest/'
      }
    ]
  },
]
