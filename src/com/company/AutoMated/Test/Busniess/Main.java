package com.company.AutoMated.Test.Busniess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M7mad\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://business.wedeliverspace.dev/auth");
        driver.findElement(By.id("username")).sendKeys("yshurrab@hotmail.com");
        driver.findElement(By.id("password")).sendKeys("12345666");
        driver.findElement(By.className("ant-btn")).click();
        Thread.sleep(1000);
        String url_profile=driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('/')+1,driver.getCurrentUrl().length());
            if(url_profile.equalsIgnoreCase("profile")){
            System.out.println("Login Succesfull");
            driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
            driver.findElement(By.className("ant-btn-link")).click();
            Thread.sleep(1000);
            String url_orders_page=driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('/')+1,driver.getCurrentUrl().length());
            if(url_orders_page.equalsIgnoreCase("orders")){
                System.out.println("orders page done");
                driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
               // driver.findElement(By.l("ag-528-input")).sendKeys("TW22325490");

            }else {
                System.out.println("fail view orders page");
            }

        }
            else {
            System.out.println("login fail");
            }
    }
}