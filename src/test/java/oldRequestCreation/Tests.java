package oldRequestCreation;


import org.testng.annotations.Test;
import java.io.IOException;

public class Tests extends RequestCreation {

    @Test(priority = 1)
    public void loginKmTest() {
        loginKM();
    }

    @Test(priority = 2)
    public void kmRequestCreateTest() throws IOException {
        kmRequestCreation();
    }

    @Test(priority = 3)
    public void clickCreateRequestBtnTest() throws InterruptedException {
        createBtnClick();
    }

    @Test(priority = 4)
    public void fillFieldsTest() throws InterruptedException {
        fillFields();
    }

    @Test(priority = 5)
    public void loginKlpTest() {
        loginKLP();
    }

    @Test(priority = 6)
    public void klpFillRequestTest() throws InterruptedException {
        klpFillRequest();
    }

    @Test(priority = 7)
    public void klpFillRequestFilesTest() {
        klpFillRequestFiles();
    }

    @Test(priority = 8)
    public void klpFirmDataFillFieldsTest() throws InterruptedException {
        klpFirmDataFillFields();
    }

    @Test(priority = 9)
    public void klpContactsFillFieldsTest() throws InterruptedException {
        klpContactsFillFields();
    }

    @Test(priority = 10)
    public void klpGraphicFillFieldsTest() throws InterruptedException {
        klpGraphicFillFields();
    }

    @Test(priority = 11)
    public void klpSpecificationFillFieldsTest() {
        klpSpecificationFillFields();
    }

    @Test(priority = 12)
    public void klpRequestSaveTest() throws InterruptedException {
        klpRequestSave();
    }

    @Test(priority = 13)
    public void klpLogoutTest() throws InterruptedException {
        logout();
    }

    @Test(priority = 14)
    public void kmLoginTest() {
        loginKM();
    }

    @Test(priority = 15)
    public void kmRequestBackTest() throws InterruptedException {
        kmRequestBack();
    }

    @Test(priority = 16)
    public void klpConfirmTest() throws InterruptedException {
        klpConfirm();
    }

    @Test(priority = 17)
    public void kmConfirmTest() throws InterruptedException {
        kmConfirm();
    }

}
