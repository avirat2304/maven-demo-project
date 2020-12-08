package com.udemy;

import com.browser.Browser;

public class UdemyLoginPage {
    Browser browser;
    UdemyLocators ul;
    
    public UdemyLoginPage(Browser b) {
        this.browser=b;
        ul = new UdemyLocators();
    }
    
    public void udemyLogin() {
        browser.waitTillVisible(ul.email);
        browser.click(ul.email);
        browser.sendkey(ul.email, "avirat04@gmail.com");
        browser.click(ul.pass);
        browser.sendkey(ul.pass, "@virat@123");
        browser.click(ul.loginBtn);
    }
}
