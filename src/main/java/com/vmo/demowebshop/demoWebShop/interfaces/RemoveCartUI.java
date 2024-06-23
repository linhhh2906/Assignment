package com.vmo.demowebshop.demoWebShop.interfaces;

import static com.vmo.demowebshop.common.Locator.xpath;

public class RemoveCartUI {
    public static String SHOPPING_CART = "//span[text()='Shopping cart']";
    public static String NUMBER_ITEM = "//span[@class='cart-qty']";
    public static String MESSAGE = "//p[contains(text(),'The product has been added to your')]";
    public static  String ADD_TO_CART_BTN = xpath("//input[@value='Add to cart']");
    public static String CHECKBOX_REMOVE = "a[contains(text(),'Computing and Internet')]/ancestor::td/preceding-sibling::td//input[@type='checkbox']";

    public static String BACK_HOME = "//img[@alt='Tricentis Demo Web Shop']";

    public static String ICON_LOADING = "//div[@class='loading-image']";
    public static String UPDATE_CART_BTN = "//input[@name='updatecart']";
    public static String PRODUCT_NOT_REMOVED = "(//td[@class='product']//a[@class='product-name'])[index]";
    public static String CART_QUANTITY = "//span[@class='cart-qty']";
    public static String ADD_TO_CART_PRODUCT_1 = "//span[@class='cart-qty']";
    public static String ADD_TO_CART_PRODUCT_2 = "//span[@class='cart-qty']";
    public static String ADD_TO_CART_PRODUCT_3 = "//span[@class='cart-qty']";

}
