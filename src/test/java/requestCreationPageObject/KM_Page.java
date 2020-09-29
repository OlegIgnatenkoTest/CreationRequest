package requestCreationPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KM_Page {


    public WebDriver driver;

    public KM_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "grouptab_0")
    private WebElement contractsPanel;

    @FindBy(xpath = "//li[2]//span[2]//ul[1]//li[1]//a[1]")
    private WebElement contractsRequests;

    @FindBy(xpath = "//ul[@class='clickMenu selectmenu searchLink SugarActionMenu listViewLinkButton listViewLinkButton_top']//a[@class='glyphicon glyphicon-filter parent-dropdown-handler']")
    private WebElement openFilter;

    @FindBy(id = "name_advanced")
    private WebElement providerNameField;

    @FindBy(id = "search_form_submit_advanced")
    private WebElement searchBtn;

    @FindBy(xpath = "//tr[@class='oddListRowS1']//td[3]")
    private WebElement tableElementProvider;

    @FindBy(xpath = "//input[@id='createCCRBtn']")
    private WebElement createRequestBtn;

    @FindBy(css = "li.hidden-xs:nth-child(2) > a:nth-child(1)")
    private WebElement kmBtn;

    @FindBy(xpath = "//select[@id='conclusion_contract_reason']//option[2]")
    private WebElement contractReason;

    @FindBy(xpath = "//select[@id='contract_templates']//option[3]")
    private WebElement contractTemplates;

    @FindBy(id = "registration_number_supply_contract_p")
    private WebElement contractRegistrationNumber;

    @FindBy(id = "date_start_supply_contract_p_trigger")
    private WebElement startDateTrigger;

    @FindBy(xpath = "//a[contains(text(),'29')]")
    private WebElement startDay;

    @FindBy(xpath = "//button[@id='date_end_supply_contract_p_trigger']")
    private WebElement endDateTrigger;

    @FindBy(xpath = "//a[contains(text(),'30')]")
    private WebElement endDay;

    @FindBy(id = "delay_compensation_supply_contract_p")
    private WebElement delayCompensationField;

    @FindBy(id = "discount_percent_supply_contract_p")
    private WebElement discountField;

    @FindBy(id = "postponement_days_supply_contract_p")
    private WebElement postponementField;

    @FindBy(xpath = "//div[@id='commercial_terms_supply_contract_p_block']//option[2]")
    private WebElement contractIsTypical;

    @FindBy(id = "refund_compensation_supply_contract_p")
    private WebElement refundCompensationField;

    @FindBy(id = "logistics_uah_kg_supply_contract_p")
    private WebElement logisticsField;

    @FindBy(id = "promotion_supply_contract_p")
    private WebElement promotionField;

    @FindBy(id = "atb_accounter_name")
    private WebElement accounterNameField;

    @FindBy(id = "atb_address")
    private WebElement atbAddressField;

    @FindBy(id = "atb_email")
    private WebElement atbEmailField;

    @FindBy(id = "auth_sign_acc_docs_discount_act_fullname_atb")
    private WebElement fullNameDiscountAccField;

    @FindBy(id = "auth_sign_acc_docs_fullname_atb")
    private WebElement fullNameDocsAccField;

    @FindBy(id = "SAVE")
    private WebElement saveBtn;

    @FindBy(id = "grouptab_1")
    private WebElement contractsPanelBtn;

    @FindBy(xpath = "//li[3]//span[2]//ul[1]//li[2]//a[1]")
    private WebElement contractRequestsBtn;

    @FindBy(css = "#MassUpdate > div.list-view-rounded-corners > table > tbody > tr:nth-child(1) > td:nth-child(3) > b")
    private WebElement tableElementClick;

    @FindBy(id = "sendRevisionSupplierBtn")
    private WebElement sendRevisionBackBtn;

    @FindBy(id = "send_revision_supplier_comment")
    private WebElement sendRevisionSupplierCommentField;

    @FindBy(id = "send_revision_supplier_btn")
    private WebElement sendRevisionSupplierBtn;

    @FindBy(id = "confirmKMBtn")
    private WebElement confirmKMBtn;

    @FindBy(css = "#tab-content-0 > div:nth-child(3) > div:nth-child(2) > div.col-xs-12.col-sm-8.detail-view-field")
    private WebElement assertExecutor;

    @FindBy(id = "with-label")
    private WebElement userPanelBtn;

    @FindBy(xpath = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='logout_link']")
    private WebElement userPanelLogoutBtn;


    public void scrollUP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-3000)", "");
    }

    public void logout() throws InterruptedException {
        userPanelBtnClick();
        DriverSettings.sleep();
        userPanelLogoutBtnClick();
    }

    public void userPanelBtnClick() {
        userPanelBtn.click();
    }

    public void userPanelLogoutBtnClick() {
        userPanelLogoutBtn.click();
    }

    public void contractsPanelClick() {
        contractsPanel.click();
    }

    public void contractsRequestsClick() {
        contractsRequests.click();
    }

    public void openFilterClick() {
        openFilter.click();
    }

    public void providerNameFieldFill(String providerName) {
        providerNameField.clear();
        providerNameField.sendKeys(providerName);
    }

    public void searchBtnClick() {
        searchBtn.click();
    }

    public void taleElementClick() {
        tableElementProvider.click();
    }

    public void createRequestBtnClick() {
        createRequestBtn.click();
    }

    public void kmBtnClick() {
        kmBtn.click();
    }

    public void contractReason() {
        contractReason.click();
    }

    public void contractTemplatesClick() {
        contractTemplates.click();
    }

    public void contractRegistrationNumber(String registrationNumber) {
        contractRegistrationNumber.sendKeys(registrationNumber);
    }

    public void startDateTriggerClick() {
        startDateTrigger.click();
    }

    public void startDayClick() {
        startDay.click();
    }

    public void endDateTriggerClick() {
        endDateTrigger.click();
    }

    public void endDayClick() {
        endDay.click();
    }

    public void delayFieldFill(String delay) {
        delayCompensationField.sendKeys(delay);
    }

    public void discountFieldFill(String discount) {
        discountField.sendKeys(discount);
    }

    public void postponementFieldFill(String postponement) {
        postponementField.sendKeys(postponement);
    }

    public void contractIsTypicalClick() {
        contractIsTypical.click();
    }

    public void refundCompensationFieldFill(String refund) {
        refundCompensationField.sendKeys(refund);
    }

    public void logisticsFieldFill(String logistics) {
        logisticsField.sendKeys(logistics);
    }

    public void promotionFieldFill(String promotion) {
        promotionField.sendKeys(promotion);
    }

    public void accounterNameFieldFill(String accounter) {
        accounterNameField.sendKeys(accounter);
    }

    public void atbAddressFieldFill(String atbAddress) {
        atbAddressField.sendKeys(atbAddress);
    }

    public void atbEmailFieldFill(String atbEmail) {
        atbEmailField.sendKeys(atbEmail);
    }

    public void fullNameDiscountAccFieldFill(String fullName) {
        fullNameDiscountAccField.sendKeys(fullName);
    }

    public void fullNameDocsAccFieldFill(String fullName) {
        fullNameDocsAccField.sendKeys(fullName);
    }

    public void saveBtnClick() {
        saveBtn.click();
    }

    public void contractsPanelBtnClick() {
        contractsPanelBtn.click();
    }

    public void contractRequestsBtnClick() {
        contractRequestsBtn.click();
    }

    public void tableElementClick() {
        tableElementClick.click();
    }

    public void sendRevisionBackBtnClick() {
        sendRevisionBackBtn.click();
    }

    public void sendRevisionSupplierCommentField(String comment) {
        sendRevisionSupplierCommentField.sendKeys(comment);
    }

    public void sendRevisionSupplierBtnClick() {
        sendRevisionSupplierBtn.click();
    }

    public void confirmKMBtnClick() {
        confirmKMBtn.click();
    }

    public void assertExecutor(String executor) {
        executor = assertExecutor.getText();
        Assert.assertEquals(executor, "KMprime");
        System.out.println(executor);
    }

}
