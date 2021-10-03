package com.company.AutoMated.Test.Admin.BusniessOrder;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class map_orders {
    WebDriver webDriver ;
    public map_orders (WebDriver webDriver){
        this.webDriver=webDriver;
        webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);

        webDriver.get("https://business.wedeliverspace.dev/dashboard/dispatcher-map");

    }


}
