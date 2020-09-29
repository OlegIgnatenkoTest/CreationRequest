package columns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import oldRequestCreation.WebDriverSettings;

public class ColumnsCheck extends WebDriverSettings {

    @Test(priority = 1)
    public void login_Test() {
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys("admin");

        driver.findElement(By.id("username_password")).clear();
        driver.findElement(By.id("username_password")).sendKeys("ma!R45Re74A");

        driver.findElement(By.id("bigbutton")).click();
    }

    @Test(priority = 2)
    public void contactsViewTest() throws InterruptedException {
        driver.findElement(By.xpath("//li[3]//a[1]//div[2]")).click();

        driver.findElement(By.xpath("//ul[@class='clickMenu selectmenu SugarActionMenu columnsFilterLink listViewLinkButton listViewLinkButton_top']//a[@class='glyphicon glyphicon-th-list']")).click();

        sleep();
        WebElement draggable = driver.findElement(By.xpath("//ul[@class='chooserList red ui-sortable']//li[1]"));
        WebElement target = driver.findElement(By.xpath("//ul[@class='chooserList green ui-sortable']"));
        new Actions(driver).dragAndDrop(draggable, target).perform();
        sleep();

        driver.findElement(By.xpath("//button[@class='button red']")).click();
    }

    @Test(priority = 3)
    public void contactsViewBackTest() throws InterruptedException {
        sleep();
        driver.findElement(By.xpath("//ul[@class='clickMenu selectmenu SugarActionMenu columnsFilterLink listViewLinkButton listViewLinkButton_top']//a[@class='glyphicon glyphicon-th-list']")).click();
        sleep();
        WebElement draggable2 = driver.findElement(By.xpath("//div[@id='columnsFilterDialog']//li[4]"));
        WebElement target2 = driver.findElement(By.xpath("//ul[@class='chooserList red ui-sortable']"));
        new Actions(driver).dragAndDrop(draggable2, target2).perform();
        sleep();

        driver.findElement(By.xpath("//button[@class='button red']")).click();
    }

}
