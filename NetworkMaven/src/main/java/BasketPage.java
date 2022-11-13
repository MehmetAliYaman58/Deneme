import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends BasePage {

    By ürününSepettekiID = new By.ByClassName("cartItem__title");
    By deleteIcon = By.className("cartItem__buttonText -remove");
    public boolean ürüneklendimi(){
       return ürünID().size() > 0;
    }

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> ürünID(){
        return findAll(ürününSepettekiID);
    }

    public void  sepetitemizle() {
        click(deleteIcon);

    }

}
