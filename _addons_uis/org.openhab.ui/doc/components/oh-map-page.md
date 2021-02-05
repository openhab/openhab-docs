# oh-map-page - Map page

<!-- GENERATED componentDescription -->
Displays markers on a map
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

- `initialCenter` <small>TEXT</small> _Initial Center_

  The center to use when no markers are present or have valid positions

- `initialZoom` <small>TEXT</small> _Initial Zoom Level_

  The zoom level to use when no markers are present or have valid positions

- `noZoomOrDrag` <small>BOOLEAN</small> _Disable Zooming & Dragging_

  Disable the ability to zoom and drag

- `noZoomAnimation` <small>BOOLEAN</small> _No Zoom Animation_

  Change zoom levels without animation, can also avoid graphic glitches with persistent tooltips

- `noMarkerZoomAnimation` <small>BOOLEAN</small> _Hide Markers during Zoom Animation_

- `tileLayerProvider` <small>TEXT</small> _Provider for the background tiles_

  The provider of tiles to use for the background of the map. Use one from <a class="external text-color-blue" target="_blank" href="http://leaflet-extras.github.io/leaflet-providers/preview/">Leaflet Providers</a>, Some providers will not work until you set options, like access tokens, in the <code>tileLayerProviderOptions</code> parameter (in Code view). See <a class="external text-color-blue" target="_blank" href="https://github.com/leaflet-extras/leaflet-providers#providers-requiring-registration">here</a> for more info. The default is CartoDB, the variant depending on the dark mode setting.

- `overlayTileLayerProvider` <small>TEXT</small> _Provider for the overlay tiles_

  The provider of tiles to use for the overlay layer above the background of the map. Use one from <a class="external text-color-blue" target="_blank" href="http://leaflet-extras.github.io/leaflet-providers/preview/">Leaflet Providers</a>, Some providers will not work until you set options, like access tokens, in the <code>overlayTileLayerProviderOptions</code> parameter (in Code view). See <a class="external text-color-blue" target="_blank" href="https://github.com/leaflet-extras/leaflet-providers#providers-requiring-registration">here</a> for more info. 

<!-- GENERATED /props -->
