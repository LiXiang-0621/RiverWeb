var map;
const pos =  [[25.182407,121.409671,''],
    [25.182329,121.410456,''],
    [25.182091,121.411891,''],
    [25.181814,121.413112,''],
    [25.181115,121.417595,''],
    [25.178107,121.419628,''],
    [25.177512,121.419873,''],
    [25.175613,121.427954,''],
    [25.175162,121.430842,''],
    [25.17474,121.431227,''],
    [25.174497,121.431699,''],
    [25.174372,121.432158,''],
    [25.174305,121.432491,''],
    [25.174083,121.432949,''],
    [25.17391,121.433312,''],
    [25.173804,121.433532,''],
    [25.17386,121.433745,''],
    [25.17357816,121.4338415,'釣魚觀景平台'],
    [25.173471,121.435019,'barbershop前'],
    [25.172681,121.435301,'淡水長堤咖啡旁'],
    [25.172316,121.435876,''],
    [25.171891,121.436524,'水灣餐廳前'],
    [25.171637,121.437092,'馬偕上岸處'],
    [25.171081,121.437496,''],
    [25.170639,121.438084,''],
    [25.17046,121.43837,''],
    [25.170165,121.438768,''],
    [25.169776,121.439264,''],
    [25.169565,121.439815,''],
    [25.169179,121.440794,''],
    [25.169099,121.441118,''],
    [25.168737,121.441579,''],
    [25.168522,121.441888,''],
    [25.169323,121.442317,''],
    [25.167802,121.442672,''],
    [25.16752,121.443121,''],
    [25.167655,121.443438,''],
    [25.167749,121.44375,''],
    [25.166481,121.445197,''],
    [25.166228,121.445632,''],
    [25.131271,121.452161,''],
    [25.138801,121.450115,''],
    [25.143709,121.447682,''],
    [25.145009,121.446897,''],
    [25.152812,121.441797,''],
    [25.154567,121.440895,''],
    [25.159727,121.434249,''],
    [25.160271,121.433426,''],
    [25.160767,121.432671,''],
    [25.162204,121.426895,'']]

initMap();

function initMap() {
    map = new google.maps.Map(document.getElementById('map_div'), {
        center: { lat: 25.171637, lng: 121.437092 },
        zoom: 20
    });

    const markers = pos.map(element => {
        return new google.maps.Marker({
            position: { lat: element[0], lng: element[1] },
            map: map,
            title: element[2]
        });
    });

}