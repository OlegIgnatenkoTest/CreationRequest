package productCreation;

import io.qameta.allure.Owner;
import org.testng.annotations.Test;

@Owner("o.ignatenko")
public class ProductCreationPageTest extends DriverSettings {

    @Test(priority = 1)
    public void login() {
        loginPage.inputLogin(ConfProperties.getProperty("loginAdmin"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordAdmin"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void productPanelClick() {
        productCreationPage.productPanelClick();
    }

    @Test(priority = 3)
    public void productsTabClick() {
        productCreationPage.productsTabClick();
    }

    @Test(priority = 4)
    public void productCreateClick() {
        productCreationPage.createProductBtnClick();
    }

    @Test(priority = 5)
    public void productNameField() {
        productCreationPage.productNameFieldFill(ConfProperties.getProperty("exText"));
    }

    @Test(priority = 6)
    public void productCodeField() {
        productCreationPage.productCodeField(ConfProperties.getProperty("contNumb"));
    }

    @Test(priority = 7)
    public void statusChooseClick() {
        productCreationPage.statusChooseClick();
    }

    @Test(priority = 8)
    public void categoryChooseClick() {
        productCreationPage.categoryChooseClick();
    }

    @Test(priority = 9)
    public void productCategoryChooseClick() {
        productCreationPage.productCategoryClick();
    }

    @Test(priority = 10)
    public void productClassClick() {
        productCreationPage.productClassClick();
    }

    @Test(priority = 11)
    public void productSubClass() {
        productCreationPage.productSubClassClick();
    }

    @Test(priority = 12)
    public void chooseProviderBtnClick() {
        productCreationPage.chooseProviderBtnClick();
    }

    @Test(priority = 13)
    public void switchOnProviderWindow() {
        productCreationPage.switchOnProviderWindow();
    }

    @Test(priority = 14)
    public void searchContract() {
        productCreationPage.searchContract();
    }

    @Test(priority = 15)
    public void vghBtnClick() {
        productCreationPage.vghBtnClick();
    }

    @Test(priority = 16)
    public void packInsideFieldFill() {
        productCreationPage.packInsideFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 17)
    public void lawyerBoxFieldFill() {
        productCreationPage.layerBoxFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 18)
    public void layerPcsFieldFill() {
        productCreationPage.layerPcsFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 19)
    public void paletteBoxFieldFill() {
        productCreationPage.paletteBoxFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 20)
    public void maxDeviationGrossFieldFill() {
        productCreationPage.maxDeviationGrossFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 21)
    public void weightPcsFieldFill() {
        productCreationPage.weightPcsFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 22)
    public void lengthProductFieldFill() {
        productCreationPage.lengthProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 23)
    public void weightPackFieldFill() {
        productCreationPage.weightPackFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 24)
    public void weightPcsNetFieldFill() {
        productCreationPage.weightPcsNetFieldFill(ConfProperties.getProperty("exText"));
    }

    @Test(priority = 25)
    public void heightProductFieldFill() {
        productCreationPage.heightProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 26)
    public void volumeProductFieldFill() {
        productCreationPage.volumeProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 27)
    public void widthProductFieldFill() {
        productCreationPage.widthProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 28)
    public void additionalInformationBtnClick() {
        productCreationPage.additionalInformationBtnClick();
    }

    @Test(priority = 29)
    public void providerCodeFieldFill() {
        productCreationPage.providerCodeFieldFill(ConfProperties.getProperty("contNumb"));
    }

    @Test(priority = 30)
    public void productTypeChoose() {
        productCreationPage.productTypeFieldClick();
    }

    @Test(priority = 31)
    public void codeEdiFieldFill() {
        productCreationPage.codeEdiFieldFill(ConfProperties.getProperty("contNumb"));
    }

    @Test(priority = 32)
    public void segmentFieldClick() {
        productCreationPage.segmentFieldClick();
    }

    @Test(priority = 33)
    public void priceWithVatFieldFill() {
        productCreationPage.priceWithVatFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 34)
    public void isImportedFieldClick() {
        productCreationPage.isImportedFieldClick();
    }

    @Test(priority = 35)
    public void isCashFieldClick(){
        productCreationPage.isCashFieldClick();
    }

    @Test(priority = 36)
    public void sourceFieldClick(){
        productCreationPage.sourceFieldClick();
    }

    @Test(priority = 37)
    public void idContractErpFieldFill(){
        productCreationPage.idContractErpFieldFill(ConfProperties.getProperty("contNumb"));
    }

    @Test(priority = 38)
    public void isPrivateLabelFieldClick(){
        productCreationPage.isPrivateLabelFieldClick();
    }

    @Test(priority = 39)
    public void priceWithoutVatFieldFill(){
        productCreationPage.priceWithoutVatFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 40)
    public void isRussianFieldFill(){
        productCreationPage.isRussianFieldClick();
    }

    @Test(priority = 41)
    public void rmsBtnClick(){
        productCreationPage.rmsBtnClick();
    }

    @Test(priority = 42)
    public void statusRmsFieldClick(){
        productCreationPage.statusRmsFieldClick();
    }

    @Test(priority = 43)
    public void codeRateVatFieldFill(){
        productCreationPage.codeRateVatFieldFill(ConfProperties.getProperty("contNumb"));
    }

    @Test(priority = 44)
    public void managerFieldClick(){
        productCreationPage.managerFieldClick();
    }

    @Test(priority = 45)
    public void rateVatFieldFill(){
        productCreationPage.rateVatFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 46)
    public void amountInUnitFieldFill(){
        productCreationPage.amountInUnitFieldFill(ConfProperties.getProperty("smallNumb"));
    }
//
//    @Test(priority = 47)
//    public void saveBtnClick(){
//        productCreationPage.saveBtnClick();
//    }
}
