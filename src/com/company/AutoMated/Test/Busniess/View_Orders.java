package com.company.AutoMated.Test.Busniess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.security.krb5.internal.crypto.Des;

import java.net.MalformedURLException;
import java.net.URL;

public class View_Orders {
    private DesiredCapabilities capabilities;
    private String URLa;
    public View_Orders(DesiredCapabilities caps, String URLa) throws MalformedURLException {
       this.capabilities=caps;
       this.URLa=URLa;
        if (inti(capabilities,URLa))
            System.out.println("Successful");
        else
            System.out.println("Failed  View Orders");
    }

    private Boolean inti(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("http://www.google.com");
        // Your test script like you usually write

        driver.quit();

        return false;

    }
}
