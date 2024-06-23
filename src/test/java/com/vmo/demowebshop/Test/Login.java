package com.vmo.demowebshop.Test;

import com.vmo.demowebshop.common.BaseTest;
import com.vmo.demowebshop.demoWebShop.pageObject.LoginPageObject;
import com.vmo.demowebshop.helper.TestListener;
import com.vmo.demowebshop.utils.ExcelUtil;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

@Listeners(TestListener.class)
@Epic("demowebshop")
@Feature("LoginPageObject")
@Story("Login")

public class Login extends BaseTest {
    private WebDriver driver;
    private LoginPageObject LoginPageObject;

    ExcelUtil excelUtil = new ExcelUtil("C:/Users/linhn/Downloads/Assignment.xlsx");

    @DataProvider(name = "dataLogin")

    public Object[][] getCredential() {
        return excelUtil.data();
    }

    @Parameters("browser")
    @BeforeMethod
    public void setup() {
        driver = getDriverBrowser("CHROME");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "dataLogin")
    public void TC01_Login(String Status, String UserName, String PassWord, String ExpectedMessage) {
        LoginPageObject.openUrl("https://demowebshop.tricentis.com/");
        LoginPageObject.verifyTitle("Demo Web Shop");
        LoginPageObject.clickBtnLogin();
        LoginPageObject.verifyTitle("Demo Web Shop. Login");
        LoginPageObject.inputEmail(UserName);
        LoginPageObject.inputPassWord(PassWord);
        LoginPageObject.clickBtnLogin();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        cleanBrowserAndDriver();
    }
}
