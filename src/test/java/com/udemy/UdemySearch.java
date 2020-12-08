package com.udemy;

import com.browser.Browser;

public class UdemySearch {
    Browser browser;
    UdemyLocators ul;
    UdemyData uData;
    
    public UdemySearch(Browser b) {
        this.browser=b;
        ul = new UdemyLocators();
        uData = new UdemyData();
    }
    
    public void searchCouse() {
        browser.click(ul.courseSearch);
        browser.sendkey(ul.courseSearch, uData.searchText);
        browser.click(ul.submitBtn);
        browser.waitTillVisible(ul.mostRelevant);
        browser.selectByValue(ul.mostRelevant, uData.sortOption);
    }
}
