$(function() {

    // World Map
  var mapData = {
    "US": 7402,
    'RU': 5105,
    "AU": 4700,
    "CN": 4650,
    "FR": 3800,
    "DE": 3780,
    "GB": 2400,
    "SA": 2350,
    "BR": 2270,
    "IN": 1870,
  }
  $('#world-map').vectorMap({
    map: 'world_mill_en',
    backgroundColor: 'transparent',
    regionStyle: {
        initial: {
            fill: '#DADDE0',
        }
    },
    showTooltip: true,
    onRegionTipShowx: function(e, el, code){
        el.html(el.html()+' (Visits - '+mapData[code]+')');
    },
    markerStyle: {
      initial: {
        fill  : '#3498db',
        stroke: '#333'
      }
    },
    markers: [
      {
        latLng: [1.3, 103.8],
        name: 'Japan : ${JapanTotal}'
      },
      {
        latLng: [38, -105],
        name: 'USA : ${USATotal}',
      },
      {
        latLng: [58, -115],
        name: 'Canada : ${CanTotal}',
      },
      {
        latLng: [-25, 140],
        name: 'Australia : ${AusTotal}',
      },
      {
        latLng: [55.00, -3.50],
        name: 'UK : ${UKTotal}',
      },
      {
        latLng: [21, 78],
        name: 'France : ${FranceTotal}',
      },
    ]
  });

  




});