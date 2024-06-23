package com.vmo.demowebshop.demoWebShop.interfaces;

import static com.vmo.demowebshop.common.Locator.xpath;

public class LoginElementUI {
    //public static final String DYNAMIC_LOCATOR = "//input[@id='%s']";
    public static final String LOGIN = xpath("//li[contains(.,'Log in')]");

    public static final String EMAIL_TEXTBOX = xpath("//input[@class='email']");
    public static final String PASSWORD_TEXTBOX = xpath("//input[@class='password']");
    public static final String LOGIN_BTN = xpath(" //input[@class='button-1 login-button']");
    public static String LOGOUT = "//a[@class ='ico-logout']";

}
