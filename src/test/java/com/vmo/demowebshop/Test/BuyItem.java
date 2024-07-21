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
        BuyItemPageObject buyItemPageObject = new BuyItemPageObject();

        buyItemPageObject.openUrl("https://demowebshop.tricentis.com/");
        buyItemPageObject.verifyTitle("Demo Web Shop");
        buyItemPageObject.clickDigitalDownload();
        buyItemPageObject.verifyTitle("Demo Web Shop. Digital downloads");
        buyItemPageObject.clickBtnAddToCart();
        buyItemPageObject.verifyMessageAlert();
        buyItemPageObject.clickShoppingCart();
        buyItemPageObject.verifyTitle("Demo Web Shop. Shopping Cart");
        buyItemPageObject.clickCheckBoxTermOfService();
        buyItemPageObject.clickCheckout();
        buyItemPageObject.clickCheckoutAsGuest();
        buyItemPageObject.fillInfoBillingAddress(DataUtil.getData().getFirstName(), DataUtil.getData().getLastName(), DataUtil.getData().getEmailAddress(), Country, dataUtil.getCityName(), DataUtil.getData().getFullAddress(), DataUtil.getData().getZipCode(), DataUtil.getData().getPhoneNumber());
        buyItemPageObject.clickContinueCheckout();
        buyItemPageObject.verifyPaymentMethodIsDisplayed();
        buyItemPageObject.clickContinuePayment();
        buyItemPageObject.verifyMessagePayByCOD();
        buyItemPageObject.verifyName(DataUtil.getData().getFirstName().concat(DataUtil.getData().getLastName()));
        buyItemPageObject.verifyEmail( DataUtil.getData().getEmailAddress());
        buyItemPageObject.verifyPhone(DataUtil.getData().getPhoneNumber());
        buyItemPageObject.verifyAddress(DataUtil.getData().getFullAddress());
        String cityZipCodeInput = DataUtil.getData().getCityName() + ' '+ ','+' '+ DataUtil.getData().getZipCode();
        buyItemPageObject.verifyCityZipCode(cityZipCodeInput);
        buyItemPageObject.verifyCountry(Country);
        buyItemPageObject.verifyPaymentMethod(paymentMethod);
        //buyItem.verifyTotal();
        buyItemPageObject.clickConfirmPaymentMethod();
        buyItemPageObject.verifyMessageCompleted();
        buyItemPageObject.clickContinueCompleted();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        cleanBrowserAndDriver();
    }
}
