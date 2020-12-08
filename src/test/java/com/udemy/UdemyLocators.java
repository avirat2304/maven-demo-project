package com.udemy;

import org.openqa.selenium.By;

public class UdemyLocators {
    
    Object email = By.id("email--1");
    Object pass = By.id("id_password");
    By loginBtn = By.name("submit");
    By courseSearch = By.cssSelector("input[name='q']");
    By mostRelevant = By.name("sort");
    By showMore = By.cssSelector("#div.panel--panel--3NYBX:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > button:nth-child(3) > span:nth-child(1) > span:nth-child(1)");
    By submitBtn = By.cssSelector("button[type='submit']");
    By softWareTesting = By.cssSelector("#filter-form > div > div:nth-child(1) label:nth-child(3)");
    By clearFilter = By.cssSelector("button[data-purpose='clear-filters']");
}