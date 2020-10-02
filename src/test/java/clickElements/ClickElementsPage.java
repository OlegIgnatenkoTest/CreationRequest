package clickElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickElementsPage {

    public WebDriver driver;

    public ClickElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(id = "grouptab_0")
    private WebElement providersPanel;

    @FindBy(xpath = "//li[2]//span[2]//ul[1]//li[1]//a[1]")
    private WebElement providerSubPanel;

    @FindBy(xpath = "//li[2]//span[2]//ul[1]//li[2]//a[1]")
    private WebElement contactsSubPanel;

    @FindBy(xpath = "//li[2]//span[2]//ul[1]//li[3]//a[1]")
    private WebElement nonCooperatePerson;

    @FindBy(id = "grouptab_1")
    private WebElement contractsPanel;

    @FindBy(xpath = "//li[3]//span[2]//ul[1]//li[1]//a[1]")
    private WebElement contractsSubPanel;

    @FindBy(xpath = "//li[3]//span[2]//ul[1]//li[2]//a[1]")
    private WebElement contractsRequestsPanel;

    @FindBy(xpath = "//li[3]//span[2]//ul[1]//li[3]//a[1]")
    private WebElement contragentCheckRequests;

    @FindBy(xpath = "//li[3]//span[2]//ul[1]//li[4]//a[1]")
    private WebElement changeContractRequestSubPanel;

	@FindBy(id = "grouptab_2")
	private WebElement productsPanel;

	@FindBy(xpath = "//li[4]//span[2]//ul[1]//li[1]//a[1]")
	private WebElement productsSubPanel;

	@FindBy(xpath = "//button[@id='with-label']//span[@class='suitepicon suitepicon-action-current-user']")
    private WebElement userPanel;

	@FindBy(xpath = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='admin_link']")
    private WebElement administrationSubPanel;

	@FindBy(xpath = "//a[@id='user_management']")
    private WebElement userManagement;

	@FindBy(xpath = "//a[@id='roles_management']")
    private WebElement roleManagement;

	@FindBy(xpath = "//a[@id='password_management']")
    private WebElement passwordManagement;

	@FindBy(xpath = "//a[@id='securitygroup_management']")
    private WebElement securitygroupManagement;

	@FindBy(xpath = "//a[@id='securitygroup_config']")
    private WebElement securitygroupConfig;




    public void turnBack(){
        driver.navigate().back();
    }

    public void providerPanelClick(){
        providersPanel.click();
        providerSubPanel.click();
        turnBack();
    }

    public void providersContactsSubPanelClick(){
        providersPanel.click();
        contactsSubPanel.click();
        turnBack();
    }

    public void nonCooperateSubPanelClick(){
        providersPanel.click();
        nonCooperatePerson.click();
        turnBack();
    }

    public void contractPanelClick(){
        contractsPanel.click();
        contractsSubPanel.click();
        turnBack();
    }

    public void contractsRequestClick(){
        contractsPanel.click();
        contractsRequestsPanel.click();
        turnBack();
    }

    public void contragentCheckRequestsClick(){
        contractsPanel.click();
        contragentCheckRequests.click();
        turnBack();
    }

    public void changeContractRequestSubPanel(){
        contractsPanel.click();
        changeContractRequestSubPanel.click();
        turnBack();
    }

    public void productsPanelClick(){
        productsPanel.click();
        productsSubPanel.click();
        turnBack();
    }

    public void usersPanelClick(){
        userPanel.click();
    }

    public void administrationSubPanelClick(){
        administrationSubPanel.click();
    }

    public void userManagementClick(){
        userManagement.click();
        turnBack();
    }

    public void roleManagementClick(){
        roleManagement.click();
        turnBack();
    }

    public void passwordManagementClick(){
        passwordManagement.click();
        turnBack();
    }

    public void securitygroupManagementClick(){
        securitygroupManagement.click();
        turnBack();
    }

    public void securitygroupConfigClick(){
        securitygroupConfig.click();
        turnBack();
    }
}
