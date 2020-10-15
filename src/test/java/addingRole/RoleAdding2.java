package addingRole;

import oldRequestCreation.WebDriverSettings;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class RoleAdding2 extends WebDriverSettings {

    // 1

    @Test(priority = 1)
    public void adminEnterTest() {
        loginAdmin();
    }

    @Test(priority = 2)
    public void createUserTest() {
        driver.findElement(By.xpath("//button[@id='with-label']//span[contains(text(),'Administrator')]")).click();
        driver.findElement(By.xpath("//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='admin_link']")).click();
        driver.findElement(By.id("user_management")).click();
        driver.findElement(By.xpath("//li[1]//a[1]//div[2]")).click();
        driver.findElement(By.id("user_name")).sendKeys("test23");
        driver.findElement(By.id("last_name")).sendKeys("test23");
        driver.findElement(By.id("Users0emailAddress0")).sendKeys("test@gmail.com");
        driver.findElement(By.id("tab2")).click();
        driver.findElement(By.id("new_password")).sendKeys("123");
        driver.findElement(By.id("confirm_pwd")).sendKeys("123");
        driver.findElement(By.id("SAVE_HEADER")).click();
    }

    @Test(priority = 3)
    public void addingRole() throws InterruptedException {

        boolean addRole_btn = driver.findElement(By.xpath(ADD_ROLE_BUTTON)).isDisplayed();
        System.out.println("Наличие кнопки 'Назначить роль': " + addRole_btn);
        sleep();

        driver.findElement(By.xpath(ADD_ROLE_BUTTON)).click();
        //driver.findElement(By.id(ADD_ROLE_BUTTON)).click();
        driver.findElement(By.xpath(KM_ROLE)).click();
        driver.findElement(By.id("user_title")).sendKeys("Boss");
        driver.findElement(By.id("user_department")).click();
        driver.findElement(By.xpath("//select[@id='user_department']//option[2]\n")).click();
        driver.findElement(By.id("btn_reports_to_name")).click();

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parentWindow = itr.next();
        String newWindow = itr.next();

        driver.switchTo().window(newWindow);

        scrollDown();

        driver.findElement(By.xpath("//tr[15]//td[1]//a[1]")).click();
        driver.switchTo().window(parentWindow);

        sleep();

        driver.findElement(By.cssSelector("#addRoleForm > div > div > div:nth-child(5) > input[type=button]:nth-child(1)")).click();
    }

    @Test(priority = 4)
    public void rolePanelTest() {
        boolean rolePanel = driver.findElement(By.id(ROLE_SUBPANEL)).isDisplayed();
        System.out.println("Наличие панели 'Роли': " + rolePanel);
    }

    @Test(priority = 5)
    public void roleTest() throws InterruptedException {
        driver.findElement(By.id("subpanel_title_aclroles")).click();

        String role = driver.findElement(By.linkText("КМ")).getText();
        System.out.println("Role: " + role);
        Assert.assertEquals(role, "КМ");

        sleep();
        logout();
    }


    // 2
    @Test(priority = 6)
    public void replacementAddTest(){
        loginKMprime();

        driver.findElement(By.xpath("//button[@id='with-label']")).click();
        driver.findElement(By.xpath("//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='employees_link']")).click();
        driver.findElement(By.xpath("//tr[1]//td[1]//table[1]//tbody[1]//tr[1]//td[1]//ul[1]//li[1]//a[1]")).click();
        driver.findElement(By.xpath("//input[@id='full_name_advanced']")).clear();
        driver.findElement(By.xpath("//input[@id='full_name_advanced']")).sendKeys("test23");
        scrollDown();
        driver.findElement(By.xpath("//input[@id='search_form_submit_advanced']")).click();
        driver.findElement(By.cssSelector("#MassUpdate > table > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(2) > span")).click();
    }

    @Test(priority = 7)
    public void replacementBtnTest(){
        boolean replacement_btn = driver.findElement(By.xpath("//div[@class='buttons']//input")).isDisplayed();
        System.out.println("Наличие кнопки 'Назначить замещение': " + replacement_btn);
    }

    @Test(priority = 8)
    public void replacementTest() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='buttons']//input")).click();
        driver.findElement(By.xpath("//body//option[2]")).click();
        driver.findElement(By.xpath("//button[@id='btn_alternate_user_name']")).click();

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parentWindow = itr.next();
        String newWindow = itr.next();

        driver.switchTo().window(newWindow);

        scrollDown();

        driver.findElement(By.xpath("//tr[10]//td[1]")).click();
        driver.switchTo().window(parentWindow);

        sleep();

        driver.findElement(By.xpath("//div[@class='arcticmodal-container']//div[5]//input[1]")).click();
    }

    @Test(priority = 9)
    public void statusTest(){
        String status = driver.findElement(By.xpath("//div[@class='detail-view']//div[2]//div[1]//div[2]")).getText();
        System.out.println(status);
        Assert.assertEquals(status, "Тимчасова відсутність");
    }

    @Test(priority = 10)
    public void periodTest() throws InterruptedException {
        boolean period = driver.findElement(By.xpath("//div[@class='tab-content']//div[3]//div[1]//div[2]")).getText().isEmpty();
        System.out.println("Field is empty: " + period);
        logout();
    }

//    @Test(priority = 11)
//    public void userDeleteTest() throws InterruptedException {
//        loginAdmin();
//        driver.findElement(By.xpath("//button[@id='with-label']//span[contains(text(),'Administrator')]")).click();
//        driver.findElement(By.xpath("//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='employees_link']")).click();
//        driver.findElement(By.xpath("//td[contains(@class,'inlineEdit')]//b")).click();
//        driver.findElement(By.id("delete_button")).click();
//
//        driver.switchTo().alert().accept();
//        sleep();
//
//        logout();
//    }



}
