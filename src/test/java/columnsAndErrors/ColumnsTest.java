package columnsAndErrors;

import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import java.io.IOException;

@Owner("o.ignatenko")
public class ColumnsTest extends columnsAndErrors.DriverSettings {

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
    public void backRedBtnClick() {
        columns.redBtnClick();

    }
}
