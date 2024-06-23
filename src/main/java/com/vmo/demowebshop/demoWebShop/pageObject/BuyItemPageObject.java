package com.vmo.demowebshop.demoWebShop.pageObject;

import com.vmo.demowebshop.common.BasePage;
import com.vmo.demowebshop.demoWebShop.interfaces.BuyItemUI;
import com.vmo.demowebshop.helper.Log;
import com.vmo.demowebshop.utils.DataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BuyItemPageObject extends BasePage {
    private WebDriver driver;
    protected WebDriverWait waitDriver;

    public BuyItemPageObject(WebDriver driver, WebDriverWait waitDriver) {
        this.driver = driver;
        this.waitDriver = waitDriver;
    }

    public void openUrl( String value) {
        openUrl(driver, value);
    }

    public void verifyTitle(String value) {
        Assert.assertEquals(driver.getTitle(), value);
        Log.allure("Open DemoWebShop page");
    }
    public void clickDigitalDownload(){
        clickToElement(driver, BuyItemUI.DIGITAL_DOWNLOAD);
    }
    public void clickBtnAddToCart(){
        clickToElement(driver,BuyItemUI.ADD_TO_CART_BTN);
    }
    public void verifyMessageAlert(){
        elementIsVisible(driver,BuyItemUI.MESSAGE);
    }
    public void clickShoppingCart(){
        clickToElement(driver,BuyItemUI.SHOPPING_CART);
    }
    public void clickCheckBoxTermOfService(){
        clickToElement(driver,BuyItemUI.TERM_OF_SERVICE_CHECKBOX);
    }
    public void clickCheckout(){
        clickToElement(driver,BuyItemUI.CHECKOUT_BTN);
    }
    public void clickCheckoutAsGuest(){
        clickToElement(driver,BuyItemUI.CHECK_OUT_AS_GUEST_BTN);
    }
    public void fillInfoBillingAddress(String FirstName,String LastName,String Email,String Country,String City
            ,String Address1,String ZipCode,String Phone){
        sendKeysToElement(driver,BuyItemUI.FIRSTNAME_TEXTBOX, DataUtil.getData().getFirstName());
        sendKeysToElement(driver,BuyItemUI.LASTNAME_TEXTBOX,DataUtil.getData().getLastName());
        sendKeysToElement(driver,BuyItemUI.EMAIL_TEXTBOX,DataUtil.getData().getEmailAddress());
        selectOption(driver,BuyItemUI.COUNTRY_DROPDOWNLIST, Country);
        sendKeysToElement(driver,BuyItemUI.CITY_TEXTBOX,DataUtil.getData().getCityName());
        sendKeysToElement(driver,BuyItemUI.ADDRESS_TEXTBOX,DataUtil.getData().getFullAddress());
        sendKeysToElement(driver,BuyItemUI.ZIPCODE_TEXTBOX,DataUtil.getData().getZipCode());
        sendKeysToElement(driver,BuyItemUI.PHONE_TEXTBOX,DataUtil.getData().getPhoneNumber());
    }
    public void clickContinueCheckout(){
        clickToElement(driver,BuyItemUI.CONTINUE_CHECKOUT);
    }
    public void verifyPaymentMethodIsDisplayed() {
        elementIsVisible(driver, BuyItemUI.CASH_ON_DELIVERY);
    }
    public void clickContinuePayment(){
        clickToElement(driver,BuyItemUI.CONTINUE_PAYMENT);
    }
    public void verifyMessagePayByCOD() {
        elementIsVisible(driver, BuyItemUI.MESSAGE_PAY_BY_COD);
    }
        public void verifyName(String nameInput){
            String getName = getTextElement(driver,BuyItemUI.CONFIRM_NAME);
            Assert.assertTrue(getName.contains(nameInput));
        }
        public void verifyEmail(String emailInput){
            String getEmail = getTextElement(driver,BuyItemUI.CONFIRM_EMAIL);
            Assert.assertTrue(getEmail.contains(emailInput));
        }
        public void verifyPhone(String phoneInput){
            String getEmail = getTextElement(driver,BuyItemUI.CONFIRM_PHONE);
            Assert.assertTrue(getEmail.contains(phoneInput));
        }
        public void verifyAddress(String addressInput){
            String getEmail = getTextElement(driver,BuyItemUI.CONFIRM_ADDRESS1);
            Assert.assertTrue(getEmail.contains(addressInput));
        }
        public void verifyCityZipCode(String cityZipCodeInput){
            String getCityZipCode = getTextElement(driver,BuyItemUI.CONFIRM_CITY_STATE_ZIP);
            Assert.assertTrue(getCityZipCode.contains(cityZipCodeInput));
        }
        public void verifyCountry(String country){
            String getEmail = getTextElement(driver,BuyItemUI.CONFIRM_COUNTRY);
            Assert.assertTrue(getEmail.contains(country));
        }

        public void verifyPaymentMethod(String getTextPaymentMethodOption){
            String getTextOfPaymentMethod = getTextElement(driver,BuyItemUI.CONFIRM_PAYMENT_METHOD);
            Assert.assertTrue(getTextPaymentMethodOption.contains(getTextOfPaymentMethod));
        }

        public void clickConfirmPaymentMethod(){
            clickToElement(driver,BuyItemUI.CONFIRM_PAYMENT_METHOD);
        }
        public void verifyMessageCompleted(){
            elementIsVisible(driver,BuyItemUI.MESSAGE_COMPLETED);
        }
        public void clickContinueCompleted(){
            clickToElement(driver,BuyItemUI.CONTINUE_COMPLETED);
        }

    }
