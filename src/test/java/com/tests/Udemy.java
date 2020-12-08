package com.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.browser.Browser;
import com.udemy.UdemyLoginPage;
import com.udemy.UdemySearch;

public class Udemy {
    UdemyLoginPage uLogin;
    UdemySearch uSearch;
    Browser browser;
    public String url ="https://www.udemy.com/join/login-popup/?skip_suggest=1&locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2Flogout%2F&response_type=html";

    @Parameters({"browserName"})
    @Test
    public void test(String browserName) {
        browser = new Browser(browserName);
        browser.openUrl(url);
        uLogin = new UdemyLoginPage(browser);
        uLogin.udemyLogin();
        uSearch = new UdemySearch(browser);
        uSearch.searchCouse();
		System.out.println("login Successful");
        browser.tearDown();
    } 
}
