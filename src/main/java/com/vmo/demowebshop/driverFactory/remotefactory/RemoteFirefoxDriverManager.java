package com.vmo.demowebshop.driverFactory.remotefactory;

import com.vmo.demowebshop.driverFactory.IBrowserFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class RemoteFirefoxDriverManager implements IBrowserFactory {
    @Override
    public WebDriver getBrowserDriver() throws MalformedURLException {
        FirefoxOptions options = new FirefoxOptions();


        return new RemoteWebDriver(new URL("http://localhost:4444"), options);
    }
}
