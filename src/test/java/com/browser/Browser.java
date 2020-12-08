package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browser {

    public WebDriver driver;
    WebDriverWait wait;
    Select select;

    public Browser(String browserName) {
        init(browserName);
        wait = new WebDriverWait(driver, 10);
    }

    public void init(String browserName) {
        System.getProperty("user.dir");
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }
    
    public void openUrl(String url) {
        driver.get(url);
    }

    public void tearDown() {
        driver.quit();
    }
    
    public void click(Object locator) {
        driver.findElement((By) locator).click();
    }
    
    public void sendkey(Object locator, String text) {
        driver.findElement((By) locator).sendKeys(text);
    }
    
    public void sendkey(Object locator) {
        driver.findElement((By) locator).sendKeys(Keys.values());
    }
    
    public void waitTillVisible(Object locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
    }
    
    public WebElement wElement(Object locator) {
        return driver.findElement((By) locator);
    }
    
    public void selectByValue(Object locator, String option) {
       select = new Select(driver.findElement((By) locator));
       select.selectByValue(option);
    }
    
}
