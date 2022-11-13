import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BasePage{


    By sepetIconSayısı = By.className("header__basket--count");
    By sepetIconID = By.className("header__icon -shoppingBag");
    Searchbox aramakutusu;

    public Homepage(WebDriver driver) {
        super(driver);
        aramakutusu = new Searchbox(driver);
    }

    public Searchbox aramakutusu() {
      return this.aramakutusu;
    }

    public boolean sepetarttı() {
        return getSepetIconSayısı() > 0;
    }
    private int getSepetIconSayısı(){
        String count = find(sepetIconSayısı).getText();
        return Integer.parseInt(count);
    }

    public void sepetegit() {
        click(sepetIconID);
    }

}

