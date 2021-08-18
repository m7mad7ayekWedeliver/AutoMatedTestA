package com.company.AutoMated.Test.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class PrePaid {
    private DesiredCapabilities capabilities;
    private String URla;
    public PrePaid(DesiredCapabilities capabilities, String URla) throws MalformedURLException {
        this.capabilities=capabilities;
        this.URla=URla;
        if(init(capabilities,URla))
            System.out.println("");
        else
            System.out.println();
    }

    private boolean init(DesiredCapabilities caps,String URla) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URla), caps);
        driver.get("");
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id(""));
        WebElement form=driver.findElement(By.className("ant-form"));

        username.sendKeys("yshurrab@hotmail.com");
        password.sendKeys("12345666");

        form.submit();        // submit by form element
        System.out.println( driver.manage().logs());

        driver.quit();
        return true;
    }
    private boolean is_prepaid_fun(DesiredCapabilities caps,String URla) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URla), caps);
       // WebElement is_prepaid=driver.findElement();
        return false;
    }
}
