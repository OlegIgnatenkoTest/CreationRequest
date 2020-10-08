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

    @FindBy(xpath = "//select[@id='status']//option[2]")
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

    @FindBy(xpath = "//body/div[@id='bootstrap-container']/div[@id='content']/form[@id='EditView']/div[@id='EditView_tabs']/ul[@class='nav nav-tabs']/li[2]")
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





    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 3000)", "");
    }

    public void productPanelClick(){
        productPanel.click();
    }

    public void productsTabClick(){
        productsTab.click();
    }

    public void createProductBtnClick(){
        createProductBtn.click();
    }

    public void productNameFieldFill(String name){
        productNameField.sendKeys(name);
    }

    public void productCodeField(String code){
        codeField.sendKeys(code);
    }

    public void statusChooseClick(){
        statusChoose.click();
    }

    public void categoryChooseClick(){
        categoryChoose.click();
    }

    public void productCategoryClick(){
        productCategory.click();
    }

    public void productClassClick(){
        productClass.click();
    }

    public void productSubClassClick(){
        productSubClass.click();
    }

    public void chooseProviderBtnClick(){
        chooseProviderBtn.click();
    }

    public void switchOnProviderWindow(){
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

    public void searchContract(){

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

    public void vghBtnClick(){
        VGHBtn.click();
    }

    public void packInsideFieldFill(String pack){
        packInsideField.sendKeys(pack);
    }

    public void layerBoxFieldFill(String box){
        layerBoxField.sendKeys(box);
    }

    public void layerPcsFieldFill(String pcs){
        layerPcsField.sendKeys(pcs);
    }

    public void paletteBoxFieldFill(String palette){
        paletteBoxField.sendKeys(palette);
    }

    public void maxDeviationGrossFieldFill(String deviation){
        maxDeviationGrossField.sendKeys(deviation);
    }

    public void weightPcsFieldFill(String weight){
        weightPcsField.sendKeys(weight);
    }

    public void widthProductFieldFill(String width){
        widthProductField.sendKeys(width);
    }

    public void lengthProductFieldFill(String length){
        lengthProductField.sendKeys(length);
    }

    public void weightPackFieldFill(String weight){
        weightPackField.sendKeys(weight);
    }

    public void weightPcsNetFieldFill(String weight){
        weightPcsNetField.sendKeys(weight);
    }

    public void heightProductFieldFill(String height){
        heightProductField.sendKeys(height);
    }

    public void volumeProductFieldFill(String volume){
        volumeProductField.sendKeys(volume);
    }










}
