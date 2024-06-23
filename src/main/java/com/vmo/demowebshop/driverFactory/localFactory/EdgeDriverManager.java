package com.vmo.demowebshop.driverFactory.localFactory;

import com.vmo.demowebshop.driverFactory.IBrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class EdgeDriverManager implements IBrowserFactory {
    @Override
    public WebDriver getBrowserDriver() {
        EdgeOptions options = new EdgeOptions();

        return new EdgeDriver(options);
    }
}


