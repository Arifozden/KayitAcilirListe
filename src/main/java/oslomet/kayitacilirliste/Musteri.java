package oslomet.kayitacilirliste;

public class Musteri {
    private String isim;
    private String soyisim;
    private String arabaMarka;

    public Musteri(String isim, String soyisim, String arabaMarka) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.arabaMarka = arabaMarka;
    }

    public Musteri(){}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getArabaMarka() {
        return arabaMarka;
    }

    public void setArabaMarka(String arabaMarka) {
        this.arabaMarka = arabaMarka;
    }
}
