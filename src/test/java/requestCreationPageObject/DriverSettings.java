package requestCreationPageObject;

import columns.Columns;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class DriverSettings {
    public static LoginPage loginPage;
    public static KM_Page kmPage;
    public static KLP_Page klpPage;
    public static HoD_Page hodPage;
    public static KMprime_Page kmprimePage;
    public static WebDriver driver;



    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 3000)", "");
    }

    public static void sleep() throws InterruptedException {
        Thread.sleep(2000L);
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        kmprimePage = new KMprime_Page(driver);
        kmPage = new KM_Page(driver);
        hodPage = new HoD_Page(driver);
        klpPage = new KLP_Page(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }
}
