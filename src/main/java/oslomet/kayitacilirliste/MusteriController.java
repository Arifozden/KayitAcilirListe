package oslomet.kayitacilirliste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MusteriController {

    private final List<Musteri> musteriler = new ArrayList<>();

    @GetMapping("getirMusteriler")
    public List<Musteri> tumMusteriler(){
        return musteriler;
    }

@GetMapping("arabalariGetir")
    public List<Araba> arabalariGetir(){
        List<Araba> listArabalar=new ArrayList<>();
        listArabalar.add(new Araba("Audi","A4"));
        listArabalar.add(new Araba("Volvo","T8"));
        listArabalar.add(new Araba("Toyota","Yaris"));
        return listArabalar;
    }

    @PostMapping("musteriKayit")
    public void musteriEkle(Musteri girMusteri){
        musteriler.add(girMusteri);
    }

    @GetMapping("hepsiniSil")
    public void hepsiniSil(){
        musteriler.clear();
    }


}
