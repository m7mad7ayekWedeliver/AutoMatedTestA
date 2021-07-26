package com.company.AutoMated.Test.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Login {
    private DesiredCapabilities capabilities;
    private String URla;
    public Login(DesiredCapabilities caps, String urla) throws MalformedURLException {
        this.capabilities=caps;
        this.URla=urla;
        if(inti(capabilities,URla))
        System.out.println("Successfull");
        else
            System.out.println("Failed");
    }

    private boolean inti(DesiredCapabilities caps,String URLa) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.get("https://business.wedeliverspace.dev/auth");
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement form=driver.findElement(By.className("ant-form"));

        username.sendKeys("yshurrab@hotmail.com");
        password.sendKeys("12345666");

        form.submit();        // submit by form element
        System.out.println( driver.manage().logs());

        driver.quit();
        return true;

    }

}
