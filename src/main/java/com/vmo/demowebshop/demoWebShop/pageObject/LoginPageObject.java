package com.vmo.demowebshop.demoWebShop.pageObject;

import com.vmo.demowebshop.common.BasePage;
import com.vmo.demowebshop.demoWebShop.interfaces.LoginElementUI;
import com.vmo.demowebshop.helper.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class LoginPageObject extends BasePage {
    private WebDriver driver;
    protected WebDriverWait waitDriver;

    public LoginPageObject(WebDriver driver, WebDriverWait waitDriver) {
        this.driver = driver;
        this.waitDriver = waitDriver;

    }

    public void openUrl(String value) {
        openUrl(driver, value);
    }

    public void verifyCurrentUrl() {

        Assert.assertEquals(getCurrentUrl(driver), "https://demowebshop.tricentis.com/");
    }

    public void verifyTitle(String value) {
        Assert.assertEquals(driver.getTitle(), value);
        Log.allure("Open DemoWebShop page");
    }

    public void Login() {
        clickToElement(driver, LoginElementUI.LOGIN);
    }

    public void inputEmail(String value) {
        sendKeysToElement(driver, LoginElementUI.EMAIL_TEXTBOX, value);
        Log.allure("Input email success");
    }

    public void inputPassWord(String value) {
        sendKeysToElement(driver, LoginElementUI.PASSWORD_TEXTBOX, value);
        Log.allure("Input password success");
    }

    public void clickBtnLogin() {
        clickToElement(driver, LoginElementUI.LOGIN_BTN);
        Log.allure("Login success");
    }

    public void verifyLoginSuccessfully() {
        elementIsVisible(driver, LoginElementUI.LOGOUT);
    }
}
