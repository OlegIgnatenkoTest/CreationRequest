package columnsAndErrors;

import io.qameta.allure.Owner;
import org.testng.annotations.Test;

@Owner("o.ignatenko")
public class ErrorMessagesTest extends DriverSettings {

    @Test(priority = 1)
    public void login() {
        loginPage.inputLogin(ConfProperties.getProperty("loginAdmin"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordAdmin"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void contactClick() {
        errorsMessageCheck.contactsClick();
    }

    @Test(priority = 3)
    public void contactRemoveBtnClick() {
        errorsMessageCheck.contactsRemoveBtnClick();
    }

    @Test(priority = 4)
    public void contactEmailBtnClick() {
        errorsMessageCheck.contactsEmailBtnClick();
    }

    @Test(priority = 5)
    public void saveBtnClick() {
        errorsMessageCheck.saveBtnClick();
    }

    @Test(priority = 6)
    public void tabContentCheck() {
        errorsMessageCheck.tabContentCheck();
    }
}
