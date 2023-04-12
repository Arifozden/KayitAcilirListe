$(function (){
    tumArabalariGetir();
});

function tumArabalariGetir(){
    $.get("/arabalariGetir",function (arabalar){
        duzenleArabalar(arabalar);
    });
}

function duzenleArabalar(arabalar){
    let yaz="<select id='seciliAraba'>";
    for(const araba of arabalar){
        yaz+="<option value='"+araba.marka+"'>"+araba.model+"</option>";
    }
    yaz+="</select>";
    $("#arabalar").html(yaz);
}

function musteriKayit(){
    const musteri={
        isim : $("#isim").val(),
        soyisim : $("#soyisim").val(),
        arabaMarka : $("#seciliAraba").val()
    };
    const url="/musteriKayit";
    $.post(url,musteri,function (){
        window.location.href='/';
    });
}