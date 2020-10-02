package clickElements;

import columnsAndErrors.ConfProperties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class DriverSettings {
    public static ClickElementsPage clickElementsPage;
    public static LoginPage loginPage;
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
        clickElementsPage = new ClickElementsPage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }
}
