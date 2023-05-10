package com.demo.cucumber.pages;

import com.demo.cucumber.WebKeywords.WebKeywords;

public class CommonPage {
    public WebKeywords action;
    public CommonPage(WebKeywords action){
        this.action = action;
    }
    public CommonPage navigateToHomePage(String url) {
        action.openBrowser(url);
        return this;
    }
}
