package com.company.AutoMated.Test.Busniess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Show_Slip_Order {
    private DesiredCapabilities capabilities;
    private String URLa;
    public Show_Slip_Order(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        this.capabilities=caps;
        this.URLa=URLa;
        if (inti(capabilities,URLa))
            System.out.println("Successful");
        else
            System.out.println("Failed  Show Slip");
    }

    private Boolean inti(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("http://www.google.com");
        // Your test script like you usually write

        driver.quit();

        return false;

    }}
