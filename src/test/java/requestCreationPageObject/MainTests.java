package requestCreationPageObject;

import org.testng.annotations.Test;

public class MainTests extends DriverSettings {

    @Test(priority = 1)
    public void loginKM() {
        loginPage.inputLogin(ConfProperties.getProperty("loginKM"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKM"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void kmContractsClick() {
        kmPage.contractsPanelClick();
        kmPage.contractsRequestsClick();
    }

    @Test(priority = 3)
    public void kmProvidersChoose() {
        kmPage.openFilterClick();
        kmPage.providerNameFieldFill("Рияд Рамирес аль Хасар");
        kmPage.searchBtnClick();
        kmPage.taleElementClick();
    }

    @Test(priority = 4)
    public void kmCreateRequestBtnClick() throws InterruptedException {
        kmPage.createRequestBtnClick();
        kmPage.kmBtnClick();

        kmPage.contractReason();

        kmPage.contractTemplatesClick();

        kmPage.contractRegistrationNumber(ConfProperties.getProperty("contNumb"));
        kmPage.startDateTriggerClick();
        kmPage.startDayClick();
        kmPage.endDateTriggerClick();
        kmPage.endDayClick();

//        kmPage.delayFieldFill(ConfProperties.getProperty("smallNumb"));
//        kmPage.discountFieldFill(ConfProperties.getProperty("smallNumb"));
//        kmPage.postponementFieldFill(ConfProperties.getProperty("smallNumb"));
//        kmPage.contractIsTypicalClick();
//        kmPage.refundCompensationFieldFill(ConfProperties.getProperty("smallNumb"));
//        kmPage.logisticsFieldFill(ConfProperties.getProperty("smallNumb"));
//        kmPage.promotionFieldFill(ConfProperties.getProperty("smallNumb"));
//        kmPage.reductionDiscountFieldFill(ConfProperties.getProperty("smallNumb"));
//
//
//        kmPage.accounterNameFieldFill(ConfProperties.getProperty("exText"));
//        kmPage.atbAddressFieldFill(ConfProperties.getProperty("exText"));
//        kmPage.atbEmailFieldFill(ConfProperties.getProperty("exEmail"));
//        kmPage.fullNameDiscountAccFieldFill(ConfProperties.getProperty("exText"));
//        kmPage.fullNameDocsAccFieldFill(ConfProperties.getProperty("exText"));

        kmPage.setContractIsTypical();
        kmPage.setPostponementField(ConfProperties.getProperty("smallNumb"));
        kmPage.setDelayField(ConfProperties.getProperty("smallNumb"));
        kmPage.setDiscountPercent(ConfProperties.getProperty("smallNumb"));
        kmPage.setLogisticsField(ConfProperties.getProperty("smallNumb"));
        kmPage.setPromotionField(ConfProperties.getProperty("smallNumb"));
        kmPage.setRefundSupply(ConfProperties.getProperty("smallNumb"));
        kmPage.reductionDiscount(ConfProperties.getProperty("smallNumb"));
        kmPage.setAtbAccounter(ConfProperties.getProperty("exText"));
        kmPage.setATB(ConfProperties.getProperty("exText"));
        kmPage.setATBEmail(ConfProperties.getProperty("exEmail"));
        kmPage.setFullName(ConfProperties.getProperty("exText"));
        kmPage.setDiscountFullName(ConfProperties.getProperty("exText"));

        kmPage.scrollUP();
        kmPage.graphicBtnClick();
        kmPage.contractRCClick();
        kmPage.graphicTypeClick();
        kmPage.isStandardGraphicClick();
        kmPage.graphic14_2Click();
        sleep();

        kmPage.scrollUP();
        kmPage.saveBtnClick();
        kmPage.logout();
    }

    @Test(priority = 5)
    public void loginKlp() {
        loginPage.inputLogin(ConfProperties.getProperty("loginKLP"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKLP"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 6)
    public void klpContractsClick() throws InterruptedException {
        klpPage.contractClick();
        klpPage.contractCreationRequestsClick();
        klpPage.needProviderAcceptClick();
        sleep();

        klpPage.tabRequestClick();

        klpPage.editBtnClick();

        klpPage.scanCopiesBtnClick();
        klpPage.fileEdrBtnClick(ConfProperties.getProperty("exFile"));
        klpPage.filePayerRegisterBtnClick(ConfProperties.getProperty("exFile"));
        klpPage.filePassportCopyBtnClick(ConfProperties.getProperty("exFile"));
        klpPage.fileStateRegistrationBtnClick(ConfProperties.getProperty("exFile"));
        klpPage.fileTaxBtnClick(ConfProperties.getProperty("exFile"));
        klpPage.fileBankReferenceBtnClick(ConfProperties.getProperty("exFile"));

        klpPage.propsBtnClick();
        klpPage.signatoryPosition(ConfProperties.getProperty("exText"));
        klpPage.workOnBaseBtnClick();
        klpPage.addressField(ConfProperties.getProperty("exText"));
        klpPage.bankField(ConfProperties.getProperty("exText"));
        klpPage.phoneNumberField(ConfProperties.getProperty("exNumb"));
        klpPage.signatoryFullNameField(ConfProperties.getProperty("exText"));
        klpPage.correspondenceAddressField(ConfProperties.getProperty("exText"));
        klpPage.bankAccountField(ConfProperties.getProperty("exNumb"));
        klpPage.mfoField(ConfProperties.getProperty("exNumb"));
        klpPage.supplierEmailField(ConfProperties.getProperty("exEmail"));

        sleep();
        kmPage.scrollUP();
        klpPage.contactsBtnClick();
        klpPage.contactPersonField(ConfProperties.getProperty("exText"));
        klpPage.contactEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.directorPhoneField(ConfProperties.getProperty("exNumb"));
        klpPage.contactPhoneField(ConfProperties.getProperty("exNumb"));
        klpPage.directorFullNameField(ConfProperties.getProperty("exText"));
        klpPage.directorEmailField(ConfProperties.getProperty("exEmail"));

        klpPage.salesContactPersonNameField(ConfProperties.getProperty("exText"));
        klpPage.salesContactEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.salesContactPhoneField(ConfProperties.getProperty("exNumb"));

        klpPage.economyContactPersonFullNameField(ConfProperties.getProperty("exText"));
        klpPage.economyContactEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.accountPhoneField(ConfProperties.getProperty("exNumb"));
        klpPage.serviceSpecialistEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.serviceSpecialistFullNameField(ConfProperties.getProperty("exText"));
        klpPage.finesSpecialistPhoneField(ConfProperties.getProperty("exNumb"));
        klpPage.economyContactPhoneField(ConfProperties.getProperty("exNumb"));
        klpPage.accountFullNameField(ConfProperties.getProperty("exText"));
        klpPage.accountEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.serviceSpecialistPhoneField(ConfProperties.getProperty("exNumb"));
        klpPage.finesSpecialistFullNameField(ConfProperties.getProperty("exText"));
        klpPage.finesSpecialistEmailField(ConfProperties.getProperty("exEmail"));

        klpPage.marketingContactPersonFullNameField(ConfProperties.getProperty("exText"));
        klpPage.marketingContactEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.marketingContactPhoneField(ConfProperties.getProperty("exNumb"));
        kmPage.scrollUP();

        klpPage.otherContractTermsBtnClick();
        klpPage.supplierRequestsEmailField(ConfProperties.getProperty("exEmail"));
        klpPage.ediOperatorNameField(ConfProperties.getProperty("exText"));
        klpPage.supplierGnlCodeField(ConfProperties.getProperty("contNumb"));
        klpPage.ediOperatorEdrpouField(ConfProperties.getProperty("contNumb"));
        klpPage.payerStatusFieldClick();
        klpPage.authSignAccDocField(ConfProperties.getProperty("exText"));
        klpPage.authSignAccDocDiscountField(ConfProperties.getProperty("exText"));
        kmPage.scrollUP();

        klpPage.specificationBtnClick();
        klpPage.packagingSpecificationField(ConfProperties.getProperty("contNumb"));
        klpPage.packFullNameFieldClick();
        klpPage.packagingSpecificationReturnField(ConfProperties.getProperty("exText"));
        klpPage.packIsBack();


        klpPage.saveBtnClick();
        klpPage.confirmBtnClick();

        klpPage.logout();
    }

    @Test(priority = 7)
    public void returnForRevision() throws InterruptedException {
        loginPage.inputLogin(ConfProperties.getProperty("loginKM"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKM"));
        loginPage.clickLoginBtn();

        kmPage.contractsPanelBtnClick();
        kmPage.contractRequestsBtnClick();
        kmPage.tableElementClick();
        kmPage.sendRevisionBackBtnClick();
        kmPage.sendRevisionSupplierCommentField(ConfProperties.getProperty("exText"));
        kmPage.sendRevisionSupplierBtnClick();

        kmPage.logout();
    }

    @Test(priority = 8)
    public void klpConfirmRequest() throws InterruptedException {
        loginPage.inputLogin(ConfProperties.getProperty("loginKLP"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKLP"));
        loginPage.clickLoginBtn();

        klpPage.contractClick();
        klpPage.contractCreationRequestsClick();
        klpPage.sendOnRevisionBtnClick();
        sleep();
        klpPage.tabRequestClick();
        klpPage.confirmBtnClick();

        klpPage.logout();
    }

    @Test(priority = 9)
    public void kmConfirmRequest() throws InterruptedException {
        loginPage.inputLogin(ConfProperties.getProperty("loginKM"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKM"));
        loginPage.clickLoginBtn();

        kmPage.contractsPanelBtnClick();
        kmPage.contractRequestsBtnClick();
        kmPage.tableElementClick();
        kmPage.confirmKMBtnClick();
        kmPage.assertExecutor(ConfProperties.getProperty("KMprime"));
        kmPage.logout();
    }

    @Test(priority = 10)
    public void kmprimeConfirmRequest() throws InterruptedException {
        loginPage.inputLogin(ConfProperties.getProperty("loginKMprime"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordKMprime"));
        loginPage.clickLoginBtn();

        kmprimePage.contractsPanelBtnClick();
        kmprimePage.contractCreationRequests();
        kmprimePage.listOFRequestsBtn();
        sleep();
        kmprimePage.tabElementClick();
        kmprimePage.agreementBtnClick();

        kmprimePage.logout();
    }

    @Test(priority = 11)
    public void headOfDepartmentConfirmRequest() throws InterruptedException {
        loginPage.inputLogin(ConfProperties.getProperty("loginHead"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordHead"));
        loginPage.clickLoginBtn();

        hodPage.contractsPanelBtnClick();
        hodPage.contractCreationRequestsClick();
        hodPage.listOFRequestsBtnClick();
        sleep();
        hodPage.tabElementClick();
        hodPage.agreementBtnClick();

        hodPage.logout();
    }

}
