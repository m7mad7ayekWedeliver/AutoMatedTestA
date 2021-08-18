package com.company.AutoMated.Test.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Add_Edit_Branch {
    String location_point;
    String user_name_branch;
    String area;
    private DesiredCapabilities capabilities;
    private String URla;

   public Add_Edit_Branch (DesiredCapabilities desiredCapabilities ,String urla ) throws MalformedURLException {
        this.capabilities=desiredCapabilities;
        this.URla=urla;
       if(init(capabilities,URla))
           System.out.println("");
       else
           System.out.println();
    }

    private boolean init(DesiredCapabilities capabilities, String uRla) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(URla), capabilities);
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
