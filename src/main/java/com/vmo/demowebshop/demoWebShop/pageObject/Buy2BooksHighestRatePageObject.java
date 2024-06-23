package com.vmo.demowebshop.demoWebShop.pageObject;

import com.vmo.demowebshop.common.BasePage;
import com.vmo.demowebshop.demoWebShop.interfaces.BookUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Buy2BooksHighestRatePageObject extends BasePage {
    private WebDriver driver;
    protected WebDriverWait waitDriver;

    public Buy2BooksHighestRatePageObject(WebDriver driver, WebDriverWait waitDriver) {
        this.driver = driver;
        this.waitDriver = waitDriver;
    }

    public void openUrl(String value) {
        openUrl(driver, value);
    }

    public void verifyCurrentUrl(String url) {

        Assert.assertEquals(getCurrentUrl(driver), "https://demowebshop.tricentis.com/");
    }
    public void Login() {
        clickToElement(driver, BookUI.BOOK_TAG);
    }
    public void Select2ProductHighestRatings() {

        List<WebElement> productRatings = driver.findElements(By.xpath(BookUI.LIST_RATING));
        List<Integer> listRatings = new ArrayList<Integer>();

        for (WebElement rating: productRatings) {
        listRatings.add(Integer.parseInt(rating.getAttribute("style").replaceAll("[^0-9]", "")));
    }

      Collections.sort(listRatings,Collections.reverseOrder());
        for (Integer listText : listRatings) {
        System.out.println(listText);
    }
        for (int i=1; i < 3; i++){

        clickToElement(driver,BookUI.ADD_TO_CART_BTN,"text",Integer.toString(listRatings.get(i)));
        elementIsVisible(driver,BookUI.MESSAGE);
    }
        }
    public void hoverOnShoppingCart(){
        hoverMouseToElement(driver,BookUI.SHOPPING_CART);
    }

}
