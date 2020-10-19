package addingRole;

import org.testng.annotations.Test;

public class AddingRoleTest extends DriverSettings {

    @Test(priority = 1)
    public void login() {
        loginPage.inputLogin(ConfProperties.getProperty("loginAdmin"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordAdmin"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void userCreation() {
        addingRolePage.administratorPanelBtnClick();
        addingRolePage.administrationPanelBtnClick();
        addingRolePage.userManagementLinkClick();
        addingRolePage.createUserBtnClick();
        addingRolePage.userNameFieldFill(ConfProperties.getProperty("exText"));
        addingRolePage.lastNameFieldFill(ConfProperties.getProperty("exText"));
        addingRolePage.userEmailFieldFill(ConfProperties.getProperty("exEmail"));
        addingRolePage.passwordPanelClick();
        addingRolePage.newPasswordFieldFill(ConfProperties.getProperty("smallNumb"));
        addingRolePage.confirmPasswordFieldFill(ConfProperties.getProperty("smallNumb"));
        addingRolePage.saveBtnClick();
    }

    @Test(priority = 3)
    public void roleManagement() throws InterruptedException {
        addingRolePage.addRoleBtnIsDisplayed();
        addingRolePage.reportToNameBtnClick();
        addingRolePage.userRoleElementChoose();
        addingRolePage.userTitleFieldFill(ConfProperties.getProperty("exText"));
        addingRolePage.userDepartmentElementClick();
        addingRolePage.chooseLeadBtnClick();
        addingRolePage.leadChoosing();
    }

    @Test(priority = 4)
    public void subpanelTitleIsDisplayed() {
        addingRolePage.subpanelTitleIsDisplayed();
    }

    @Test(priority = 5)
    public void roleCheck() throws InterruptedException {
        addingRolePage.roleCheck();
        addingRolePage.logout();
        sleep();
    }

    @Test(priority = 6)
    public void replacementAdd() {
        loginPage.inputLogin(ConfProperties.getProperty("loginKMprime"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKMprime"));
        loginPage.clickLoginBtn();

        addingRolePage.administratorBtnClick();
        addingRolePage.dropdownUserMenuClick();
        addingRolePage.filterBtnClick();
        addingRolePage.fullNameFilterFill(ConfProperties.getProperty("exText"));
        addingRolePage.searchBtnClick();
        addingRolePage.tableElementClick();
    }

    @Test(priority = 7)
    public void replacement(){
        addingRolePage.replacementBtnIsDisplayedClick();
        addingRolePage.option2Click();
    }
}
