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
        'installation/pine',
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
        ['configuration/paperui', 'Paper UI'],
        ['configuration/ui/habmin/', 'HABmin'],
        ['configuration/ui/habot/', 'HABot'],
        'configuration/habpanel',
        ['configuration/ui/basic/', 'Basic UI'],
        ['configuration/ui/classic/', 'Classic UI'],
        'configuration/rules-ng',
        'configuration/eclipseiotmarket',
        ['configuration/restdocs', 'REST API'],
        'apps/android',
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
      ]
    },
    {
      title: 'Developer Guide',
      collapsable: false,
      children: [
        ['developer/', 'Development Overview'],
        'developer/contributing/contributing',
        'developer/contributing/governance',
        'developer/development/ide',
        'developer/development/guidelines',
        'developer/development/conventions', // from v2.3 onwards
        'developer/development/bindings',
        'developer/development/logging',
        'developer/development/compatibilitylayer',
      ]
    },
  ]
