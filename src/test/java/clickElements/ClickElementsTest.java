package clickElements;

import org.testng.annotations.Test;

public class ClickElementsTest extends DriverSettings {


    @Test(priority = 1)
    public void login() {
        loginPage.inputLogin(ConfProperties.getProperty("loginAdmin"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordAdmin"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)

    public void providersElements() {
        clickElementsPage.providerPanelClick();
        clickElementsPage.providersContactsSubPanelClick();
        clickElementsPage.nonCooperateSubPanelClick();
    }

    @Test(priority = 3)
    public void contractsElements() {
        clickElementsPage.contractPanelClick();
    }

    @Test(priority = 4)
    public void contractsRequests() {
        clickElementsPage.contractsRequestClick();
        clickElementsPage.contragentCheckRequestsClick();
        clickElementsPage.changeContractRequestSubPanel();
    }

    @Test(priority = 5)
    public void productsElements() {
        clickElementsPage.productsPanelClick();
    }

    @Test(priority = 6)
    public void userPanelElements() {
        clickElementsPage.usersPanelClick();
    }

    @Test(priority = 7)
    public void adminPanelElements() {
        clickElementsPage.administrationSubPanelClick();
    }

    @Test(priority = 8)
    public void userManagementElement() {
        clickElementsPage.userManagementClick();
    }

    @Test(priority = 9)
    public void roleManagementElement() {
        clickElementsPage.roleManagementClick();
    }

    @Test(priority = 10)
    public void passwordManagementElement() {
        clickElementsPage.passwordManagementClick();
    }

    @Test(priority = 11)
    public void securitygroupManagementElement() {
        clickElementsPage.securitygroupManagementClick();
    }

    @Test(priority = 11)
    public void securitygroupConfigElement() {
        clickElementsPage.securitygroupConfigClick();
    }
}
