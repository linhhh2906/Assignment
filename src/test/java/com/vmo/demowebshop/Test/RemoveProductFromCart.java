package com.vmo.demowebshop.Test;

import com.vmo.demowebshop.common.BaseTest;
import com.vmo.demowebshop.demoWebShop.interfaces.RemoveCartUI;
import com.vmo.demowebshop.demoWebShop.pageObject.RemoveCartPageObject;
import com.vmo.demowebshop.helper.TestListener;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
@Listeners(TestListener.class)
@Epic("demowebshop")
@Feature("RemoveProductPageObject")
@Story("RemoveProductFromCart")

public class RemoveProductFromCart extends BaseTest {
    WebDriver driver;
    RemoveCartPageObject removeCartPageObject;
    String productName_1 = "14.1-inch Laptop";
    String productName_2 = "Build your own cheap computer";
    String productName_3 = "Build your own expensive computer";
    @Parameters("browser")
    @BeforeMethod
    public void setup() {
        driver = getDriverBrowser("CHROME");
        driver.manage().window().maximize();
    }
    @Epic("demowebshop")
    @Feature("RemovelCartPageObjet")
    @Story("RemoveProductFromCart")

    @Test()
    public void TCO3_RemoveProductFromCart ()  {
        RemoveCartPageObject removeCartPageObject = new RemoveCartPageObject();

        removeCartPageObject.openUrl("https://demowebshop.tricentis.com/");
        removeCartPageObject.verifyCurrentUrl();
        removeCartPageObject.addBookToCart(productName_1,"1");
        removeCartPageObject.addBookToCart(productName_1,"2");
        removeCartPageObject.addBookToCart(productName_1,"3");
        removeCartPageObject.openShoppingCart();
        removeCartPageObject.verifyCartBeforeRemove();
        removeCartPageObject.selectProductRemove(productName_1);
        removeCartPageObject.updateCart();
        removeCartPageObject.verifyCartAfterRemove();

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        cleanBrowserAndDriver();
    }
}
