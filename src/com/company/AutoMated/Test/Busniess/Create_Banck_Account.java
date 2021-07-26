package com.company.AutoMated.Test.Busniess;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Create_Banck_Account {
  DesiredCapabilities capabilities;
  String URLa;
    public Create_Banck_Account(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        this.capabilities=caps;
        this.URLa=URLa;
        if (inti(capabilities,URLa))
            System.out.println("Successful");
        else
            System.out.println("Failed Create banck Account");
    }

    private Boolean inti(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("https://business.wedeliverspace.dev/bank-accounts");
        WebElement iban=driver.findElement(By.id("iban"));
        WebElement beneficiary_name=driver.findElement(By.id("beneficiary_name"));
        WebElement save= driver.findElement(By.className("ant-btn"));
        iban.sendKeys("SA4610000032452015000101");
        beneficiary_name.sendKeys("m7madTest");
        save.click();
        String actualUrl="https://business.wedeliverspace.dev/bank-accounts";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.quit();
        return false;

    }
}