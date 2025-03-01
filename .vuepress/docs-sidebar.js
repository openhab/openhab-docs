module.exports = [
  {
    title: 'Welcome to openHAB',
    collapsable: false,
    children: [
      ''
    ]
  },
  {
      title: 'Getting Started',
      collapsable: false,
      children: [
        ['tutorial/', 'Tutorial Overview'],
        'tutorial/first_steps',
        { title: 'Adding Things',
          children: [
            'tutorial/things_simple',
            'tutorial/things_intermediate',
            'tutorial/things_advanced',
          ]
        },
        'tutorial/model',
        'tutorial/persistence',
        { title: 'Pages',
          children: [
            'tutorial/pages_intro',
            'tutorial/auto_overview',
            'tutorial/item_widgets',
            'tutorial/custom_widgets'
          ]
        },
        { title: 'Rules',
          children: [
            'tutorial/rules_introduction',
            'tutorial/rules_overview',
            'tutorial/rules_basic',
            'tutorial/rules_blockly',
            'tutorial/rules_advanced',
            'tutorial/rules_scenes',
          ]
        },
        'tutorial/tips-and-tricks'
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
      { title: 'openHABian',
        children: [
          'installation/openhabian',
          'installation/openhabian-troubleshooting',
          'installation/openhabian-backup',
          'installation/openhabian-exim',
        ]
      },
      'installation/armbian',
      'installation/docker',
      'installation/synology',
      ['installation/security', 'Security'],
      ['installation/reverse-proxy', 'Reverse Proxy']
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
      'concepts/units-of-measurement',
      'concepts/rules',
    ]
  },
  {
    title: 'Configuration Guide',
    collapsable: false,
    children: [
      { title: 'Configuration Overview',
        path: '/docs/configuration/',
        children: [
          'configuration/editors',
          'configuration/addons',
          'configuration/things',
          'configuration/items',
          'configuration/persistence',
          'configuration/rules-dsl',
          'configuration/transformations',
          { title: 'Blockly Rules',
            path: '/docs/configuration/blockly/',
            children: [
              ['configuration/blockly/rules-blockly-items-things', 'Items & Things'],
              ['configuration/blockly/rules-blockly-timers-and-delays', 'Timers & Delays'],
              ['configuration/blockly/rules-blockly-voice-and-multimedia', 'Voice & Multimedia'],
              ['configuration/blockly/rules-blockly-uom', 'Units of Measurements'],
              ['configuration/blockly/rules-blockly-date-handling', 'Date Handling'],
              ['configuration/blockly/rules-blockly-ephemeris', 'Ephemeris'],
              ['configuration/blockly/rules-blockly-notifications', 'Notifications'],
              ['configuration/blockly/rules-blockly-persistence', 'Persistence'],
              ['configuration/blockly/rules-blockly-value-storage', 'Value Storage'],
              ['configuration/blockly/rules-blockly-run-and-process', 'Run & Process'],
              ['configuration/blockly/rules-blockly-logging', 'Logging'],
              ['configuration/blockly/rules-blockly-standard-ext', 'Standard Extensions'],
            ]
          },
        ]
      },
      'configuration/actions',
      'configuration/jsr223',
      'configuration/iconsets/classic/',
      'configuration/services',
      'configuration/multimedia',
      ['configuration/restdocs', 'REST API'],
      ['configuration/websocket', 'WebSocket API'],
      ['configuration/apitokens', 'API Token Generation'],
      ['configuration/migration/', 'Migration from openHAB 2']
    ]
  },
  {
    title: 'Main UI',
    collapsable: false,
    children: [
      ['mainui/', 'Overview'],
      { title: 'Settings',
        path: '/docs/mainui/settings/',
        children: [
          ['mainui/settings/things', 'Things'],
          ['mainui/settings/model', 'Model'],
          ['mainui/settings/items', 'Items'],
          ['mainui/settings/pages', 'Pages'],
          ['mainui/settings/transformations', 'Transformations'],
          ['mainui/settings/persistence', 'Persistence'],
          ['mainui/settings/rules', 'Rules'],
          ['mainui/settings/scenes', 'Scenes'],
          ['mainui/settings/scripts', 'Scripts'],
          ['mainui/settings/schedule', 'Schedule']
        ]
      },
      ['mainui/addons', 'Add-on Store'],
      { title: 'Developer Tools',
        path: '/docs/mainui/developer/',
        children: [
          ['mainui/developer/sidebar', 'Developer Sidebar'],
          ['mainui/developer/widgets', 'Widgets']
        ]
      },
      ['mainui/about', 'Help & About'],
    ]
  },
  {
    title: 'User Interface Guide',
    collapsable: false,
    children: [
      'ui/',
      'ui/sitemaps',
      { title: 'Pages',
        children: [
          { title: 'Layout Pages',
            collapsable: true,
            path: '/docs/ui/layout-pages',
            children: [
              ['/docs/ui/layout-pages-responsive', 'Responsive Layouts'],
              ['/docs/ui/layout-pages-fixed', 'Fixed Layouts']
            ]
          },
          'ui/map-pages',
          'ui/floorplan-pages',
          'ui/tabbed-pages',
          'ui/chart-pages',
          ['ui/building-pages', 'Building Pages'],
        ]
      },
      { title: 'Creating Personal Widgets',
        path: '/docs/ui/personal-widgets',
        children: [
          ['ui/widget-expressions-variables', 'Widget Expressions & Variables'],
          ['ui/css-pages-widgets', 'Styling Pages & Widgets']
        ]
      },
      ['ui/components/', 'Component Reference'],
      'ui/habpanel/habpanel',
      ['apps/android', 'Android App'],
      'apps/ios',
      'apps/windows'
    ]
  },
  {
    title: 'Ecosystem',
    collapsable: false,
    children: [
      ['ecosystem/alexa/', 'Amazon Alexa'],
      ['ecosystem/google-assistant/', 'Google Assistant'],
      ['../addons/integrations/homekit/', 'Apple HomeKit'],
      // ['ecosystem/ifttt/', 'IFTTT'], // Temporary remove until service gets reactivated
      ['ecosystem/mycroft/', 'Mycroft.AI'],
      ['../addons/integrations/openhabcloud/', 'openHAB Cloud'],
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
    collapsable: true,
    children: [
      ['developer/', 'Overview & Introduction'],
      { title: 'IDEs',
        collapsable: true,
        children: [
          'developer/ide/eclipse',
          'developer/ide/intellij',
          'developer/ide/vscode',
          'developer/ide/generic',
        ]
      },
      'developer/guidelines',
      'developer/addons/',
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
    collapsable: true,
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
