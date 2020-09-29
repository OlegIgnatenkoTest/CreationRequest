package columns;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.Result;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DriverSettings {
    public static Columns columns;
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
        columns = new Columns(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterTest
    public void tearDown(Result result) throws IOException{
        String filename = new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
        String location = "C:\\IDEA_Projects\\Screenshots";

        try {
            File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshots,
                    new File(location + filename + "_" + ".png"));
        } catch (Exception e){
            e.printStackTrace();
        }finally {
//            driver.quit();
        }

    }
}
