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

    @FindBy(id = "registration_number_supply_contract_a")
    private WebElement contractRegistrationNumber;

    @FindBy(id = "date_start_supply_contract_a_trigger")
    private WebElement startDateTrigger;

    @FindBy(xpath = "//a[contains(text(),'28')]")
    private WebElement startDay;

    @FindBy(xpath = "//button[@id='date_end_supply_contract_a_trigger']")
    private WebElement endDateTrigger;

    @FindBy(xpath = "//a[contains(text(),'28')]")
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

    @FindBy(id = "liabilities_reduction_discount_supply_contract_p")
    private WebElement reductionDiscountField;

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

    @FindBy(css = "li.hidden-xs:nth-child(7) > a:nth-child(1)")
    private WebElement graphicBtn;

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[3]/select[1]/option[1]")
    private WebElement contractRC;

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/div[1]/select[1]/option[3]")
    private WebElement graphicType;

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

    @FindBy(xpath = "//input[@id='supply_schedule_supply_contract_a_pc_1_is_typical']")
    private WebElement isStandardGraphic;

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/div[2]/select[1]/option[3]")
    private WebElement graphic14_2;


    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[@id='EditView_tabs']/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/select[1]/option[2]")
    private WebElement setContractIsTypicalField;

	@FindBy(id = "postponement_days_supply_contract_a")
	private WebElement setPostponementField;

	@FindBy(id = "delay_compensation_supply_contract_a")
    private WebElement setDelayField;

	@FindBy(id = "discount_percent_supply_contract_a")
    private WebElement setDiscountPercent;

	@FindBy(id = "logistics_uah_kg_supply_contract_a")
	private WebElement setLogisticsField;

	@FindBy(id = "promotion_supply_contract_a")
    private WebElement setPromotionField;

	@FindBy(id = "refund_compensation_supply_contract_a")
    private WebElement setRefundSupply;

	@FindBy(id = "liabilities_reduction_discount_supply_contract_a")
    private WebElement reductionDiscount;

	@FindBy(id = "atb_accounter_name")
    private WebElement setAtbAccounter;

	@FindBy(id = "atb_address")
    private WebElement setATB;

	@FindBy(id = "atb_email")
    private WebElement setATBEmail;

	@FindBy(id = "auth_sign_acc_docs_fullname_atb")
    private WebElement setFullName;

	@FindBy(id = "auth_sign_acc_docs_discount_act_fullname_atb")
    private WebElement setDiscountFullName;





    public void scrollUP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, -3000)", "");
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1200)", "");
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

//    public void delayFieldFill(String delay) {
//        delayCompensationField.sendKeys(delay);
//    }
//
//    public void discountFieldFill(String discount) {
//        discountField.sendKeys(discount);
//    }
//
//    public void postponementFieldFill(String postponement) {
//        postponementField.sendKeys(postponement);
//    }
//
//    public void contractIsTypicalClick() {
//        contractIsTypical.click();
//    }
//
//    public void refundCompensationFieldFill(String refund) {
//        refundCompensationField.sendKeys(refund);
//    }
//
//    public void logisticsFieldFill(String logistics) {
//        logisticsField.sendKeys(logistics);
//    }
//
//    public void promotionFieldFill(String promotion) {
//        promotionField.sendKeys(promotion);
//    }
//
//    public void reductionDiscountFieldFill(String discount){
//        reductionDiscountField.sendKeys(discount);
//    }
//
//    public void accounterNameFieldFill(String accounter) {
//        accounterNameField.sendKeys(accounter);
//    }
//
//    public void atbAddressFieldFill(String atbAddress) {
//        atbAddressField.sendKeys(atbAddress);
//    }
//
//    public void atbEmailFieldFill(String atbEmail) {
//        atbEmailField.sendKeys(atbEmail);
//    }
//
//    public void fullNameDiscountAccFieldFill(String fullName) {
//        fullNameDiscountAccField.sendKeys(fullName);
//    }
//
//    public void fullNameDocsAccFieldFill(String fullName) {
//        fullNameDocsAccField.sendKeys(fullName);
//    }

    public void setContractIsTypical(){
        scrollDown();
        setContractIsTypicalField.click();
    }

    public void setPostponementField(String postponement){
        setPostponementField.sendKeys(postponement);
    }

    public void setDelayField(String delay){
        setDelayField.sendKeys(delay);
    }

    public void setDiscountPercent(String discount){
        setDiscountPercent.sendKeys(discount);
    }

    public void setLogisticsField(String logistics){
        setLogisticsField.sendKeys(logistics);
    }

    public void setPromotionField(String promotion){
        setPromotionField.sendKeys(promotion);
    }

    public void setRefundSupply(String refundSupply){
        setRefundSupply.sendKeys(refundSupply);
    }

    public void reductionDiscount(String discount){
        reductionDiscount.sendKeys(discount);
    }

    public void setAtbAccounter(String accounter){
        setAtbAccounter.sendKeys(accounter);
    }

    public void setATB(String atb){
        setATB.sendKeys(atb);
    }

    public void setATBEmail(String atbEmail){
        setATBEmail.sendKeys(atbEmail);
    }

    public void setFullName(String name){
        setFullName.sendKeys(name);
    }

    public void setDiscountFullName(String name){
        setDiscountFullName.sendKeys(name);
    }











    public void graphicBtnClick(){
        graphicBtn.click();
    }

    public void contractRCClick(){
        contractRC.click();
    }

    public void graphicTypeClick(){
        graphicType.click();
    }

    public void isStandardGraphicClick(){
        isStandardGraphic.click();
    }

    public void graphic14_2Click(){
        graphic14_2.click();
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
