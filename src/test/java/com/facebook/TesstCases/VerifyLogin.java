package com.facebook.TesstCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VerifyLogin {
    
    WebDriver driver;

    @Test
    public void VerifyLoginTest() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        
        ChromeOptions option = new ChromeOptions();
        option.merge(cap);
        
        String url = "http://192.168.29.122:1111/wd/hub";
        driver = new RemoteWebDriver(new URL(url), option);
        
        driver.get("https://www.google.com/");
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.quit();
    }
}
