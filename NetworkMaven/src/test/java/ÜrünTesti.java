
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ÜrünTesti {

    Homepage anasayfa;
    CeketPage ceketPage;
    ProductDetailPage ürünDetayları;
    BasketPage basketPage;



    @Test
    public void Arama(){
        anasayfa.aramakutusu().arama("ceket");
        Assertions.assertTrue(ceketPage.doğrusayfa(), "Ürün Sayfasında Değilsiniz");

    }
    @Test
    public void ÜrünSeç(){
        ceketPage.ceketseç(1);
        Assertions.assertTrue(ürünDetayları.üründetaylarımı(), "Alakası Yok");

    }
    @Test
    public void SepeteEkle(){
        ürünDetayları.sepeteekle();
        Assertions.assertTrue(anasayfa.sepetarttı(), "Sepet Artmadı");
    }
    @Test
    public void SepeteGit(){
        anasayfa.sepetegit();
        Assertions.assertTrue(basketPage.ürüneklendimi(), "Eklenmedi");

    }
    @Test
    public void SepettekiÜrünüÇıkar(){
        anasayfa.sepetegit();
        Assertions.assertTrue(basketPage.sepetitemizle());

    }

}
