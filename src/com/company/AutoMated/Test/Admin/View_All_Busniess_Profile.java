package com.company.AutoMated.Test.Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class View_All_Busniess_Profile {
    private DesiredCapabilities capabilities;
    private String URla;
    public View_All_Busniess_Profile(DesiredCapabilities capabilities, String URla) throws MalformedURLException {
        this.capabilities=capabilities;
        this.URla=URla;
        if(init(capabilities,URla))
            System.out.println("");
        else
            System.out.println();
    }

    private boolean init(DesiredCapabilities caps,String URla) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URla), caps);
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
