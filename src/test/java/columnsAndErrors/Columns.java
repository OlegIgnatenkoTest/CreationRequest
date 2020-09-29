package columnsAndErrors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Columns {

    public WebDriver driver;

    public Columns(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@id='grouptab_0']")
    private WebElement providerPanel;

    @FindBy(xpath = "//li[2]//span[2]//ul[1]//li[2]//a[1]")
    private WebElement contactsPanel;

    @FindBy(xpath = "//ul[@class='clickMenu selectmenu SugarActionMenu columnsFilterLink listViewLinkButton listViewLinkButton_top']//a[@class='glyphicon glyphicon-th-list']")
    private WebElement actionMenu;

    @FindBy(xpath = "//ul[@class='chooserList red ui-sortable']//li[1]")
    private WebElement draggable;

    @FindBy(xpath = "//ul[@class='chooserList green ui-sortable']")
    private WebElement target;

    @FindBy(xpath = "//button[@class='button red']")
    private WebElement redBtn;

    @FindBy(xpath = "//div[@id='columnsFilterDialog']//li[4]")
    private WebElement backDraggable;

    @FindBy(xpath = "//ul[@class='chooserList red ui-sortable']")
    private WebElement backTarget;


    public void providerPanelClick(){
        providerPanel.click();
    }

    public void contactPanelClick() {
        contactsPanel.click();
    }

    public void actionMenuClick() {
        actionMenu.click();
    }

    public void dragOnTarget() {
        new Actions(driver).dragAndDrop(draggable, target).perform();
    }

    public void redBtnClick() {
        redBtn.click();
    }

    public void backDragOnTarget() throws IOException {
        new Actions(driver).dragAndDrop(backDraggable, backTarget).perform();
    }

}
