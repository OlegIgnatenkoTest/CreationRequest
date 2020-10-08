package productCreation;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ProductCreationPageTest extends DriverSettings {

    @Test(priority = 1)
    public void login(){
        loginPage.inputLogin(ConfProperties.getProperty("loginAdmin"));
        loginPage.inputPassword(ConfProperties.getProperty("passwordAdmin"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void productPanelClick(){
        productCreationPage.productPanelClick();
    }

    @Test(priority = 3)
    public void productsTabClick(){
        productCreationPage.productsTabClick();
    }

    @Test(priority = 4)
    public void productCreateClick(){
        productCreationPage.createProductBtnClick();
    }

    @Test(priority = 5)
    public void productNameField(){
        productCreationPage.productNameFieldFill(ConfProperties.getProperty("exText"));
    }

    @Test(priority = 6)
    public void productCodeField(){
        productCreationPage.productCodeField(ConfProperties.getProperty("contNumb"));
    }

    @Test(priority = 7)
    public void statusChooseClick(){
        productCreationPage.statusChooseClick();
    }

    @Test(priority = 8)
    public void categoryChooseClick(){
        productCreationPage.categoryChooseClick();
    }

    @Test(priority = 9)
    public void productCategoryChooseClick(){
        productCreationPage.productCategoryClick();
    }

    @Test(priority = 10)
    public void productClassClick(){
        productCreationPage.productClassClick();
    }

    @Test(priority = 11)
    public void productSubClass(){
        productCreationPage.productSubClassClick();
    }

    @Test(priority = 12)
    public void chooseProviderBtnClick(){
        productCreationPage.chooseProviderBtnClick();
    }

    @Test(priority = 13)
    public void switchOnProviderWindow(){
        productCreationPage.switchOnProviderWindow();
    }

    @Test(priority = 14)
    public void searchContract(){
        productCreationPage.searchContract();
    }

    @Test(priority = 15)
    public void vghBtnClick(){
        productCreationPage.vghBtnClick();
    }

    @Test(priority = 16)
    public void packInsideFieldFill(){
        productCreationPage.packInsideFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 17)
    public void lawyerBoxFieldFill(){
        productCreationPage.layerBoxFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 18)
    public void layerPcsFieldFill(){
        productCreationPage.layerPcsFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 19)
    public void paletteBoxFieldFill(){
        productCreationPage.paletteBoxFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 20)
    public void maxDeviationGrossFieldFill(){
        productCreationPage.maxDeviationGrossFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 21)
    public void weightPcsFieldFill(){
        productCreationPage.weightPcsFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 22)
    public void lengthProductFieldFill(){
        productCreationPage.lengthProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 23)
    public void weightPackFieldFill(){
        productCreationPage.weightPackFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 24)
    public void weightPcsNetFieldFill(){
        productCreationPage.weightPcsNetFieldFill(ConfProperties.getProperty("exText"));
    }

    @Test(priority = 25)
    public void heightProductFieldFill(){
        productCreationPage.heightProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 26)
    public void volumeProductFieldFill(){
        productCreationPage.volumeProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }

    @Test(priority = 27)
    public void widthProductFieldFill(){
        productCreationPage.widthProductFieldFill(ConfProperties.getProperty("smallNumb"));
    }
}
