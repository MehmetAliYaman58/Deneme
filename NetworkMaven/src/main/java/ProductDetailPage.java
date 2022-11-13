import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By detaySayfasıClassAdı = By.className("product__label -size");
    By sepeteEkleID = By.className("product__button -addToCart btn -black");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void sepeteekle() {
        click(sepeteEkleID);
    }

    public boolean üründetaylarımı() {
        return isDisplayed(detaySayfasıClassAdı);
    }
}
