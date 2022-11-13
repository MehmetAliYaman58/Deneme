
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    WebDriver driver;

    @BeforeAll
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver.get("http://www.Network.com.tr");

    }
    @AfterAll
    public void exit(){
        driver.quit();
    }
}
