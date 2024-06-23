package com.vmo.demowebshop.driverFactory.remotefactory;
import com.vmo.demowebshop.driverFactory.IBrowserFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class RemoteChromeDriverManager implements IBrowserFactory{
    @Override
    public WebDriver getBrowserDriver() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-geolocation");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--incognito");

        return new RemoteWebDriver(new URL("http://localhost:4444"), options);
    }
}

