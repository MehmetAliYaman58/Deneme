import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Searchbox extends BasePage{

    By aramaKutusuID = By.id("search");

    public Searchbox(WebDriver driver) {
        super(driver);
    }

    public void arama(String ceket) {
        write(aramaKutusuID , ceket);
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    }
}
