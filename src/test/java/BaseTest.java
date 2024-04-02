import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public static WebDriver webDriver;
    public static WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.out.println("Opening Chrome browser...");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Desktop\\chromedriver-win64.exe");
        webDriver = new ChromeDriver();

    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        if(webDriver != null) {
            webDriver.quit();
            System.out.println("Closing Chrome browser!");
        }
    }

}
