package com.vmo.demowebshop.demoWebShop.interfaces;

import static com.vmo.demowebshop.common.Locator.xpath;

public class BookUI {
    public static final String BOOK_TAG = xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]");
    public static final String LIST_RATING = xpath("//div[@class='rating']//div");

    public static final String ADD_TO_CART_BTN = xpath("//input[@value='Add to cart']");
    public static final String SHOPPING_CART = xpath("//span[contains(text(),'Shopping cart')]");
    public static String MESSAGE = "//p[contains(text(),'The product has been added to your')]";
    public static String CART_QUANTITY = "//span[@class='cart-qty']";




}
