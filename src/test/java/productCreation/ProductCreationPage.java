package productCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class ProductCreationPage {

    public WebDriver driver;

    public ProductCreationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "grouptab_2")
    private WebElement productPanel;

    @FindBy(xpath = "//li[4]//span[2]//ul[1]//li[1]//a[1]")
    private WebElement productsTab;

    @FindBy(xpath = "//li[1]//a[1]//div[2]")
    private WebElement createProductBtn;

    @FindBy(id = "name")
    private WebElement productNameField;

    @FindBy(id = "code")
    private WebElement codeField;

    @FindBy(xpath = "//*[@id=\"status_record\"]/option[2]")
    private WebElement statusChoose;

    @FindBy(xpath = "//select[@id='category']//option[3]")
    private WebElement categoryChoose;

    @FindBy(xpath = "//select[@id='product_category']//option[5]")
    private WebElement productCategory;

    @FindBy(xpath = "//select[@id='product_class']//option[contains(text(),'(')]")
    private WebElement productClass;

    @FindBy(xpath = "//select[@id='product_subclass']//option[contains(text(),'(')]")
    private WebElement productSubClass;

    @FindBy(id = "btn_accounts_aos_products_1_name")
    private WebElement chooseProviderBtn;

    @FindBy(id = "name_advanced")
    private WebElement providerName;

    @FindBy(id = "search_form_submit")
    private WebElement searchFormSubmitBtn;

    @FindBy(linkText = "Рияд Рамирес аль Хасар")
    private WebElement tableElementName;

    @FindBy(id = "btn_contract")
    private WebElement chooseContractBtn;

    @FindBy(id = "name_advanced")
    private WebElement nameAdvanced;

    @FindBy(id = "search_form_submit")
    private WebElement searchFromSubmitBtn;

    @FindBy(xpath = "//a[contains(text(),'33222240')]")
    private WebElement chooseContractByNumber;

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/ul[1]/li[2]/a[1]")
    private WebElement VGHBtn;

    @FindBy(id = "attachments_packaging")
    private WebElement packInsideField;

    @FindBy(id = "attachments_pallet_pcs")
    private WebElement palettePcsField;

    @FindBy(id = "attachments_layer_box")
    private WebElement layerBoxField;

    @FindBy(id = "attachments_layer_pcs")
    private WebElement layerPcsField;

    @FindBy(id = "attachments_pallet_box")
    private WebElement paletteBoxField;

    @FindBy(id = "max_deviation_gross")
    private WebElement maxDeviationGrossField;

    @FindBy(id = "weight_pcs_gross")
    private WebElement weightPcsField;

    @FindBy(id = "width_product")
    private WebElement widthProductField;

    @FindBy(id = "length_product")
    private WebElement lengthProductField;

    @FindBy(id = "weight_pack")
    private WebElement weightPackField;

    @FindBy(id = "weight_pcs_net")
    private WebElement weightPcsNetField;

    @FindBy(id = "height_product")
    private WebElement heightProductField;

    @FindBy(id = "volume_product")
    private WebElement volumeProductField;

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/ul[1]/li[3]/a[1]")
    private WebElement additionalInformationBtn;

    @FindBy(id = "provider_code")
    private WebElement providerCodeField;

    @FindBy(xpath = "//select[@id='type']//option[4]")
    private WebElement productTypeField;

    @FindBy(id = "code_edi")
    private WebElement codeEdiField;

    @FindBy(xpath = "//select[@id='segment']//option[3]")
    private WebElement segmentField;

    @FindBy(id = "price_with_vat")
    private WebElement priceWithVatField;

    @FindBy(xpath = "//select[@id='is_imported']//option[2]")
    private WebElement isImportedField;

    @FindBy(xpath = "//select[@id='is_cash']//option[3]")
    private WebElement isCashField;

    @FindBy(xpath = "//select[@id='source']//option[3]")
    private WebElement sourceField;

    @FindBy(id = "id_contract_erp")
    private WebElement idContractErpField;

    @FindBy(xpath = "//select[@id='is_private_label']//option[2]")
    private WebElement isPrivateLabelField;

    @FindBy(id = "price_without_vat")
    private WebElement priceWithoutVatField;

    @FindBy(xpath = "//select[@id='is_russian']//option[2]")
    private WebElement isRussianField;

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/ul[1]/li[4]/a[1]")
    private WebElement rmsBtn;

    @FindBy(xpath = "//select[@id='status_rms']//option[3]")
    private WebElement statusRmsField;

    @FindBy(id = "code_rate_vat")
    private WebElement codeRateVatField;

    @FindBy(xpath = "//div[@id='tab-content-3']//option[10]")
    private WebElement managerField;

    @FindBy(id = "rate_vat")
    private WebElement rateVatField;

    @FindBy(id = "amount_in_unit")
    private WebElement amountInUnitField;

    @FindBy(id = "SAVE")
    private WebElement saveBtn;



    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 3000)", "");
    }

    public void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, -3000)", "");
    }

    public void productPanelClick() {
        productPanel.click();
    }

    public void productsTabClick() {
        productsTab.click();
    }

    public void createProductBtnClick() {
        createProductBtn.click();
    }

    public void productNameFieldFill(String name) {
        productNameField.sendKeys(name);
    }

    public void productCodeField(String code) {
        codeField.sendKeys(code);
    }

    public void statusChooseClick() {
        statusChoose.click();
    }

    public void categoryChooseClick() {
        categoryChoose.click();
    }

    public void productCategoryClick() {
        productCategory.click();
    }

    public void productClassClick() {
        productClass.click();
    }

    public void productSubClassClick() {
        productSubClass.click();
    }

    public void chooseProviderBtnClick() {
        chooseProviderBtn.click();
    }

    public void switchOnProviderWindow() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parentWindow = itr.next();
        String newWindow = itr.next();

        driver.switchTo().window(newWindow);

        providerName.sendKeys("Рияд");
        searchFormSubmitBtn.click();
        tableElementName.click();

        driver.switchTo().window(parentWindow);
        //scrollDown();
    }

    public void searchContract() {

        chooseContractBtn.click();

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parentWindow = itr.next();
        String newWindow = itr.next();

        driver.switchTo().window(newWindow);

        nameAdvanced.sendKeys("33222240");
        searchFormSubmitBtn.click();
        scrollDown();
        chooseContractByNumber.click();

        driver.switchTo().window(parentWindow);
    }

    public void vghBtnClick() {
        scrollUp();
        VGHBtn.click();
    }

    public void packInsideFieldFill(String pack) {
        packInsideField.sendKeys(pack);
    }

    public void layerBoxFieldFill(String box) {
        layerBoxField.sendKeys(box);
    }

    public void layerPcsFieldFill(String pcs) {
        layerPcsField.sendKeys(pcs);
    }

    public void paletteBoxFieldFill(String palette) {
        paletteBoxField.sendKeys(palette);
    }

    public void maxDeviationGrossFieldFill(String deviation) {
        maxDeviationGrossField.sendKeys(deviation);
    }

    public void weightPcsFieldFill(String weight) {
        weightPcsField.sendKeys(weight);
    }

    public void widthProductFieldFill(String width) {
        widthProductField.sendKeys(width);
    }

    public void lengthProductFieldFill(String length) {
        lengthProductField.sendKeys(length);
    }

    public void weightPackFieldFill(String weight) {
        weightPackField.sendKeys(weight);
    }

    public void weightPcsNetFieldFill(String weight) {
        weightPcsNetField.sendKeys(weight);
    }

    public void heightProductFieldFill(String height) {
        heightProductField.sendKeys(height);
    }

    public void volumeProductFieldFill(String volume) {
        volumeProductField.sendKeys(volume);
    }

    public void additionalInformationBtnClick() {
        scrollUp();
        additionalInformationBtn.click();
    }

    public void providerCodeFieldFill(String code) {
        providerCodeField.sendKeys(code);
    }

    public void productTypeFieldClick() {
        productTypeField.click();
    }

    public void codeEdiFieldFill(String code) {
        codeEdiField.sendKeys(code);
    }

    public void segmentFieldClick() {
        segmentField.click();
    }

    public void priceWithVatFieldFill(String price) {
        priceWithVatField.sendKeys(price);
    }

    public void isImportedFieldClick() {
        isImportedField.click();
    }

    public void isCashFieldClick() {
        isCashField.click();
    }

    public void sourceFieldClick() {
        sourceField.click();
    }

    public void idContractErpFieldFill(String id){
        idContractErpField.sendKeys(id);
    }

    public void isPrivateLabelFieldClick(){
        isPrivateLabelField.click();
    }

    public void priceWithoutVatFieldFill(String price){
        priceWithoutVatField.sendKeys(price);
    }

    public void isRussianFieldClick(){
        isRussianField.click();
    }

    public void rmsBtnClick(){
        rmsBtn.click();
    }

    public void statusRmsFieldClick(){
        statusRmsField.click();
    }

    public void codeRateVatFieldFill(String code){
        codeRateVatField.sendKeys(code);
    }

    public void managerFieldClick(){
        managerField.click();
    }

    public void rateVatFieldFill(String rate){
        rateVatField.sendKeys(rate);
    }

    public void amountInUnitFieldFill(String amount){
        amountInUnitField.sendKeys(amount);
    }

    public void saveBtnClick(){
        saveBtn.click();
    }
}
