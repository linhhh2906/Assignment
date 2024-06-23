package com.vmo.demowebshop.demoWebShop.interfaces;

import static com.vmo.demowebshop.common.Locator.xpath;

public class BuyItemUI {
    public static final String DIGITAL_DOWNLOAD = xpath("//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]");
    public static final String ADD_TO_CART_BTN = xpath("//div[@class = 'buttons']//input[@value ='Add to cart']");
    public static String MESSAGE = "//p[contains(text(),'The product has been added to your')]";
    public static String SHOPPING_CART = "//span[text()='Shopping cart']";
    public static String TERM_OF_SERVICE_CHECKBOX = "//input[@id='termsofservice']";
    public static String CHECKOUT_BTN = "//button[@id='checkout']";
    public static String CHECK_OUT_AS_GUEST_BTN = "//input[@value='Checkout as Guest']";
    public static String FIRSTNAME_TEXTBOX = "//input[@id='BillingNewAddress_FirstName']";
    public static String LASTNAME_TEXTBOX = "//input[@id='BillingNewAddress_LastName']";
    public static String EMAIL_TEXTBOX = "//input[@id='BillingNewAddress_Email']";
    public static String COUNTRY_DROPDOWNLIST = "//select[@id='BillingNewAddress_CountryId']";
    public static String CITY_TEXTBOX = "//input[@id='BillingNewAddress_City']";
    public static String ADDRESS_TEXTBOX = "//input[@id='BillingNewAddress_Address1']";
    public static String ZIPCODE_TEXTBOX = "//input[@id='BillingNewAddress_ZipPostalCode']";
    public static String PHONE_TEXTBOX = "//input[@id='BillingNewAddress_PhoneNumber']";
    public static String CONTINUE_CHECKOUT = "//input[@class='button-1 new-address-next-step-button']";
    public static String CASH_ON_DELIVERY = "//input[@id='paymentmethod_0']";
    public static String CONTINUE_PAYMENT = "//div[@id ='checkout-step-payment-method']//input[@value='Continue']";
    public static String MESSAGE_PAY_BY_COD = "//div[@class='section payment-info']//p";
    public static String CONFIRM_NAME = "//li[@class ='name']";
    public static String CONFIRM_EMAIL = "//li[@class ='email']";
    public static String CONFIRM_PHONE = "//li[@class ='phone']";
    public static String CONFIRM_FAX = "//li[@class ='fax']";
    public static String CONFIRM_COMPANY = "//li[@class ='company']";
    public static String CONFIRM_ADDRESS1 = "//li[@class ='address1']";
    public static String CONFIRM_ADDESS2 = "//li[@class ='address2']";
    public static String CONFIRM_CITY_STATE_ZIP = "li[@class ='city-state-zip']";
    public static String CONFIRM_COUNTRY = "//li[@class ='country']";
    public static String CONFIRM_PAYMENT_METHOD = "//li[@class ='payment-method']";
    public static String CONFIRM_PRODUCT = "//td[@class ='product']/a";
    public static String CONFIRM_SUBTOTAL = "//span[contains(text(),'Sub-Total:')]//ancestor::tr//span[@class='product-price']\";";
    public static String CONFIRM_ADDITIONAL_FEE = "//span[contains(text(),'Payment method additional fee:')]//ancestor::tr//span[@class='product-price']";
    public static String CONFIRM_CART_TOTAL = "//span[contains(text(),'Total:')]//ancestor::tr//span[@class='product-price order-total']/strong";
    public static String CONFIRM_CONFIRM_ORDER = "//input[@class='button-1 confirm-order-next-step-button']";
    public static String MESSAGE_COMPLETED = "//div[@class='section order-completed']//strong";
    public static String CONTINUE_COMPLETED = "//input[@class='button-2 order-completed-continue-button']";

}
