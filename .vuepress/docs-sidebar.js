module.exports = [
  {
    title: 'Welcome to openHAB',
    collapsable: false,
    children: [
      ''
    ]
  },
  {
    title: 'Beginner Tutorial',
    collapsable: false,
    children: [
      ['tutorial/', 'Tutorial Overview'],
      'tutorial/first_steps',
      'tutorial/things_simple',
      'tutorial/things_intermediate',
      'tutorial/things_advanced',
      'tutorial/model',
      'tutorial/persistence',
      /*'tutorial/pages_intro',
      'tutorial/pages_widgets',
      'tutorial/pages_types',
      'tutorial/rules_simple',
      'tutorial/rules_intermediate',
      'tutorial/cloud',
      'tutorial/example'*/
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
      // 'installation/qnap', // Remove until we get feedback about the current package state
      ['installation/security', 'Security']
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
      ['configuration/migration/', 'Migration from openHAB 2']
    ]
  },
  {
    title: 'Interfaces and Ecosystem',
    collapsable: false,
    children: [
      'configuration/editors',
      ['configuration/ui/habot/', 'HABot'],
      'configuration/habpanel',
      ['configuration/ui/basic/', 'Basic UI'],
      ['configuration/restdocs', 'REST API'],
      ['configuration/apitokens', 'API Token Generation'],
      ['apps/android', 'Android App'],
      'apps/ios',
      'apps/windows',
      ['ecosystem/alexa/', 'Amazon Alexa'],
      ['ecosystem/google-assistant/', 'Google Assistant'], // from v2.3 onwards
      ['../link/homekit/', 'Apple HomeKit'],
      // ['ecosystem/ifttt/', 'IFTTT'], // Temporary remove until service gets reactivated
      ['ecosystem/mycroft/', 'Mycroft.AI'],
      ['../link/openhabcloud/', 'openHAB Cloud'],
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
      {
        title: 'Javadoc',
        path: 'https://openhab.org/javadoc/latest/'
      }
    ]
  },
]
