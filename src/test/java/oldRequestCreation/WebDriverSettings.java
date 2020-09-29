package oldRequestCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings extends Constants {

    public WebDriver driver;

    public void loginAdmin(){
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys(ADMIN_LOGIN);

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys(ADMIN_PASSWORD);

        driver.findElement(By.id("bigbutton")).click();
    }

    public void loginKMprime(){
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys(KM_PRIME_LOGIN);

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys(KM_PRIME_PASSWORD);

        driver.findElement(By.id("bigbutton")).click();
    }

    public void loginKM() {
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys(KM_LOGIN);

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys(KM_PASSWORD);

        driver.findElement(By.id("bigbutton")).click();
    }

    public void loginKLP() {
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys(KLP_LOGIN);

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys(KLP_PASSWORD);

        driver.findElement(By.id("bigbutton")).click();
    }

    public void loginONKMain() {
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys(ONK_MAIN_LOGIN);

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys(ONK_MAIN_PASSWORD);

        driver.findElement(By.id("bigbutton")).click();
    }

    public void loginONKTest() {
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys(ONK_TEST_LOGIN);

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys(ONK_TEST_PASSWORD);

        driver.findElement(By.id("bigbutton")).click();
    }

    public void logout() throws InterruptedException {
        driver.findElement(By.id("with-label")).click();
        sleep();
        driver.findElement(By.xpath("//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='logout_link']")).click();
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(2000L);
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 3000)", "");
    }

    public void scrollUP(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-3000)", "");
    }

    public void turnBack(){
        driver.navigate().back();
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Start Test!");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://178.62.226.224/index.php?module=Users&action=Login");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeUp() throws InterruptedException {
        Thread.sleep(3000L);
        System.out.println("Test close!");
    }
}
