---
title: oh-clock-card - Digital Clock Card
component: oh-clock-card
label: Digital Clock Card
description: Display a digital clock in a card
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-clock-card.md
prev: /docs/ui/components/
---

# oh-clock-card - Digital Clock Card

<!-- Put a screenshot here if relevant:
![](./images/oh-clock-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display a digital clock in a card
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Card
<div class="props">
<PropGroup name="card" label="Card">
  Parameters of the card
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the card
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="footer" label="Footer text">
  <PropDescription>
    Footer of the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noBorder" label="No Border">
  <PropDescription>
    Do not render the card border
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noShadow" label="No Shadow">
  <PropDescription>
    Do not render a shadow effect to the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="outline" label="Outline">
  <PropDescription>
    Show the card outline
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Clock
<div class="props">
<PropGroup name="clock" label="Clock">
<PropBlock type="TEXT" name="timeFormat" label="Time Format">
  <PropDescription>
    Time format, see <a class="external text-color-blue" target="_blank" href="https://day.js.org/docs/en/display/format">dayjs docs</a>
  </PropDescription>
  <PropOptions>
    <PropOption value="LTS" label="Localized time including seconds ('LTS', e.g. '8:02:18 PM')" />
    <PropOption value="LT" label="Localized time ('LT'. e.g. '8:02 PM')" />
    <PropOption value="HH:mm:ss" label="Current time ('HH:mm:ss')" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="timezone" label="Timezone">
  <PropDescription>
    Timezone to use for the clock.
  </PropDescription>
  <PropOptions>
    <PropOption value="Africa/Abidjan" label="Africa/Abidjan" />
    <PropOption value="Africa/Accra" label="Africa/Accra" />
    <PropOption value="Africa/Addis_Ababa" label="Africa/Addis_Ababa" />
    <PropOption value="Africa/Algiers" label="Africa/Algiers" />
    <PropOption value="Africa/Asmera" label="Africa/Asmera" />
    <PropOption value="Africa/Bamako" label="Africa/Bamako" />
    <PropOption value="Africa/Bangui" label="Africa/Bangui" />
    <PropOption value="Africa/Banjul" label="Africa/Banjul" />
    <PropOption value="Africa/Bissau" label="Africa/Bissau" />
    <PropOption value="Africa/Blantyre" label="Africa/Blantyre" />
    <PropOption value="Africa/Brazzaville" label="Africa/Brazzaville" />
    <PropOption value="Africa/Bujumbura" label="Africa/Bujumbura" />
    <PropOption value="Africa/Cairo" label="Africa/Cairo" />
    <PropOption value="Africa/Casablanca" label="Africa/Casablanca" />
    <PropOption value="Africa/Ceuta" label="Africa/Ceuta" />
    <PropOption value="Africa/Conakry" label="Africa/Conakry" />
    <PropOption value="Africa/Dakar" label="Africa/Dakar" />
    <PropOption value="Africa/Dar_es_Salaam" label="Africa/Dar_es_Salaam" />
    <PropOption value="Africa/Djibouti" label="Africa/Djibouti" />
    <PropOption value="Africa/Douala" label="Africa/Douala" />
    <PropOption value="Africa/El_Aaiun" label="Africa/El_Aaiun" />
    <PropOption value="Africa/Freetown" label="Africa/Freetown" />
    <PropOption value="Africa/Gaborone" label="Africa/Gaborone" />
    <PropOption value="Africa/Harare" label="Africa/Harare" />
    <PropOption value="Africa/Johannesburg" label="Africa/Johannesburg" />
    <PropOption value="Africa/Juba" label="Africa/Juba" />
    <PropOption value="Africa/Kampala" label="Africa/Kampala" />
    <PropOption value="Africa/Khartoum" label="Africa/Khartoum" />
    <PropOption value="Africa/Kigali" label="Africa/Kigali" />
    <PropOption value="Africa/Kinshasa" label="Africa/Kinshasa" />
    <PropOption value="Africa/Lagos" label="Africa/Lagos" />
    <PropOption value="Africa/Libreville" label="Africa/Libreville" />
    <PropOption value="Africa/Lome" label="Africa/Lome" />
    <PropOption value="Africa/Luanda" label="Africa/Luanda" />
    <PropOption value="Africa/Lubumbashi" label="Africa/Lubumbashi" />
    <PropOption value="Africa/Lusaka" label="Africa/Lusaka" />
    <PropOption value="Africa/Malabo" label="Africa/Malabo" />
    <PropOption value="Africa/Maputo" label="Africa/Maputo" />
    <PropOption value="Africa/Maseru" label="Africa/Maseru" />
    <PropOption value="Africa/Mbabane" label="Africa/Mbabane" />
    <PropOption value="Africa/Mogadishu" label="Africa/Mogadishu" />
    <PropOption value="Africa/Monrovia" label="Africa/Monrovia" />
    <PropOption value="Africa/Nairobi" label="Africa/Nairobi" />
    <PropOption value="Africa/Ndjamena" label="Africa/Ndjamena" />
    <PropOption value="Africa/Niamey" label="Africa/Niamey" />
    <PropOption value="Africa/Nouakchott" label="Africa/Nouakchott" />
    <PropOption value="Africa/Ouagadougou" label="Africa/Ouagadougou" />
    <PropOption value="Africa/Porto-Novo" label="Africa/Porto-Novo" />
    <PropOption value="Africa/Sao_Tome" label="Africa/Sao_Tome" />
    <PropOption value="Africa/Tripoli" label="Africa/Tripoli" />
    <PropOption value="Africa/Tunis" label="Africa/Tunis" />
    <PropOption value="Africa/Windhoek" label="Africa/Windhoek" />
    <PropOption value="America/Adak" label="America/Adak" />
    <PropOption value="America/Anchorage" label="America/Anchorage" />
    <PropOption value="America/Anguilla" label="America/Anguilla" />
    <PropOption value="America/Antigua" label="America/Antigua" />
    <PropOption value="America/Araguaina" label="America/Araguaina" />
    <PropOption value="America/Argentina/La_Rioja" label="America/Argentina/La_Rioja" />
    <PropOption value="America/Argentina/Rio_Gallegos" label="America/Argentina/Rio_Gallegos" />
    <PropOption value="America/Argentina/Salta" label="America/Argentina/Salta" />
    <PropOption value="America/Argentina/San_Juan" label="America/Argentina/San_Juan" />
    <PropOption value="America/Argentina/San_Luis" label="America/Argentina/San_Luis" />
    <PropOption value="America/Argentina/Tucuman" label="America/Argentina/Tucuman" />
    <PropOption value="America/Argentina/Ushuaia" label="America/Argentina/Ushuaia" />
    <PropOption value="America/Aruba" label="America/Aruba" />
    <PropOption value="America/Asuncion" label="America/Asuncion" />
    <PropOption value="America/Bahia" label="America/Bahia" />
    <PropOption value="America/Bahia_Banderas" label="America/Bahia_Banderas" />
    <PropOption value="America/Barbados" label="America/Barbados" />
    <PropOption value="America/Belem" label="America/Belem" />
    <PropOption value="America/Belize" label="America/Belize" />
    <PropOption value="America/Blanc-Sablon" label="America/Blanc-Sablon" />
    <PropOption value="America/Boa_Vista" label="America/Boa_Vista" />
    <PropOption value="America/Bogota" label="America/Bogota" />
    <PropOption value="America/Boise" label="America/Boise" />
    <PropOption value="America/Buenos_Aires" label="America/Buenos_Aires" />
    <PropOption value="America/Cambridge_Bay" label="America/Cambridge_Bay" />
    <PropOption value="America/Campo_Grande" label="America/Campo_Grande" />
    <PropOption value="America/Cancun" label="America/Cancun" />
    <PropOption value="America/Caracas" label="America/Caracas" />
    <PropOption value="America/Catamarca" label="America/Catamarca" />
    <PropOption value="America/Cayenne" label="America/Cayenne" />
    <PropOption value="America/Cayman" label="America/Cayman" />
    <PropOption value="America/Chicago" label="America/Chicago" />
    <PropOption value="America/Chihuahua" label="America/Chihuahua" />
    <PropOption value="America/Ciudad_Juarez" label="America/Ciudad_Juarez" />
    <PropOption value="America/Coral_Harbour" label="America/Coral_Harbour" />
    <PropOption value="America/Cordoba" label="America/Cordoba" />
    <PropOption value="America/Costa_Rica" label="America/Costa_Rica" />
    <PropOption value="America/Coyhaique" label="America/Coyhaique" />
    <PropOption value="America/Creston" label="America/Creston" />
    <PropOption value="America/Cuiaba" label="America/Cuiaba" />
    <PropOption value="America/Curacao" label="America/Curacao" />
    <PropOption value="America/Danmarkshavn" label="America/Danmarkshavn" />
    <PropOption value="America/Dawson" label="America/Dawson" />
    <PropOption value="America/Dawson_Creek" label="America/Dawson_Creek" />
    <PropOption value="America/Denver" label="America/Denver" />
    <PropOption value="America/Detroit" label="America/Detroit" />
    <PropOption value="America/Dominica" label="America/Dominica" />
    <PropOption value="America/Edmonton" label="America/Edmonton" />
    <PropOption value="America/Eirunepe" label="America/Eirunepe" />
    <PropOption value="America/El_Salvador" label="America/El_Salvador" />
    <PropOption value="America/Fort_Nelson" label="America/Fort_Nelson" />
    <PropOption value="America/Fortaleza" label="America/Fortaleza" />
    <PropOption value="America/Glace_Bay" label="America/Glace_Bay" />
    <PropOption value="America/Godthab" label="America/Godthab" />
    <PropOption value="America/Goose_Bay" label="America/Goose_Bay" />
    <PropOption value="America/Grand_Turk" label="America/Grand_Turk" />
    <PropOption value="America/Grenada" label="America/Grenada" />
    <PropOption value="America/Guadeloupe" label="America/Guadeloupe" />
    <PropOption value="America/Guatemala" label="America/Guatemala" />
    <PropOption value="America/Guayaquil" label="America/Guayaquil" />
    <PropOption value="America/Guyana" label="America/Guyana" />
    <PropOption value="America/Halifax" label="America/Halifax" />
    <PropOption value="America/Havana" label="America/Havana" />
    <PropOption value="America/Hermosillo" label="America/Hermosillo" />
    <PropOption value="America/Indiana/Knox" label="America/Indiana/Knox" />
    <PropOption value="America/Indiana/Marengo" label="America/Indiana/Marengo" />
    <PropOption value="America/Indiana/Petersburg" label="America/Indiana/Petersburg" />
    <PropOption value="America/Indiana/Tell_City" label="America/Indiana/Tell_City" />
    <PropOption value="America/Indiana/Vevay" label="America/Indiana/Vevay" />
    <PropOption value="America/Indiana/Vincennes" label="America/Indiana/Vincennes" />
    <PropOption value="America/Indiana/Winamac" label="America/Indiana/Winamac" />
    <PropOption value="America/Indianapolis" label="America/Indianapolis" />
    <PropOption value="America/Inuvik" label="America/Inuvik" />
    <PropOption value="America/Iqaluit" label="America/Iqaluit" />
    <PropOption value="America/Jamaica" label="America/Jamaica" />
    <PropOption value="America/Jujuy" label="America/Jujuy" />
    <PropOption value="America/Juneau" label="America/Juneau" />
    <PropOption value="America/Kentucky/Monticello" label="America/Kentucky/Monticello" />
    <PropOption value="America/Kralendijk" label="America/Kralendijk" />
    <PropOption value="America/La_Paz" label="America/La_Paz" />
    <PropOption value="America/Lima" label="America/Lima" />
    <PropOption value="America/Los_Angeles" label="America/Los_Angeles" />
    <PropOption value="America/Louisville" label="America/Louisville" />
    <PropOption value="America/Lower_Princes" label="America/Lower_Princes" />
    <PropOption value="America/Maceio" label="America/Maceio" />
    <PropOption value="America/Managua" label="America/Managua" />
    <PropOption value="America/Manaus" label="America/Manaus" />
    <PropOption value="America/Marigot" label="America/Marigot" />
    <PropOption value="America/Martinique" label="America/Martinique" />
    <PropOption value="America/Matamoros" label="America/Matamoros" />
    <PropOption value="America/Mazatlan" label="America/Mazatlan" />
    <PropOption value="America/Mendoza" label="America/Mendoza" />
    <PropOption value="America/Menominee" label="America/Menominee" />
    <PropOption value="America/Merida" label="America/Merida" />
    <PropOption value="America/Metlakatla" label="America/Metlakatla" />
    <PropOption value="America/Mexico_City" label="America/Mexico_City" />
    <PropOption value="America/Miquelon" label="America/Miquelon" />
    <PropOption value="America/Moncton" label="America/Moncton" />
    <PropOption value="America/Monterrey" label="America/Monterrey" />
    <PropOption value="America/Montevideo" label="America/Montevideo" />
    <PropOption value="America/Montserrat" label="America/Montserrat" />
    <PropOption value="America/Nassau" label="America/Nassau" />
    <PropOption value="America/New_York" label="America/New_York" />
    <PropOption value="America/Nome" label="America/Nome" />
    <PropOption value="America/Noronha" label="America/Noronha" />
    <PropOption value="America/North_Dakota/Beulah" label="America/North_Dakota/Beulah" />
    <PropOption value="America/North_Dakota/Center" label="America/North_Dakota/Center" />
    <PropOption value="America/North_Dakota/New_Salem" label="America/North_Dakota/New_Salem" />
    <PropOption value="America/Ojinaga" label="America/Ojinaga" />
    <PropOption value="America/Panama" label="America/Panama" />
    <PropOption value="America/Paramaribo" label="America/Paramaribo" />
    <PropOption value="America/Phoenix" label="America/Phoenix" />
    <PropOption value="America/Port-au-Prince" label="America/Port-au-Prince" />
    <PropOption value="America/Port_of_Spain" label="America/Port_of_Spain" />
    <PropOption value="America/Porto_Velho" label="America/Porto_Velho" />
    <PropOption value="America/Puerto_Rico" label="America/Puerto_Rico" />
    <PropOption value="America/Punta_Arenas" label="America/Punta_Arenas" />
    <PropOption value="America/Rankin_Inlet" label="America/Rankin_Inlet" />
    <PropOption value="America/Recife" label="America/Recife" />
    <PropOption value="America/Regina" label="America/Regina" />
    <PropOption value="America/Resolute" label="America/Resolute" />
    <PropOption value="America/Rio_Branco" label="America/Rio_Branco" />
    <PropOption value="America/Santarem" label="America/Santarem" />
    <PropOption value="America/Santiago" label="America/Santiago" />
    <PropOption value="America/Santo_Domingo" label="America/Santo_Domingo" />
    <PropOption value="America/Sao_Paulo" label="America/Sao_Paulo" />
    <PropOption value="America/Scoresbysund" label="America/Scoresbysund" />
    <PropOption value="America/Sitka" label="America/Sitka" />
    <PropOption value="America/St_Barthelemy" label="America/St_Barthelemy" />
    <PropOption value="America/St_Johns" label="America/St_Johns" />
    <PropOption value="America/St_Kitts" label="America/St_Kitts" />
    <PropOption value="America/St_Lucia" label="America/St_Lucia" />
    <PropOption value="America/St_Thomas" label="America/St_Thomas" />
    <PropOption value="America/St_Vincent" label="America/St_Vincent" />
    <PropOption value="America/Swift_Current" label="America/Swift_Current" />
    <PropOption value="America/Tegucigalpa" label="America/Tegucigalpa" />
    <PropOption value="America/Thule" label="America/Thule" />
    <PropOption value="America/Tijuana" label="America/Tijuana" />
    <PropOption value="America/Toronto" label="America/Toronto" />
    <PropOption value="America/Tortola" label="America/Tortola" />
    <PropOption value="America/Vancouver" label="America/Vancouver" />
    <PropOption value="America/Whitehorse" label="America/Whitehorse" />
    <PropOption value="America/Winnipeg" label="America/Winnipeg" />
    <PropOption value="America/Yakutat" label="America/Yakutat" />
    <PropOption value="Antarctica/Casey" label="Antarctica/Casey" />
    <PropOption value="Antarctica/Davis" label="Antarctica/Davis" />
    <PropOption value="Antarctica/DumontDUrville" label="Antarctica/DumontDUrville" />
    <PropOption value="Antarctica/Macquarie" label="Antarctica/Macquarie" />
    <PropOption value="Antarctica/Mawson" label="Antarctica/Mawson" />
    <PropOption value="Antarctica/McMurdo" label="Antarctica/McMurdo" />
    <PropOption value="Antarctica/Palmer" label="Antarctica/Palmer" />
    <PropOption value="Antarctica/Rothera" label="Antarctica/Rothera" />
    <PropOption value="Antarctica/Syowa" label="Antarctica/Syowa" />
    <PropOption value="Antarctica/Troll" label="Antarctica/Troll" />
    <PropOption value="Antarctica/Vostok" label="Antarctica/Vostok" />
    <PropOption value="Arctic/Longyearbyen" label="Arctic/Longyearbyen" />
    <PropOption value="Asia/Aden" label="Asia/Aden" />
    <PropOption value="Asia/Almaty" label="Asia/Almaty" />
    <PropOption value="Asia/Amman" label="Asia/Amman" />
    <PropOption value="Asia/Anadyr" label="Asia/Anadyr" />
    <PropOption value="Asia/Aqtau" label="Asia/Aqtau" />
    <PropOption value="Asia/Aqtobe" label="Asia/Aqtobe" />
    <PropOption value="Asia/Ashgabat" label="Asia/Ashgabat" />
    <PropOption value="Asia/Atyrau" label="Asia/Atyrau" />
    <PropOption value="Asia/Baghdad" label="Asia/Baghdad" />
    <PropOption value="Asia/Bahrain" label="Asia/Bahrain" />
    <PropOption value="Asia/Baku" label="Asia/Baku" />
    <PropOption value="Asia/Bangkok" label="Asia/Bangkok" />
    <PropOption value="Asia/Barnaul" label="Asia/Barnaul" />
    <PropOption value="Asia/Beirut" label="Asia/Beirut" />
    <PropOption value="Asia/Bishkek" label="Asia/Bishkek" />
    <PropOption value="Asia/Brunei" label="Asia/Brunei" />
    <PropOption value="Asia/Calcutta" label="Asia/Calcutta" />
    <PropOption value="Asia/Chita" label="Asia/Chita" />
    <PropOption value="Asia/Colombo" label="Asia/Colombo" />
    <PropOption value="Asia/Damascus" label="Asia/Damascus" />
    <PropOption value="Asia/Dhaka" label="Asia/Dhaka" />
    <PropOption value="Asia/Dili" label="Asia/Dili" />
    <PropOption value="Asia/Dubai" label="Asia/Dubai" />
    <PropOption value="Asia/Dushanbe" label="Asia/Dushanbe" />
    <PropOption value="Asia/Famagusta" label="Asia/Famagusta" />
    <PropOption value="Asia/Gaza" label="Asia/Gaza" />
    <PropOption value="Asia/Hebron" label="Asia/Hebron" />
    <PropOption value="Asia/Hong_Kong" label="Asia/Hong_Kong" />
    <PropOption value="Asia/Hovd" label="Asia/Hovd" />
    <PropOption value="Asia/Irkutsk" label="Asia/Irkutsk" />
    <PropOption value="Asia/Jakarta" label="Asia/Jakarta" />
    <PropOption value="Asia/Jayapura" label="Asia/Jayapura" />
    <PropOption value="Asia/Jerusalem" label="Asia/Jerusalem" />
    <PropOption value="Asia/Kabul" label="Asia/Kabul" />
    <PropOption value="Asia/Kamchatka" label="Asia/Kamchatka" />
    <PropOption value="Asia/Karachi" label="Asia/Karachi" />
    <PropOption value="Asia/Katmandu" label="Asia/Katmandu" />
    <PropOption value="Asia/Khandyga" label="Asia/Khandyga" />
    <PropOption value="Asia/Krasnoyarsk" label="Asia/Krasnoyarsk" />
    <PropOption value="Asia/Kuala_Lumpur" label="Asia/Kuala_Lumpur" />
    <PropOption value="Asia/Kuching" label="Asia/Kuching" />
    <PropOption value="Asia/Kuwait" label="Asia/Kuwait" />
    <PropOption value="Asia/Macau" label="Asia/Macau" />
    <PropOption value="Asia/Magadan" label="Asia/Magadan" />
    <PropOption value="Asia/Makassar" label="Asia/Makassar" />
    <PropOption value="Asia/Manila" label="Asia/Manila" />
    <PropOption value="Asia/Muscat" label="Asia/Muscat" />
    <PropOption value="Asia/Nicosia" label="Asia/Nicosia" />
    <PropOption value="Asia/Novokuznetsk" label="Asia/Novokuznetsk" />
    <PropOption value="Asia/Novosibirsk" label="Asia/Novosibirsk" />
    <PropOption value="Asia/Omsk" label="Asia/Omsk" />
    <PropOption value="Asia/Oral" label="Asia/Oral" />
    <PropOption value="Asia/Phnom_Penh" label="Asia/Phnom_Penh" />
    <PropOption value="Asia/Pontianak" label="Asia/Pontianak" />
    <PropOption value="Asia/Pyongyang" label="Asia/Pyongyang" />
    <PropOption value="Asia/Qatar" label="Asia/Qatar" />
    <PropOption value="Asia/Qostanay" label="Asia/Qostanay" />
    <PropOption value="Asia/Qyzylorda" label="Asia/Qyzylorda" />
    <PropOption value="Asia/Rangoon" label="Asia/Rangoon" />
    <PropOption value="Asia/Riyadh" label="Asia/Riyadh" />
    <PropOption value="Asia/Saigon" label="Asia/Saigon" />
    <PropOption value="Asia/Sakhalin" label="Asia/Sakhalin" />
    <PropOption value="Asia/Samarkand" label="Asia/Samarkand" />
    <PropOption value="Asia/Seoul" label="Asia/Seoul" />
    <PropOption value="Asia/Shanghai" label="Asia/Shanghai" />
    <PropOption value="Asia/Singapore" label="Asia/Singapore" />
    <PropOption value="Asia/Srednekolymsk" label="Asia/Srednekolymsk" />
    <PropOption value="Asia/Taipei" label="Asia/Taipei" />
    <PropOption value="Asia/Tashkent" label="Asia/Tashkent" />
    <PropOption value="Asia/Tbilisi" label="Asia/Tbilisi" />
    <PropOption value="Asia/Tehran" label="Asia/Tehran" />
    <PropOption value="Asia/Thimphu" label="Asia/Thimphu" />
    <PropOption value="Asia/Tokyo" label="Asia/Tokyo" />
    <PropOption value="Asia/Tomsk" label="Asia/Tomsk" />
    <PropOption value="Asia/Ulaanbaatar" label="Asia/Ulaanbaatar" />
    <PropOption value="Asia/Urumqi" label="Asia/Urumqi" />
    <PropOption value="Asia/Ust-Nera" label="Asia/Ust-Nera" />
    <PropOption value="Asia/Vientiane" label="Asia/Vientiane" />
    <PropOption value="Asia/Vladivostok" label="Asia/Vladivostok" />
    <PropOption value="Asia/Yakutsk" label="Asia/Yakutsk" />
    <PropOption value="Asia/Yekaterinburg" label="Asia/Yekaterinburg" />
    <PropOption value="Asia/Yerevan" label="Asia/Yerevan" />
    <PropOption value="Atlantic/Azores" label="Atlantic/Azores" />
    <PropOption value="Atlantic/Bermuda" label="Atlantic/Bermuda" />
    <PropOption value="Atlantic/Canary" label="Atlantic/Canary" />
    <PropOption value="Atlantic/Cape_Verde" label="Atlantic/Cape_Verde" />
    <PropOption value="Atlantic/Faeroe" label="Atlantic/Faeroe" />
    <PropOption value="Atlantic/Madeira" label="Atlantic/Madeira" />
    <PropOption value="Atlantic/Reykjavik" label="Atlantic/Reykjavik" />
    <PropOption value="Atlantic/South_Georgia" label="Atlantic/South_Georgia" />
    <PropOption value="Atlantic/St_Helena" label="Atlantic/St_Helena" />
    <PropOption value="Atlantic/Stanley" label="Atlantic/Stanley" />
    <PropOption value="Australia/Adelaide" label="Australia/Adelaide" />
    <PropOption value="Australia/Brisbane" label="Australia/Brisbane" />
    <PropOption value="Australia/Broken_Hill" label="Australia/Broken_Hill" />
    <PropOption value="Australia/Darwin" label="Australia/Darwin" />
    <PropOption value="Australia/Eucla" label="Australia/Eucla" />
    <PropOption value="Australia/Hobart" label="Australia/Hobart" />
    <PropOption value="Australia/Lindeman" label="Australia/Lindeman" />
    <PropOption value="Australia/Lord_Howe" label="Australia/Lord_Howe" />
    <PropOption value="Australia/Melbourne" label="Australia/Melbourne" />
    <PropOption value="Australia/Perth" label="Australia/Perth" />
    <PropOption value="Australia/Sydney" label="Australia/Sydney" />
    <PropOption value="Europe/Amsterdam" label="Europe/Amsterdam" />
    <PropOption value="Europe/Andorra" label="Europe/Andorra" />
    <PropOption value="Europe/Astrakhan" label="Europe/Astrakhan" />
    <PropOption value="Europe/Athens" label="Europe/Athens" />
    <PropOption value="Europe/Belgrade" label="Europe/Belgrade" />
    <PropOption value="Europe/Berlin" label="Europe/Berlin" />
    <PropOption value="Europe/Bratislava" label="Europe/Bratislava" />
    <PropOption value="Europe/Brussels" label="Europe/Brussels" />
    <PropOption value="Europe/Bucharest" label="Europe/Bucharest" />
    <PropOption value="Europe/Budapest" label="Europe/Budapest" />
    <PropOption value="Europe/Busingen" label="Europe/Busingen" />
    <PropOption value="Europe/Chisinau" label="Europe/Chisinau" />
    <PropOption value="Europe/Copenhagen" label="Europe/Copenhagen" />
    <PropOption value="Europe/Dublin" label="Europe/Dublin" />
    <PropOption value="Europe/Gibraltar" label="Europe/Gibraltar" />
    <PropOption value="Europe/Guernsey" label="Europe/Guernsey" />
    <PropOption value="Europe/Helsinki" label="Europe/Helsinki" />
    <PropOption value="Europe/Isle_of_Man" label="Europe/Isle_of_Man" />
    <PropOption value="Europe/Istanbul" label="Europe/Istanbul" />
    <PropOption value="Europe/Jersey" label="Europe/Jersey" />
    <PropOption value="Europe/Kaliningrad" label="Europe/Kaliningrad" />
    <PropOption value="Europe/Kiev" label="Europe/Kiev" />
    <PropOption value="Europe/Kirov" label="Europe/Kirov" />
    <PropOption value="Europe/Lisbon" label="Europe/Lisbon" />
    <PropOption value="Europe/Ljubljana" label="Europe/Ljubljana" />
    <PropOption value="Europe/London" label="Europe/London" />
    <PropOption value="Europe/Luxembourg" label="Europe/Luxembourg" />
    <PropOption value="Europe/Madrid" label="Europe/Madrid" />
    <PropOption value="Europe/Malta" label="Europe/Malta" />
    <PropOption value="Europe/Mariehamn" label="Europe/Mariehamn" />
    <PropOption value="Europe/Minsk" label="Europe/Minsk" />
    <PropOption value="Europe/Monaco" label="Europe/Monaco" />
    <PropOption value="Europe/Moscow" label="Europe/Moscow" />
    <PropOption value="Europe/Oslo" label="Europe/Oslo" />
    <PropOption value="Europe/Paris" label="Europe/Paris" />
    <PropOption value="Europe/Podgorica" label="Europe/Podgorica" />
    <PropOption value="Europe/Prague" label="Europe/Prague" />
    <PropOption value="Europe/Riga" label="Europe/Riga" />
    <PropOption value="Europe/Rome" label="Europe/Rome" />
    <PropOption value="Europe/Samara" label="Europe/Samara" />
    <PropOption value="Europe/San_Marino" label="Europe/San_Marino" />
    <PropOption value="Europe/Sarajevo" label="Europe/Sarajevo" />
    <PropOption value="Europe/Saratov" label="Europe/Saratov" />
    <PropOption value="Europe/Simferopol" label="Europe/Simferopol" />
    <PropOption value="Europe/Skopje" label="Europe/Skopje" />
    <PropOption value="Europe/Sofia" label="Europe/Sofia" />
    <PropOption value="Europe/Stockholm" label="Europe/Stockholm" />
    <PropOption value="Europe/Tallinn" label="Europe/Tallinn" />
    <PropOption value="Europe/Tirane" label="Europe/Tirane" />
    <PropOption value="Europe/Ulyanovsk" label="Europe/Ulyanovsk" />
    <PropOption value="Europe/Vaduz" label="Europe/Vaduz" />
    <PropOption value="Europe/Vatican" label="Europe/Vatican" />
    <PropOption value="Europe/Vienna" label="Europe/Vienna" />
    <PropOption value="Europe/Vilnius" label="Europe/Vilnius" />
    <PropOption value="Europe/Volgograd" label="Europe/Volgograd" />
    <PropOption value="Europe/Warsaw" label="Europe/Warsaw" />
    <PropOption value="Europe/Zagreb" label="Europe/Zagreb" />
    <PropOption value="Europe/Zurich" label="Europe/Zurich" />
    <PropOption value="Indian/Antananarivo" label="Indian/Antananarivo" />
    <PropOption value="Indian/Chagos" label="Indian/Chagos" />
    <PropOption value="Indian/Christmas" label="Indian/Christmas" />
    <PropOption value="Indian/Cocos" label="Indian/Cocos" />
    <PropOption value="Indian/Comoro" label="Indian/Comoro" />
    <PropOption value="Indian/Kerguelen" label="Indian/Kerguelen" />
    <PropOption value="Indian/Mahe" label="Indian/Mahe" />
    <PropOption value="Indian/Maldives" label="Indian/Maldives" />
    <PropOption value="Indian/Mauritius" label="Indian/Mauritius" />
    <PropOption value="Indian/Mayotte" label="Indian/Mayotte" />
    <PropOption value="Indian/Reunion" label="Indian/Reunion" />
    <PropOption value="Pacific/Apia" label="Pacific/Apia" />
    <PropOption value="Pacific/Auckland" label="Pacific/Auckland" />
    <PropOption value="Pacific/Bougainville" label="Pacific/Bougainville" />
    <PropOption value="Pacific/Chatham" label="Pacific/Chatham" />
    <PropOption value="Pacific/Easter" label="Pacific/Easter" />
    <PropOption value="Pacific/Efate" label="Pacific/Efate" />
    <PropOption value="Pacific/Enderbury" label="Pacific/Enderbury" />
    <PropOption value="Pacific/Fakaofo" label="Pacific/Fakaofo" />
    <PropOption value="Pacific/Fiji" label="Pacific/Fiji" />
    <PropOption value="Pacific/Funafuti" label="Pacific/Funafuti" />
    <PropOption value="Pacific/Galapagos" label="Pacific/Galapagos" />
    <PropOption value="Pacific/Gambier" label="Pacific/Gambier" />
    <PropOption value="Pacific/Guadalcanal" label="Pacific/Guadalcanal" />
    <PropOption value="Pacific/Guam" label="Pacific/Guam" />
    <PropOption value="Pacific/Honolulu" label="Pacific/Honolulu" />
    <PropOption value="Pacific/Kiritimati" label="Pacific/Kiritimati" />
    <PropOption value="Pacific/Kosrae" label="Pacific/Kosrae" />
    <PropOption value="Pacific/Kwajalein" label="Pacific/Kwajalein" />
    <PropOption value="Pacific/Majuro" label="Pacific/Majuro" />
    <PropOption value="Pacific/Marquesas" label="Pacific/Marquesas" />
    <PropOption value="Pacific/Midway" label="Pacific/Midway" />
    <PropOption value="Pacific/Nauru" label="Pacific/Nauru" />
    <PropOption value="Pacific/Niue" label="Pacific/Niue" />
    <PropOption value="Pacific/Norfolk" label="Pacific/Norfolk" />
    <PropOption value="Pacific/Noumea" label="Pacific/Noumea" />
    <PropOption value="Pacific/Pago_Pago" label="Pacific/Pago_Pago" />
    <PropOption value="Pacific/Palau" label="Pacific/Palau" />
    <PropOption value="Pacific/Pitcairn" label="Pacific/Pitcairn" />
    <PropOption value="Pacific/Ponape" label="Pacific/Ponape" />
    <PropOption value="Pacific/Port_Moresby" label="Pacific/Port_Moresby" />
    <PropOption value="Pacific/Rarotonga" label="Pacific/Rarotonga" />
    <PropOption value="Pacific/Saipan" label="Pacific/Saipan" />
    <PropOption value="Pacific/Tahiti" label="Pacific/Tahiti" />
    <PropOption value="Pacific/Tarawa" label="Pacific/Tarawa" />
    <PropOption value="Pacific/Tongatapu" label="Pacific/Tongatapu" />
    <PropOption value="Pacific/Truk" label="Pacific/Truk" />
    <PropOption value="Pacific/Wake" label="Pacific/Wake" />
    <PropOption value="Pacific/Wallis" label="Pacific/Wallis" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="dateFormat" label="Date Format">
  <PropDescription>
    Date format, see <a class="external text-color-blue" target="_blank" href="https://day.js.org/docs/en/display/format">dayjs docs</a>
  </PropDescription>
  <PropOptions>
    <PropOption value="LL" label="Localized long date ('LL', e.g. 'August 16, 2018')" />
    <PropOption value="L" label="Localized short date ('L', e.g. '08/16/2018')" />
    <PropOption value="MM/DD/YYYY" label="Current date ('MM/DD/YYYY')" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="timeFontSize" label="Time Font Size">
  <PropDescription>
    Time font size (e.g. "34px")
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="timeFontWeight" label="Time Font Weight">
  <PropDescription>
    Time font weight (e.g. "normal" or "bold")
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="showDate" label="Show the date">
  <PropDescription>
    Show the current date in addition to the time
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="datePos" label="Date Position">
  <PropDescription>
    Where to show the date
  </PropDescription>
  <PropOptions>
    <PropOption value="above" label="Above time" />
    <PropOption value="below" label="Below time" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="dateFontSize" label="Date Font Size">
  <PropDescription>
    Date font size (e.g. "34px")
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="dateFontWeight" label="Date Font Weight">
  <PropDescription>
    Date font weight (e.g. "normal" or "bold")
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Action
<div class="props">
<PropGroup name="actions" label="Action">
  Action to perform when the clock is clicked
<PropBlock type="TEXT" name="action" label="Action">
  <PropDescription>
    Type of action to perform
  </PropDescription>
  <PropOptions multiple="true">
    <PropOption value="navigate" label="Navigate to page" />
    <PropOption value="command" label="Send command" />
    <PropOption value="toggle" label="Toggle Item" />
    <PropOption value="options" label="Command options" />
    <PropOption value="rule" label="Run scene, script or rule" />
    <PropOption value="popup" label="Open popup" />
    <PropOption value="popover" label="Open popover" />
    <PropOption value="sheet" label="Open sheet" />
    <PropOption value="photos" label="Open photo browser" />
    <PropOption value="group" label="Group details" />
    <PropOption value="analyzer" label="Analyze item(s)" />
    <PropOption value="url" label="Navigate to external URL" />
    <PropOption value="http" label="Send HTTP request" />
    <PropOption value="variable" label="Set Variable" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionUrl" label="Action URL" context="url">
  <PropDescription>
    URL to navigate to or to send HTTP request to
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="actionUrlSameWindow" label="Open in same tab/window">
  <PropDescription>
    Open the URL in the same tab/window instead of a new one. This will exit the app.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionHttpMethod" label="HTTP Method">
  <PropDescription>
    HTTP method to use for the request
  </PropDescription>
  <PropOptions>
    <PropOption value="GET" label="GET" />
    <PropOption value="POST" label="POST" />
    <PropOption value="PUT" label="PUT" />
    <PropOption value="DELETE" label="DELETE" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionHttpBody" label="HTTP Body">
  <PropDescription>
    Body to send with the request
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionItem" label="Action Item" context="item">
  <PropDescription>
    Item to perform the action on
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionCommand" label="Action Command">
  <PropDescription>
    Command to send to the Item. If "Toggle Item" is selected as the action, only send the command when the state is different
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionCommandAlt" label="Action Toggle Command">
  <PropDescription>
    Command to send to the Item when "Toggle Item" is selected as the action, and the Item's state is equal to the command above
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionOptions" label="Command Options">
  <PropDescription>
    Comma-separated list of options; if omitted, retrieve the command options from the Item dynamically. Use <code>value=label</code> format to provide a label different than the option.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionRule" label="Scene, Script or Rule" context="rule">
  <PropDescription>
    Scene, Script or Rule to run
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionRuleContext" label="Context" context="script">
  <PropDescription>
    Object representing the optional context to pass. Edit in YAML or provide a JSON object, e.g. <code>{ "param1": "value1", "param2": { "subkey1": "testing", "subkey2": 123 } }</code>.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPage" label="Page" context="page">
  <PropDescription>
    Page to navigate to
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPageDefineVars" label="Define Page Variables">
  <PropDescription>
    An object <code>{ [variableName]: [variableValue] }</code> where <code>variableValue</code> also supports expressions
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPageTransition" label="Transition Effect">
  <PropDescription>
    Use a specific <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/view.html#custom-page-transitions">page transition animation</a>
  </PropDescription>
  <PropOptions>
    <PropOption value="f7-circle" label="Circle" />
    <PropOption value="f7-cover" label="Cover" />
    <PropOption value="f7-cover-v" label="Cover from bottom" />
    <PropOption value="f7-dive" label="Dive" />
    <PropOption value="f7-fade" label="Fade" />
    <PropOption value="f7-flip" label="Flip" />
    <PropOption value="f7-parallax" label="Parallax" />
    <PropOption value="f7-push" label="Push" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionModal" label="Modal Page or Widget" context="pagewidget">
  <PropDescription>
    Page or widget to display in the modal
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionModalConfig" label="Modal component configuration" context="props">
  <PropDescription>
    Configuration (prop values) for the target modal page or widget
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPhotos" label="Images to show">
  <PropDescription>
    Array of URLs or objects representing the images. Auto-refresh is not supported.<br />Edit in YAML, e.g.<br /><code><pre>- item: ImageItem1<br />  caption: Camera</pre></code>or provide a JSON array, e.g.<br /><code>[ "url1", { "item": "ImageItem1", "caption": "Camera" } ]</code><br />Objects are in the <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/photo-browser.html#photos-array">photos array format</a> with an additional <code>item</code> property to specify an item to view.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionPhotoBrowserConfig" label="Photo browser configuration">
  <PropDescription>
    Configuration for the photo browser.<br />Edit in YAML or provide a JSON object, e.g.<br /><code>{ "exposition": false, "type": "popup", "theme": "dark" }</code><br /> See <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/photo-browser.html#photo-browser-parameters">photo browser parameters</a> (not all are supported).
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionGroupPopupItem" label="Group Popup Item" context="item">
  <PropDescription>
    Group Item whose members to show in a popup
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerItems" label="Item(s) to Analyze" required="true" context="item">
  <PropDescription>
    Start analyzing with the specified (set of) Item(s)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerChartType" label="Chart Type">
  <PropDescription>
    The initial analyzing period - dynamic or a predefined fixed period: day, week, month or year
  </PropDescription>
  <PropOptions>
    <PropOption value="(empty)" label="Dynamic" />
    <PropOption value="day" label="Day" />
    <PropOption value="isoWeek" label="Week (starting on Mondays)" />
    <PropOption value="month" label="Month" />
    <PropOption value="year" label="Year" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerCoordSystem" label="Initial Coordinate System">
  <PropDescription>
    The initial coordinate system of the analyzer - time, aggregate or calendar (only time is supported for dynamic periods)
  </PropDescription>
  <PropOptions>
    <PropOption value="time" label="Time" />
    <PropOption value="aggregate" label="Aggregate" />
    <PropOption value="calendar" label="Calendar" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionAnalyzerAggregation" label="Initial Aggregation">
  <PropDescription>
    The initial aggregation of the analyzer - 
  </PropDescription>
  <PropOptions>
    <PropOption value="average" label="Average" />
    <PropOption value="sum" label="Sum" />
    <PropOption value="min" label="Minimum" />
    <PropOption value="max" label="Maximum" />
    <PropOption value="first" label="First (earliest)" />
    <PropOption value="last" label="Last (latest)" />
    <PropOption value="diff_first" label="Difference of firsts" />
    <PropOption value="diff_last" label="Difference of lasts" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="actionConfirmation" label="Action Confirmation">
  <PropDescription>
    Shows a dialog or sheet to ask for confirmation before the action is executed. Can either be a text to show in the dialog or a JSON object <code>{ type: "dialog", title: "Confirm", text: "Are you sure?" }</code> or <code>{ type: "sheet", text: "Confirm", color: "green" }</code>
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionFeedback" label="Action Feedback">
  <PropDescription>
    Shows a toast popup when the action has been executed. Can either be a text to show or a JSON object including some of the <a class="external text-color-blue" target="_blank" href="https://framework7.io/docs/toast.html#toast-parameters">supported parameters</a>
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionVariable" label="Variable">
  <PropDescription>
    The variable name to set
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionVariableValue" label="Variable Value">
  <PropDescription>
    The value to set the variable to
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="actionVariableKey" label="Variable Key">
  <PropDescription>
    Consider the variable value is an object and set the corresponding deep property within that object using a key syntax. Examples: <code>user.name</code>, <code>user[0].address[1].street</code>, <code>[0]</code>, <code>[0].label</code>. The inner property and its parent hierarchy will be created if missing.
  </PropDescription>
</PropBlock>
</PropGroup>
</div>


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-clock-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-clock-card/example1.jpg)

```yaml
component: oh-clock-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-clock-card/example2.jpg)

::: details YAML
```yaml
component: oh-clock-card
config:
  prop1: value1
  prop2: value2
slots
```
:::

-->

<!-- Try to clean up URLs to the forum (https://community.openhab.org/t/<threadID>[/<postID>] should suffice)
## Community Resources

- [Community Post 1](https://community.openhab.org/t/12345)
- [Community Post 2](https://community.openhab.org/t/23456)
-->
