package com.company.AutoMated.Test.Admin.LoginCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Login {
    private DesiredCapabilities capabilities;
    private String URla;
    public Login(DesiredCapabilities caps, String urla) throws MalformedURLException, InterruptedException {
        this.capabilities=caps;
        this.URla=urla;
        if(inti(capabilities,URla))
        System.out.println("Successfull");
        else
            System.out.println("Failed");
    }

    private boolean inti(DesiredCapabilities caps,String URLa) throws MalformedURLException, InterruptedException {
        WebDriver driver = new RemoteWebDriver(new URL(URLa), caps);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://business.wedeliverspace.dev/captions");
        driver.findElement(By.className("ant-btn")).click();
        Thread.sleep(1000);
        String url_profile=driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('/')+1,driver.getCurrentUrl().length());
        if(url_profile.equalsIgnoreCase("profile")){
            System.out.println("Login Succesfull");
            driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
            driver.findElement(By.className("ant-btn")).click();
            driver.findElement(By.id("external_username")).sendKeys("mohammed test");
            Thread.sleep(10000);
            String url_orders_page=driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('/')+1,driver.getCurrentUrl().length());
            if(url_orders_page.equalsIgnoreCase("captions")){
                driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
                driver.findElement(By.className("ant-btn")).click();
                ;
                if(driver.findElement(By.id("external_username")).getText().toString().equalsIgnoreCase("mohammed test"))
                    System.out.println(" edit caption done");
                else
                    System.out.println("fail");
                Thread.sleep(10000);


            }else {
                System.out.println("fail view captain page");
            }

        }
        else {
            System.out.println("login fail");
        }
        return false;
    }

}
