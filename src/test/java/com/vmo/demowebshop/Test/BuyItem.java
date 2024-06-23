package com.vmo.demowebshop.Test;

import com.vmo.demowebshop.common.BaseTest;
import com.vmo.demowebshop.demoWebShop.pageObject.BuyItemPageObject;
import com.vmo.demowebshop.helper.TestListener;
import com.vmo.demowebshop.utils.DataUtil;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(TestListener.class)
@Epic("demowebshop")
@Feature("BuyItemPageObject")
@Story("BuyItem")

public class BuyItem extends BaseTest {
    WebDriver driver;
    BuyItemPageObject buyItem;
    DataUtil dataUtil;
    String Country = "Viet Nam";
    String paymentMethod = "Cash On Delivery (COD)";


    @Parameters("browser")
    @BeforeMethod
    public void setup() {
        driver = getDriverBrowser("CHROME");
        driver.manage().window().maximize();
    }

    @Test()
    public void TC04_BuyItem() {
        buyItem.openUrl("https://demowebshop.tricentis.com/");
        buyItem.verifyTitle("Demo Web Shop");
        buyItem.clickDigitalDownload();
        buyItem.verifyTitle("Demo Web Shop. Digital downloads");
        buyItem.clickBtnAddToCart();
        buyItem.verifyMessageAlert();
        buyItem.clickShoppingCart();
        buyItem.verifyTitle("Demo Web Shop. Shopping Cart");
        buyItem.clickCheckBoxTermOfService();
        buyItem.clickCheckout();
        buyItem.clickCheckoutAsGuest();
        buyItem.fillInfoBillingAddress(DataUtil.getData().getFirstName(), DataUtil.getData().getLastName(), DataUtil.getData().getEmailAddress(), Country, dataUtil.getCityName(), DataUtil.getData().getFullAddress(), DataUtil.getData().getZipCode(), DataUtil.getData().getPhoneNumber());
        buyItem.clickContinueCheckout();
        buyItem.verifyPaymentMethodIsDisplayed();
        buyItem.clickContinuePayment();
        buyItem.verifyMessagePayByCOD();
        buyItem.verifyName(DataUtil.getData().getFirstName().concat(DataUtil.getData().getLastName()));
        buyItem.verifyEmail( DataUtil.getData().getEmailAddress());
        buyItem.verifyPhone(DataUtil.getData().getPhoneNumber());
        buyItem.verifyAddress(DataUtil.getData().getFullAddress());
        String cityZipCodeInput = DataUtil.getData().getCityName() + ' '+ ','+' '+ DataUtil.getData().getZipCode();
        buyItem.verifyCityZipCode(cityZipCodeInput);
        buyItem.verifyCountry(Country);
        buyItem.verifyPaymentMethod(paymentMethod);
        //buyItem.verifyTotal();
        buyItem.clickConfirmPaymentMethod();
        buyItem.verifyMessageCompleted();
        buyItem.clickContinueCompleted();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        cleanBrowserAndDriver();
    }
}
