package requestCreationPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KLP_Page {

    private WebDriver driver;

    public KLP_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "grouptab_2")
    private WebElement contracts;

    @FindBy(xpath = "//li[contains(@class,'topnav')]//li[2]//a[1]")
    private WebElement contractCreationRequests;

    @FindBy(xpath = "//li[2]//a[1]//div[2]")
    private WebElement needProviderAccept;

    @FindBy(css = "#MassUpdate > div.list-view-rounded-corners > table > tbody > tr:nth-child(1) > td:nth-child(3) > b")
    private WebElement tabRequestElement;

    @FindBy(xpath = "//input[@id='edit_button']")
    private WebElement editBtn;

    @FindBy(xpath = "//li[@class='hidden-xs']//a[@id='tab2']")
    private WebElement scanCopiesBtn;

    //Files upload

    @FindBy(id = "extraction_egr_files0")
    private WebElement fileEdrBtn;

    @FindBy(id = "actual_statute_files0")
    private WebElement fileStatuteBtn;

    @FindBy(id = "vat_payer_register_files0")
    private WebElement filePayerRegisterBtn;

    @FindBy(id = "general_meeting_protocol_head_appointment_files0")
    private WebElement fileGeneralMeetingProtocolBtn;

    @FindBy(id = "passport_inn_copy_files0")
    private WebElement filePassportCopyBtn;

    @FindBy(id = "power_of_attorney_files0")
    private WebElement filePowerOfAttBtn;

    @FindBy(id = "other_docs_files0")
    private WebElement fileOtherDocsBtn;

    @FindBy(id = "state_registration_certificate_files0")
    private WebElement fileStateRegistrationBtn;

    @FindBy(id = "statistics_department_help_files0")
    private WebElement fileStatisticsDepartmentBtn;

    @FindBy(id = "tax_payer_register_files0")
    private WebElement fileTaxBtn;

    @FindBy(id = "head_appointment_order_files0")
    private WebElement fileHeadAppointmentBtn;

    @FindBy(id = "bank_reference_files0")
    private WebElement fileBankReferenceBtn;

    @FindBy(id = "general_meeting_protocol_conclude_agreement_files0")
    private WebElement fileGeneralMeetingProt2Btn;

    //End files

    @FindBy(xpath = "//li[@class='hidden-xs']//a[@id='tab3']")
    private WebElement propsBtn;

    @FindBy(id = "signatory_position")
    private WebElement signatoryPositionField;

    @FindBy(xpath = "//div[@id='tab-content-3']//option[2]")
    private WebElement workOnBaseBtn;

    @FindBy(id = "production_location_addresses")
    private WebElement addressField;

    @FindBy(id = "bank")
    private WebElement bankField;

    @FindBy(id = "phone_number")
    private WebElement phoneNumberField;

    @FindBy(id = "signatory_fullname")
    private WebElement signatoryFullNameField;

    @FindBy(id = "correspondence_address")
    private WebElement correspondenceAddressField;

    @FindBy(id = "bank_account")
    private WebElement bankAccountField;

    @FindBy(id = "mfo")
    private WebElement mfoField;

    @FindBy(id = "supplier_email")
    private WebElement supplierEmailField;

    @FindBy(css = "li.hidden-xs:nth-child(5) > a:nth-child(1)")
    private WebElement contactsBtn;

    @FindBy(id = "contact_person_fullname")
    private WebElement contactPersonField;

    @FindBy(id = "contact_email")
    private WebElement contactEmailField;

    @FindBy(id = "director_phone")
    private WebElement directorPhoneField;

    @FindBy(id = "contact_phone")
    private WebElement contactPhoneField;

    @FindBy(id = "director_fullname")
    private WebElement directorFullNameField;

    @FindBy(id = "director_email")
    private WebElement directorEmailField;

    @FindBy(id = "sales_contact_person_fullname")
    private WebElement salesContactPersonNameField;

    @FindBy(id = "sales_contact_email")
    private WebElement salesContactEmailField;

    @FindBy(id = "sales_contact_phone")
    private WebElement salesContactPhoneField;

    @FindBy(id = "economic_contact_person_fullname")
    private WebElement economyContactPersonFullNameField;

    @FindBy(id = "economic_contact_email")
    private WebElement economyContactEmailField;

    @FindBy(id = "accountant_phone")
    private WebElement accountPhoneField;

    @FindBy(id = "service_specialist_email")
    private WebElement serviceSpecialistEmailField;

    @FindBy(id = "service_specialist_fullname")
    private WebElement serviceSpecialistFullNameField;

    @FindBy(id = "fines_specialist_phone")
    private WebElement finesSpecialistPhoneField;

    @FindBy(id = "economic_contact_phone")
    private WebElement economyContactPhoneField;

    @FindBy(id = "accountant_fullname")
    private WebElement accountFullNameField;

    @FindBy(id = "accountant_email")
    private WebElement accountEmailField;

    @FindBy(id = "service_specialist_phone")
    private WebElement serviceSpecialistPhoneField;

    @FindBy(id = "fines_specialist_fullname")
    private WebElement finesSpecialistFullNameField;

    @FindBy(id = "fines_specialist_email")
    private WebElement finesSpecialistEmailField;

    @FindBy(id = "marketing_contact_person_fullname")
    private WebElement marketingContactPersonFullNameField;

    @FindBy(id = "marketing_contact_email")
    private WebElement marketingContactEmailField;

    @FindBy(id = "marketing_contact_phone")
    private WebElement marketingContactPhoneField;

    @FindBy(css = "li.hidden-xs:nth-child(6) > a:nth-child(1)")
    private WebElement otherContractTermsBtn;

    @FindBy(id = "supplier_requests_email")
    private WebElement supplierRequestsEmailField;

    @FindBy(id = "edi_operator_name")
    private WebElement ediOperatorNameField;

    @FindBy(id = "supplier_gnl_code")
    private WebElement supplierGnlCodeField;

    @FindBy(id = "edi_operator_edrpou")
    private WebElement ediOperatorEdrpouField;

    @FindBy(xpath = "//div[@class='panel panel-default tab-panel-5']//option[2]")
    private WebElement payerStatusField;

    @FindBy(id = "auth_sign_acc_docs_fullname_supplier")
    private WebElement authSignAccDocField;

    @FindBy(id = "auth_sign_acc_docs_discount_act_fullname_supplier")
    private WebElement authSignAccDocDiscountField;

    @FindBy(css = "li.hidden-xs:nth-child(7) > a:nth-child(1)")
    private WebElement graphicBtn;

    @FindBy(xpath = "//select[@id='distribution_center_supply_contract_p']//option[contains(text(),', 23')]")
    private WebElement contractDeliveryFieldClick;

    @FindBy(xpath = "//select[@id='supply_schedule_supply_contract_p_pc_1_type']//option[contains(text(),'14')]")
    private WebElement graphicTypeFieldClick;

    @FindBy(id = "supply_schedule_supply_contract_p_pc_1_is_typical")
    private WebElement supplyScheduleContractCheckboxClick;

    @FindBy(xpath = "//div[@id='supply_schedule_supply_contract_p_block_pc_1']//option[4]")
    private WebElement typicallySupplySaturdayFieldClick;

    @FindBy(css = "li.hidden-xs:nth-child(8) > a:nth-child(1)")
    private WebElement specificationBtn;

    @FindBy(id = "packaging_specification_name0")
    private WebElement packagingSpecificationField;

    @FindBy(xpath = "//div[@id='tab-content-7']//option[3]")
    private WebElement packFullNameFieldClick;

    @FindBy(id = "packaging_specification_pallet_type0")
    private WebElement pelletTypeField;

    @FindBy(xpath = "//input[@id='packaging_specification_replacement_cost0']")
    private WebElement packagingSpecificationReplacementCostField;

    @FindBy(id = "SAVE")
    private WebElement saveBtn;

    @FindBy(id = "confirmKlpBtn")
    private WebElement confirmBtn;

    @FindBy(xpath = "//li[4]//a[1]//div[2]")
    private WebElement sendOnRevisionBtn;

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

    public void contractClick() {
        contracts.click();
    }

    public void contractCreationRequestsClick() {
        contractCreationRequests.click();
    }

    public void needProviderAcceptClick() {
        needProviderAccept.click();
    }

    public void tabRequestClick() {
        tabRequestElement.click();
    }

    public void editBtnClick() {
        editBtn.click();
    }

    public void scanCopiesBtnClick() {
        scanCopiesBtn.click();
    }

    public void fileEdrBtnClick(String file) {
        fileEdrBtn.sendKeys(file);
    }

    public void filePayerRegisterBtnClick(String file) {
        filePayerRegisterBtn.sendKeys(file);
    }

    public void filePassportCopyBtnClick(String file) {
        filePassportCopyBtn.sendKeys(file);
    }

    public void fileStateRegistrationBtnClick(String file) {
        fileStateRegistrationBtn.sendKeys(file);
    }

    public void fileTaxBtnClick(String file) {
        fileTaxBtn.sendKeys(file);
    }

    public void fileBankReferenceBtnClick(String file) {
        fileBankReferenceBtn.sendKeys(file);
    }

    public void propsBtnClick() {
        propsBtn.click();
    }

    public void signatoryPosition(String position) {
        signatoryPositionField.sendKeys(position);
    }

    public void workOnBaseBtnClick() {
        workOnBaseBtn.click();
    }

    public void addressField(String address) {
        addressField.sendKeys(address);
    }

    public void bankField(String bank) {
        bankField.sendKeys(bank);
    }

    public void phoneNumberField(String number) {
        phoneNumberField.sendKeys(number);
    }

    public void signatoryFullNameField(String fullName) {
        signatoryFullNameField.sendKeys(fullName);
    }

    public void correspondenceAddressField(String address) {
        correspondenceAddressField.sendKeys(address);
    }

    public void bankAccountField(String account) {
        bankAccountField.sendKeys(account);
    }

    public void mfoField(String mfo) {
        mfoField.sendKeys(mfo);
    }

    public void supplierEmailField(String email) {
        supplierEmailField.sendKeys(email);
    }

    public void contactsBtnClick() {
        contactsBtn.click();
    }

    public void contactPersonField(String person) {
        contactPersonField.sendKeys(person);
    }

    public void contactEmailField(String email) {
        contactEmailField.sendKeys(email);
    }

    public void directorPhoneField(String phone) {
        directorPhoneField.sendKeys(phone);
    }

    public void contactPhoneField(String phone) {
        contactPhoneField.sendKeys(phone);
    }

    public void directorFullNameField(String name) {
        directorFullNameField.sendKeys(name);
    }

    public void directorEmailField(String email) {
        directorEmailField.sendKeys(email);
    }

    public void salesContactPersonNameField(String name) {
        salesContactPersonNameField.sendKeys(name);
    }

    public void salesContactEmailField(String email) {
        salesContactEmailField.sendKeys(email);
    }

    public void salesContactPhoneField(String phone) {
        salesContactPhoneField.sendKeys(phone);
    }

    public void economyContactPersonFullNameField(String name) {
        economyContactPersonFullNameField.sendKeys(name);
    }

    public void economyContactEmailField(String email) {
        economyContactEmailField.sendKeys(email);
    }

    public void accountPhoneField(String phone) {
        accountPhoneField.sendKeys(phone);
    }

    public void serviceSpecialistEmailField(String email) {
        serviceSpecialistEmailField.sendKeys(email);
    }

    public void serviceSpecialistFullNameField(String name) {
        serviceSpecialistFullNameField.sendKeys(name);
    }

    public void finesSpecialistPhoneField(String phone) {
        finesSpecialistPhoneField.sendKeys(phone);
    }

    public void economyContactPhoneField(String phone) {
        economyContactPhoneField.sendKeys(phone);
    }

    public void accountFullNameField(String name) {
        accountFullNameField.sendKeys(name);
    }

    public void accountEmailField(String email) {
        accountEmailField.sendKeys(email);
    }

    public void serviceSpecialistPhoneField(String phone) {
        serviceSpecialistPhoneField.sendKeys(phone);
    }

    public void finesSpecialistFullNameField(String name) {
        finesSpecialistFullNameField.sendKeys(name);
    }

    public void finesSpecialistEmailField(String email) {
        finesSpecialistEmailField.sendKeys(email);
    }

    public void marketingContactPersonFullNameField(String name) {
        marketingContactPersonFullNameField.sendKeys(name);
    }

    public void marketingContactEmailField(String email) {
        marketingContactEmailField.sendKeys(email);
    }

    public void marketingContactPhoneField(String phone) {
        marketingContactPhoneField.sendKeys(phone);
    }

    public void otherContractTermsBtnClick() {
        otherContractTermsBtn.click();
    }

    public void supplierRequestsEmailField(String email) {
        supplierRequestsEmailField.sendKeys(email);
    }

    public void ediOperatorNameField(String name) {
        ediOperatorNameField.sendKeys(name);
    }

    public void supplierGnlCodeField(String code) {
        supplierGnlCodeField.sendKeys(code);
    }

    public void ediOperatorEdrpouField(String code) {
        ediOperatorEdrpouField.sendKeys(code);
    }

    public void payerStatusFieldClick() {
        payerStatusField.click();
    }

    public void authSignAccDocField(String name) {
        authSignAccDocField.sendKeys(name);
    }

    public void authSignAccDocDiscountField(String name) {
        authSignAccDocDiscountField.sendKeys(name);
    }

    public void specificationBtnClick() {
        specificationBtn.click();
    }

    public void packagingSpecificationField(String spec) {
        packagingSpecificationField.sendKeys(spec);
    }

    public void packFullNameFieldClick() {
        packFullNameFieldClick.click();
    }

    public void pelletTypeField(String type) {
        pelletTypeField.sendKeys(type);
    }

    public void saveBtnClick() {
        saveBtn.click();
    }

    public void confirmBtnClick() {
        confirmBtn.click();
    }

    public void sendOnRevisionBtnClick() {
        sendOnRevisionBtn.click();
    }

}
