package com.company.AutoMated.Test.Busniess;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Login {
    DesiredCapabilities capabilities ;
    String URLa;
    public Login(DesiredCapabilities caps, String URLa) throws MalformedURLException {
       this.capabilities=caps;
       this.URLa=URLa;
    if (inti(caps,URLa))
            System.out.println("Successful Login");
        else
            System.out.println("Failed Login");
    }

    private Boolean inti(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("https://business.wedeliverspace.dev/auth");
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login= driver.findElement(By.className("ant-btn"));
        username.sendKeys("yshurrab@hotmail.com");
        password.sendKeys("12345666");
        login.click();
        String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        driver.quit();

        return false;

    }
}
