package requestCreationPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoD_Page {

    public WebDriver driver;

    public HoD_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "grouptab_1")
    private WebElement contractsPanelBtn;

    @FindBy(xpath = "//li[3]//span[2]//ul[1]//li[1]//a[1]")
    private WebElement contractCreationRequests;

    @FindBy(xpath = "//li[2]//a[1]//div[2]")
    private WebElement listOFRequestsBtn;

    @FindBy(css = "#MassUpdate > div.list-view-rounded-corners > table > tbody > tr:nth-child(1) > td:nth-child(3) > b")
    private WebElement tabElementClick;

    @FindBy(id = "agreeHeadBtn")
    private WebElement agreementBtn;

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

    public void contractsPanelBtnClick() {
        contractsPanelBtn.click();
    }

    public void contractCreationRequestsClick() {
        contractCreationRequests.click();
    }

    public void listOFRequestsBtnClick() {
        listOFRequestsBtn.click();
    }

    public void tabElementClick() {
        tabElementClick.click();
    }

    public void agreementBtnClick() {
        agreementBtn.click();
    }

}
