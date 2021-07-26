package com.company.AutoMated.Test.Busniess;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Create_Order {
    DesiredCapabilities capabilities;
    String URla;
    public Create_Order(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        this.capabilities=caps;
        this.URla=URLa;
        if (inti(capabilities,URLa))
            System.out.println("Successful");
        else
            System.out.println("Failed Create Order");
    }

    private Boolean inti(DesiredCapabilities caps, String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("https://business.wedeliverspace.dev/new_order");
        WebElement cusomer_name=driver.findElement(By.id("mobile"));
        WebElement area=driver.findElement(By.id("area"));
        WebElement address_line=driver.findElement(By.id("address_line"));
        WebElement location_point=driver.findElement(By.id("latitude_longitude"));
        WebElement note=driver.findElement(By.id("note"));
        WebElement button_Cod=driver.findElement(By.id("is_cod_need"));
        WebElement order_price=driver.findElement(By.id("order_price"));
        WebElement branch=driver.findElement(By.id("branch"));
        WebElement save= driver.findElement(By.className("ant-btn"));
        cusomer_name.sendKeys("Test1");
        branch.sendKeys("test");
        button_Cod.isSelected();

        area.sendKeys("Test1");
        address_line.sendKeys("9665892551");
        note.sendKeys("Riyadh");
        area.sendKeys("al aml");
        address_line.sendKeys("Test");
        location_point.sendKeys("29.2788198,34.9346937");
        order_price.sendKeys("TestAAA");
        save.click();
        String actualUrl="https://business.wedeliverspace.dev/branches";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.quit();
        return false;
    }
}