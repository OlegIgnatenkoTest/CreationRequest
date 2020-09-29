package oldRequestCreation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.io.IOException;

public class RequestCreation extends WebDriverSettings {

    public void kmRequestCreation() throws IOException {
        driver.findElement(By.id(PROVIDERS)).click();
        driver.findElement(By.xpath(PROVIDERS_SUB)).click();

        driver.findElement(By.xpath(OPEN_FILTER)).click();
        driver.findElement(By.id(NAME)).clear();
        driver.findElement(By.id(NAME)).sendKeys("Рияд");
        scrollDown();

        driver.findElement(By.id(SEARCH_BTN)).click();
        driver.findElement(By.xpath(RIYAD_PROV)).click();
    }

    public void createBtnClick() throws InterruptedException {
        sleep();
        driver.findElement(By.xpath(CREATE_CONTRACT_REQUEST_BUTTON)).click();
        driver.findElement(By.cssSelector(KM_FIELD_BUTTON)).click();
    }

    public void fillFields() throws InterruptedException {
        driver.findElement(By.xpath(REASON_CONTRACT_OPT2)).click();
        driver.findElement(By.xpath(CONTRACTS_EXAMPLE_OPT3)).click();
        driver.findElement(By.id(CONTRACT_REGISTRATION_NUMBER)).sendKeys("123455432");
        driver.findElement(By.id(START_DATE)).click();
        driver.findElement(By.xpath(START_DATE_DAY)).click();
        sleep();
        driver.findElement(By.xpath(END_DATE)).click();
        driver.findElement((By.xpath(END_DATE_DAY))).click();
        scrollDown();
        driver.findElement(By.id(DELAY)).sendKeys("3");
        driver.findElement(By.id(DISCOUNT)).sendKeys("10");
        driver.findElement(By.id(PROMOTION)).sendKeys("5");
        driver.findElement(By.xpath(CONTRACT_IS_TYPICAL)).click();
        driver.findElement(By.id(DELAY_COMPENSATION)).sendKeys("10");
        driver.findElement(By.id(LOGISTIC_HRN_KG)).sendKeys("10");
        driver.findElement(By.id(COMPENSATION)).sendKeys("50");
        driver.findElement(By.id(BOOKER)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(ATB_ADDRESS)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(ATB_EMAIL)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(FULL_NAME_BOOKER_DOC)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(FULL_NAME_KEP)).sendKeys(EXAMPLE_WORD);

        sleep();
        scrollUP();
        driver.findElement(By.id(SAVE_BUTTON)).click();
        logout();
    }

    public void klpFillRequest() throws InterruptedException {
        driver.findElement(By.id(MY_CONTRACTS)).click();
        driver.findElement(By.xpath(CONTRACT_CREATE_REQUEST)).click();
        driver.findElement(By.xpath(KLP_ACCEPT_PROVIDER_BUTTON)).click();
        sleep();
        driver.findElement(By.cssSelector(LAST_TAB_REQUEST)).click();
        sleep();
        driver.findElement(By.xpath(EDIT_BUTTON)).click();
        driver.findElement(By.xpath(KLP_SCAN_DOCS_BUTTON)).click();
    }

    public void klpFillRequestFiles() {
        WebElement upload_1 = driver.findElement(By.id(FILE_DOC_EDR));
        upload_1.sendKeys(EXAMPLE_FILE);

        WebElement upload_2 = driver.findElement(By.id(FILE_DOC_COPY));
        upload_2.sendKeys(EXAMPLE_FILE);

        WebElement upload_3 = driver.findElement(By.id(FILE_DOC_REG_PDV));
        upload_3.sendKeys(EXAMPLE_FILE);

        WebElement upload_4 = driver.findElement(By.id(FILE_DOC_PROTOCOL));
        upload_4.sendKeys(EXAMPLE_FILE);

        WebElement upload_5 = driver.findElement(By.id(FILE_DOC_PASSPORT_COPY));
        upload_5.sendKeys(EXAMPLE_FILE);

        WebElement upload_6 = driver.findElement(By.id(FILE_DOC_DOV_SEND));
        upload_6.sendKeys(EXAMPLE_FILE);

        WebElement upload_7 = driver.findElement(By.id(FILE_DOC_OTHER));
        upload_7.sendKeys(EXAMPLE_FILE);

        WebElement upload_8 = driver.findElement(By.id(FILE_DOC_REGISTRATION));
        upload_8.sendKeys(EXAMPLE_FILE);

        WebElement upload_9 = driver.findElement(By.id(FILE_DOC_EDRPOU));
        upload_9.sendKeys(EXAMPLE_FILE);

        WebElement upload_10 = driver.findElement(By.id(FILE_DOC_ADDING));
        upload_10.sendKeys(EXAMPLE_FILE);

        WebElement upload_11 = driver.findElement(By.id(FILE_DOC_BOSS));
        upload_11.sendKeys(EXAMPLE_FILE);

        WebElement upload_12 = driver.findElement(By.id(FILE_DOC_BANK));
        upload_12.sendKeys(EXAMPLE_FILE);

        WebElement upload_13 = driver.findElement(By.id(FILE_DOC_CONTRACT_PROTOCOL));
        upload_13.sendKeys(EXAMPLE_FILE);

        driver.findElement(By.xpath(KLP_FIRM_DATA)).click();
    }

    public void klpFirmDataFillFields() throws InterruptedException {
        driver.findElement(By.id(POSITION)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.xpath(BASE)).click();
        driver.findElement(By.id(ADDRESS)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(BANK)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(PHONE)).sendKeys("123321231");
        driver.findElement(By.id(NAME_POD)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(ADDRESS_CORESP)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(BANK_ACCOUNT)).sendKeys("2343423413424");
        driver.findElement(By.id(MFO)).sendKeys("356345");
        driver.findElement(By.id(EMAIL_KLP_REQUEST)).sendKeys(EXAMPLE_EMAIL);
    }

    public void klpContactsFillFields() throws InterruptedException {
        sleep();
        scrollUP();
        driver.findElement(By.cssSelector(KLP_CONTACTS)).click();
        driver.findElement(By.id(KLP_GD_CONT_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_GD_CONT_EMAIL)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_GD_CONT_PHONE)).sendKeys("23562234");
        driver.findElement(By.id(KLP_GD_CONT_PHONE_CODE)).sendKeys("5143214");
        driver.findElement(By.id(KLP_GD_CONT_BOSS_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_GD_CONT_BOSS_EMAIL)).sendKeys(EXAMPLE_EMAIL);

        driver.findElement(By.id(KLP_CS_CONT_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_CS_CONT_EMAIL)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_CS_CONT_PHONE_CODE)).sendKeys("23411542");

        driver.findElement(By.id(KLP_ES_CONT_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_ES_CONT_EMAIL)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_ES_CONT_PHONE)).sendKeys("345115533");
        driver.findElement(By.id(KLP_ES_CONT_NAME_OTV)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_ES_CONT_EMAIL_OTV)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_ES_CONT_PHONE_CODE_OTV)).sendKeys("6363623");
        driver.findElement(By.id(KLP_ES_CONT_PHONE_CODE)).sendKeys("36611244");
        driver.findElement(By.id(KLP_ES_CONT_NAME_BUH)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_ES_CONT_EMAIL_BUH)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_ES_CONT_PHONE_OTV)).sendKeys("247322265");
        driver.findElement(By.id(KLP_ES_CONT_NAME_OTV_PAY)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_ES_CONT_EMAIL_OTV_PAY)).sendKeys(EXAMPLE_EMAIL);

        driver.findElement(By.id(KLP_SM_CONT_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_SM_CONT_EMAIL)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_SM_CONT_PHONE)).sendKeys("3427995558");
        scrollUP();
        driver.findElement(By.cssSelector(KLP_OTHER_TERMS_BUTTON)).click();

        driver.findElement(By.id(KLP_OTHER_EMAIL)).sendKeys(EXAMPLE_EMAIL);
        driver.findElement(By.id(KLP_OTHER_EDI)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_OTHER_GLN_EDI)).sendKeys("2432532525245");
        driver.findElement(By.id(KLP_OTHER_EDRPOU_EDI)).sendKeys("23525352");
        driver.findElement(By.xpath(KLP_OTHER_STATUS)).click();
        driver.findElement(By.id(KLP_OTHER_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_OTHER_NAME_ACT)).sendKeys(EXAMPLE_WORD);
    }

    public void klpGraphicFillFields() throws InterruptedException {
        driver.findElement(By.cssSelector(KLP_GRAPHIC_BUTTON)).click();
        sleep();
        driver.findElement(By.xpath(KLP_GRAPHIC_NAME_RC)).click();
        driver.findElement(By.xpath(KLP_GRAPHIC_NAME_GR)).click();
        driver.findElement(By.xpath(KLP_GRAPHIC_VARIANT)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.xpath(KLP_GRAPHIC_FREQUENCY)).sendKeys("3");
        driver.findElement(By.xpath(KLP_GRAPHIC_DAY_REQUEST)).click();
        driver.findElement(By.xpath(KLP_GRAPHIC_DAY_PRODUCT)).click();
        driver.findElement(By.xpath(KLP_GRAPHIC_TIME_REQUEST)).sendKeys("12:00");
        driver.findElement(By.xpath(KLP_GRAPHIC_TIME_PRODUCT_REC)).sendKeys("15:22");
        driver.findElement(By.xpath(KLP_GRAPHIC_TIME_PRODUCT_LAST)).sendKeys("20:22");
        WebElement upload = driver.findElement(By.xpath(KLP_GRAPHIC_PICTURE));
        upload.sendKeys(EXAMPLE_FILE);
    }

    public void klpSpecificationFillFields() {
        scrollUP();
        driver.findElement(By.cssSelector(KLP_SPECIFICATION_BUTTON)).click();
        driver.findElement(By.id(KLP_SPECIFICATION_ART)).sendKeys("32251313566");
        driver.findElement(By.id(KLP_SPECIFICATION_FULL_NAME)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_SPECIFICATION_TYPE)).sendKeys(EXAMPLE_WORD);
        driver.findElement(By.id(KLP_SPECIFICATION_PRICE)).clear();
        driver.findElement(By.id(KLP_SPECIFICATION_PRICE)).sendKeys("524");
    }

    public void klpRequestSave() throws InterruptedException {
        scrollUP();
        driver.findElement(By.id(SAVE_BUTTON)).click();
        sleep();
        driver.findElement(By.id(KLP_CONFIRM_BUTTON)).click();
    }

    public void kmRequestBack() throws InterruptedException {
        driver.findElement(By.id(CONTRACTS)).click();
        driver.findElement(By.xpath(CONTRACT_REQUESTS)).click();
        driver.findElement(By.cssSelector(KM_FIRST_TABLE_ELEMENT)).click();
        driver.findElement(By.id(KM_SENDBACK_BUTTON)).click();
        sleep();
        logout();
    }

    public void klpConfirm() throws InterruptedException {
        loginKLP();
        driver.findElement(By.id(MY_CONTRACTS)).click();
        driver.findElement(By.xpath(CONTRACT_CREATE_REQUEST)).click();
        driver.findElement(By.xpath(KLP_SEND_ON_REVISION)).click();
        sleep();
        driver.findElement(By.cssSelector(KM_FIRST_TABLE_ELEMENT)).click();
        driver.findElement(By.id(KLP_CONFIRM_BUTTON)).click();

        logout();
        sleep();
    }

    public void kmConfirm() throws InterruptedException {
        loginKM();
        driver.findElement(By.id(CONTRACTS)).click();
        driver.findElement(By.xpath(CONTRACT_REQUESTS)).click();
        driver.findElement(By.cssSelector(LAST_TAB_REQUEST)).click();
        driver.findElement(By.id(KM_CONFIRM_BUTTON)).click();
        String s = driver.findElement(By.cssSelector(KM_KMPRIME)).getText();
        Assert.assertEquals(s, "KMprime");
        logout();
    }
}
