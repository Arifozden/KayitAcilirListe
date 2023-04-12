$(function (){
    tumMusterileriGetir();
});

function tumMusterileriGetir(){
    $.get("/getirMusteriler",function (musteriler){
        duzenleMusteriler(musteriler);
    });
}

function duzenleMusteriler(musteriler){
    let yaz="<table class='table table-striped'>"+
        "<tr>"+
        "<th>Isim</th><th>Soyisim</th><th>Marka</th>"+
        "</tr>";
    for(const musteri of musteriler){
        yaz+="<tr>"+
            "<td>"+musteri.isim+"</td>"+
            "<td>"+musteri.soyisim+"</td>"+
            "<td>"+musteri.arabaMarka+"</td>"+
            "</tr>";
    }
    $("#musteriler").html(yaz);
}

function hepsiniSil(){
    $.get("/hepsiniSil",function (){
        window.location.href='/';
    });
}