package columnsAndErrors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ErrorsMessageCheck {

    public WebDriver driver;

    public ErrorsMessageCheck(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "grouptab_0")
    private WebElement providersPanel;

    @FindBy(xpath = "//li[2]//span[2]//ul[1]//li[2]//a[1]")
    private WebElement contactsClick;

    @FindBy(xpath = "//li[1]//a[1]//div[2]")
    private WebElement contactsBtn;

    @FindBy(id = "Contacts0removeButton0")
    private WebElement contactsRemoveBtn;

    @FindBy(id = "Contacts0_email_widget_add")
    private WebElement contactsEmailBtn;

    @FindBy(id = "SAVE")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[@id='tab-content-0']")
    private WebElement tabContent;


    public void contactsClick() {
        providersPanel.click();
        contactsClick.click();
        contactsBtn.click();
    }

    public void contactsRemoveBtnClick() {
        contactsRemoveBtn.click();
    }

    public void contactsEmailBtnClick() {
        contactsEmailBtn.click();
    }

    public void saveBtnClick() {
        saveBtn.click();
    }

    public void tabContentCheck() {
        String errorMessage = tabContent.getText();
        Assert.assertTrue(errorMessage.contains("Відсутнє обов'язкове поле:"));
    }

}
