package addingRole;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class AddingRolePage {

    public WebDriver driver;

    public AddingRolePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(2000L);
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 3000)", "");
    }

    public void scrollUP(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-3000)", "");
    }

	@FindBy(xpath = "//button[@id='with-label']//span[contains(text(),'Administrator')]")
	private WebElement administratorPanelBtn;

	@FindBy(xpath = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='admin_link']")
	private WebElement administrationPanelBtn;

	@FindBy(id = "user_management")
    private WebElement userManagementLink;

	@FindBy(xpath = "//li[1]//a[1]//div[2]")
    private WebElement createUserBtn;

	@FindBy(id = "user_name")
    private WebElement userNameField;

	@FindBy(id = "last_name")
    private WebElement lastNameField;

	@FindBy(id = "Users0emailAddress0")
    private WebElement userEmailField;

	@FindBy(id = "tab2")
    private WebElement passwordPanel;

	@FindBy(id = "new_password")
    private WebElement newPasswordField;

	@FindBy(id = "confirm_pwd")
    private WebElement confirmPasswordField;

	@FindBy(id = "SAVE_HEADER")
    private WebElement saveBtn;

	@FindBy(xpath = "//*[@id=\"formDetailView\"]/div/input[2]")
    private WebElement addRoleBtn;

	@FindBy(xpath = "//select[@id='user_role']//option[7]")
    public WebElement userRoleElement;

	@FindBy(id = "user_title")
    public WebElement userTitleField;

	@FindBy(id = "user_department")
    public WebElement userDepartment;

	@FindBy(css = "#user_department > option:nth-child(3)")
    public WebElement userDepartmentElement;

    @FindBy(xpath = "//div[@class='buttons']//input[3]")
    private WebElement reportToNameBtn;

    @FindBy(xpath = "//span[@class='suitepicon suitepicon-action-select']")
    private WebElement chooseLeadBtn;

    @FindBy(xpath = "/html/body/table[4]/tbody/tr[16]/td[1]/a")
    private WebElement kmPrimeLead;

    @FindBy(css = "#addRoleForm > div > div > div:nth-child(5) > input[type=button]:nth-child(1)")
    private WebElement okBtn;

    @FindBy (id = "subpanel_title_aclroles")
    private WebElement subpanelTitleRole;

    @FindBy(linkText = "КМ")
    private WebElement roleKM;



    public void administratorPanelBtnClick(){
        administratorPanelBtn.click();
    }

    public void administrationPanelBtnClick(){
        administrationPanelBtn.click();
    }

    public void userManagementLinkClick(){
        userManagementLink.click();
    }

    public void createUserBtnClick(){
        createUserBtn.click();
    }

    public void userNameFieldFill(String name){
        userNameField.sendKeys(name);
    }

    public void lastNameFieldFill(String name){
        lastNameField.sendKeys(name);
    }

    public void userEmailFieldFill(String email){
        userEmailField.sendKeys(email);
    }

    public void passwordPanelClick(){
        passwordPanel.click();
    }

    public void newPasswordFieldFill(String password){
        newPasswordField.sendKeys(password);
    }

    public void confirmPasswordFieldFill(String password){
        confirmPasswordField.sendKeys(password);
    }

    public void saveBtnClick(){
        saveBtn.click();
    }

    public void addRoleBtnIsDisplayed(){
        boolean addBtn = addRoleBtn.isDisplayed();
        System.out.println("Наличие кнопки 'Назначить роль': " + addBtn);
    }

    public void reportToNameBtnClick(){
        reportToNameBtn.click();
    }

    public void userRoleElementChoose(){
        userRoleElement.click();
    }

    public void userTitleFieldFill(String title){
        userTitleField.sendKeys(title);
    }

    public void userDepartmentElementClick() throws InterruptedException {
        userDepartment.click();
        sleep();
        userDepartmentElement.click();
    }

    public void chooseLeadBtnClick(){
        chooseLeadBtn.click();
    }

    public void leadChoosing(){
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parentWindow = itr.next();
        String newWindow = itr.next();

        driver.switchTo().window(newWindow);

        scrollDown();

        kmPrimeLead.click();
        driver.switchTo().window(parentWindow);

        okBtn.click();
    }

    public void subpanelTitleIsDisplayed(){
        boolean isDisplayed = subpanelTitleRole.isDisplayed();
        System.out.println("Наличие панели 'Роли': " + isDisplayed);
    }

    public void roleCheck(){
        subpanelTitleRole.click();
        String role = roleKM.getText();
        System.out.println("Role: " + role);
        Assert.assertEquals(role, "КМ");
    }



}
