package com.vmo.demowebshop.Test;

import com.vmo.demowebshop.common.BaseTest;

import com.vmo.demowebshop.demoWebShop.pageObject.Buy2BooksHighestRatePageObject;
import com.vmo.demowebshop.helper.TestListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(TestListener.class)
@Epic("demowebshop")
@Feature("BooksPageObject")
@Story("Buy2BooksHighestRated")

public class Buy2BooksHighestRate extends BaseTest {
    WebDriver driver;
    private Buy2BooksHighestRatePageObject buy2BooksHighestRatePageObject;
    @Parameters("browser")
    @BeforeMethod
    public void setup(){
       driver = getDriverBrowser ("CHROME");
        driver.manage().window().maximize();
    }

    @Test()
    public void TCO2_Buy2BookHighestRating() {
        Buy2BooksHighestRatePageObject buy2BooksHighestRatePageObject = new Buy2BooksHighestRatePageObject(driver);

        buy2BooksHighestRatePageObject.openUrl(driver,"https://demowebshop.tricentis.com/");
        buy2BooksHighestRatePageObject.verifyCurrentPage();
        //buy2BooksHighestRatePageObject.verifyCurrentUrl();
        buy2BooksHighestRatePageObject.Select2ProductHighestRatings();
        buy2BooksHighestRatePageObject.hoverOnShoppingCart();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        cleanBrowserAndDriver();
    }

}

