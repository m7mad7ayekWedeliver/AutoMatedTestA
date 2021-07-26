package com.company.AutoMated.Test.Busniess;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Create_Branch {
   DesiredCapabilities capabilities;
   String URLa;
    public Create_Branch(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        this.capabilities=caps;
        this.URLa=URLa;
        if (inti(capabilities,URLa))
            System.out.println("Successful");
        else
            System.out.println("Failed Create Branch");
    }

    private Boolean inti(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("https://business.wedeliverspace.dev/branches");
        WebElement name_ar=driver.findElement(By.id("name_ar"));
        WebElement name_en=driver.findElement(By.id("name_en"));
        WebElement mobile=driver.findElement(By.id("mobile"));
        WebElement city=driver.findElement(By.id("city"));
        WebElement area=driver.findElement(By.id("area"));
        WebElement address_line=driver.findElement(By.id("address_line"));
        WebElement location_point=driver.findElement(By.id("latitude_longitude"));
        WebElement description=driver.findElement(By.id("description"));
        WebElement save= driver.findElement(By.className("ant-btn"));
        name_ar.sendKeys("Test1");
        name_en.sendKeys("Test1");
        mobile.sendKeys("9665892551");
        city.sendKeys("Riyadh");
        area.sendKeys("al aml");
        address_line.sendKeys("Test");
        location_point.sendKeys("29.2788198,34.9346937");
        description.sendKeys("TestAAA");
        save.click();
        String actualUrl="https://business.wedeliverspace.dev/branches";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.quit();
        return false;
    }
}