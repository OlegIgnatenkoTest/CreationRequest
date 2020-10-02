package clickElements;

import oldRequestCreation.WebDriverSettings;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickElements extends WebDriverSettings {

    @Test(priority = 1)
    public void adminLogin() {
        loginAdmin();
    }

    @Test(priority = 2)
    public void providersWorkCheck() throws InterruptedException {
        driver.findElement(By.id(PROVIDERS)).click();
        driver.findElement(By.cssSelector(PROVIDERS_SUB)).click();
        sleep();
        turnBack();

        driver.findElement(By.id(PROVIDERS)).click();
        driver.findElement(By.xpath(CONTACTS)).click();
        sleep();
        turnBack();

        driver.findElement(By.id(PROVIDERS)).click();
        driver.findElement(By.xpath(NON_COOPERATE)).click();
        sleep();
        turnBack();

        driver.findElement(By.id(PROVIDERS)).click();
        driver.findElement(By.xpath(MAIN_PAGE_PROV)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 3)
    public void contractWorkCheck() throws InterruptedException {
        driver.findElement(By.id(CONTRACTS)).click();
        driver.findElement(By.xpath(CONTRACTS_SUB)).click();
        sleep();
        turnBack();

        driver.findElement(By.id(CONTRACTS)).click();
   //     driver.findElement(By.xpath(CONTRAGENT_REQUESTS)).click();
        sleep();
        turnBack();

        driver.findElement(By.id(CONTRACTS)).click();
        driver.findElement(By.xpath(MAIN_PAGE_CONTR)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 4)
    public void productsCheck() throws InterruptedException {
        driver.findElement(By.id(PRODUCTS)).click();
        driver.findElement(By.xpath(PRODUCTS_SUB)).click();
        sleep();
        turnBack();

        driver.findElement(By.id(PRODUCTS)).click();
        driver.findElement(By.xpath(MAIN_PAGE_PROD)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 5)
    public void userPanelCheck() {
        driver.findElement(By.xpath(USER_PANEL)).click();
    }

    @Test(priority = 6)
    public void userPanelProfileCheck() throws InterruptedException {
        driver.findElement(By.xpath(USER_PANEL)).click();
        driver.findElement(By.xpath(USER_PANEL_PROFILE)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 7)
    public void userPanelWorkersCheck() throws InterruptedException {
        driver.findElement(By.xpath(USER_PANEL)).click();
        driver.findElement(By.xpath(USER_PANEL_WORKERS)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 8)
    public void userPanelHelpCheck() throws InterruptedException {
        driver.findElement(By.xpath(USER_PANEL)).click();
        driver.findElement(By.xpath(USER_PANEL_HELP)).click();
        sleep();
        turnBack();
    }
    @Test(priority = 9)
    public void userPanelAdditionalCheck() throws InterruptedException {
        driver.findElement(By.xpath(USER_PANEL)).click();
        driver.findElement(By.xpath(USER_PANEL_ADDITIONAL)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 10)
    public void userPanelAdministrationCheck() throws InterruptedException {
        driver.findElement(By.xpath(USER_PANEL)).click();
        driver.findElement(By.xpath(USER_PANEL_ADMINISTRATION)).click();
        sleep();
    }

    @Test(priority = 11)
    public void administrationUserControlCheck() throws InterruptedException {
        driver.findElement(By.xpath(USERS_CONTROL)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 12)
    public void administrationRoleControlCheck() throws InterruptedException {
        driver.findElement(By.xpath(ROLE_CONTROL)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 13)
    public void administrationPasswordControlCheck() throws InterruptedException {
        driver.findElement(By.xpath(PASSWORD_CONTROL)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 14)
    public void administrationUsersGroupControlCheck() throws InterruptedException {
        driver.findElement(By.xpath(USERS_GROUPS_CONTROL)).click();
        sleep();
        turnBack();
    }

    @Test(priority = 15)
    public void administrationUsersSettingsControl() throws InterruptedException {
        driver.findElement(By.xpath(USERS_GROUPS_SETTINGS)).click();
        sleep();
        turnBack();
    }
}
