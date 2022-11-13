import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CeketPage extends BasePage{

    By ürünsayfasıİD = By.id("product");
    By ürünİD = By.id("product-id");

    public CeketPage(WebDriver driver) {
        super(driver);
    }

    public boolean doğrusayfa() {
        return isDisplayed(ürünsayfasıİD);
    }

    public void ceketseç(int i) {
        bütünCeketler().get(i).click();

    }

    private List<WebElement> bütünCeketler(){
        return bütünCeketler();
    }
}
