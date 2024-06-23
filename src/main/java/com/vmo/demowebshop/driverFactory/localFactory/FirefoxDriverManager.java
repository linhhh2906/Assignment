package com.vmo.demowebshop.driverFactory.localFactory;

import com.vmo.demowebshop.driverFactory.IBrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class FirefoxDriverManager implements IBrowserFactory {
    @Override
    public WebDriver getBrowserDriver() {
        FirefoxOptions options = new FirefoxOptions();


        return new FirefoxDriver(options);
    }
}

