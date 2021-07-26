package com.company.AutoMated.Test.Busniess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Main {
    public static final String USERNAME = "mohammedhayek_k6hxJf";
    public static final String AUTOMATE_KEY = "UKRMxDwRkL7PG6CSHrMn";
    public static final String URLA = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");
        caps.setCapability("name", "My First Test");
        caps.setCapability("build", "Build #1");
        caps.setCapability("project", "Sample sandbox project");

        init(caps,URLA);
}
        private static void init(DesiredCapabilities caps ,String URLa) throws MalformedURLException {
        new Login(caps,URLa);
        }

}