package com.company.AutoMated.Test.Admin.Address;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Address {
    private DesiredCapabilities capabilities;
    private String URLa;
    public Address(DesiredCapabilities caps, String urla) {
        this.capabilities=caps;
        this.URLa=urla;
        if(inti(caps,urla))
        System.out.println();
        else
            System.out.println();
    }

    private boolean inti(DesiredCapabilities caps, String urla) {


        return true;
    }

}
