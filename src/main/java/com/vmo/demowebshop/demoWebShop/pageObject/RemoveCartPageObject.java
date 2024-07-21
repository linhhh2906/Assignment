package com.vmo.demowebshop.demoWebShop.pageObject;

import com.vmo.demowebshop.common.BasePage;
import com.vmo.demowebshop.demoWebShop.interfaces.RemoveCartUI;
import com.vmo.demowebshop.helper.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RemoveCartPageObject extends BasePage {
    private WebDriver driver;
    protected WebDriverWait waitDriver;

    public RemoveCartPageObject(WebDriver driver, WebDriverWait waitDriver) {
        this.driver = driver;
        this.waitDriver = waitDriver;
    }

    public RemoveCartPageObject() {

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
    public void addBookToCart(String productName ,String number) {
        clickToElement(driver, RemoveCartUI.ADD_TO_CART_BTN, "titleProduct", productName);

        waitForElementInvisible(driver, RemoveCartUI.ICON_LOADING);
        String getTitle = driver.getTitle();
        if (getTitle.equals("Demo Web Shop")) {

            waitForElementInvisible(driver, RemoveCartUI.MESSAGE);
            refreshCurrentPage(driver);
        } else {
            refreshCurrentPage(driver);

            elementIsVisible(driver, RemoveCartUI.MESSAGE);
            waitForElementInvisible(driver, RemoveCartUI.MESSAGE);
            clickToElement(driver, RemoveCartUI.BACK_HOME);
        }
    }
    public void openShoppingCart (){
            clickToElement(driver,RemoveCartUI.SHOPPING_CART);
    }
    public void verifyCartBeforeRemove(){
        String before = getTextElement(driver, RemoveCartUI.CART_QUANTITY.replaceAll("[^0-9]", ""));
        Assert.assertEquals(before, 3);
    }
    public void selectProductRemove(String productName) {
            clickToElement(driver,RemoveCartUI.CHECKBOX_REMOVE,"nameProduct",productName);
    }
    public void verifyProductIsSelected(){
        WebElement verifySelected = driver.findElement(By.xpath(RemoveCartUI.CHECKBOX_REMOVE));
        Assert.assertTrue(verifySelected.isSelected());
    }
    public void updateCart(){
        clickToElement(driver, RemoveCartUI.UPDATE_CART_BTN);
    }
    public void verifyCartAfterRemove(){
        String before = getTextElement(driver, RemoveCartUI.CART_QUANTITY.replaceAll("[^0-9]", ""));
        Assert.assertEquals(before, 2);
    }

}
