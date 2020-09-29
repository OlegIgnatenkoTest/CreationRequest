package columns;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static requestCreationPageObject.DriverSettings.loginPage;

public class ColumnsTest extends columns.DriverSettings {

    @Test(priority = 1)
    public void loginAdmin() {
        loginPage.inputLogin(ConfProperties.getProperty("loginAdmin"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordAdmin"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void providerPanelClick() {
        columns.providerPanelClick();
    }

    @Test(priority = 3)
    public void clickContactPanel() {
        columns.contactPanelClick();
    }

    @Test(priority = 4)
    public void actionMenuClick() {
        columns.actionMenuClick();
    }

    @Test(priority = 5)
    public void dragAndDrop() {
        columns.dragOnTarget();
    }

    @Test(priority = 6)
    public void redBtnClick() {
        columns.redBtnClick();
    }

    @Test(priority = 7)
    public void backDragAndDrop() throws IOException {
        columns.backDragOnTarget();
    }

    @Test(priority = 8)
    public void backRedBtnClick() throws Exception {
        columns.redBtnClick();

    }
}
