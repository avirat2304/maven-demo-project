package com.facebook.Pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

    WebDriver driver;
    
    
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    
    public void loginData(String uid, String pass) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(uid);
        Thread.sleep(1000);
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.name("login")).click();
    }
}
