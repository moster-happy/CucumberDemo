package com.demo.cucumber.pages;

import com.demo.cucumber.core.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePage {
    private WebDriver driver;
    public CommonPage(WebDriver driver){
        this.driver = driver;
    }
    public CommonPage navigateToHomePage(String url) {
        openBrowser(driver, url);
        return this;
    }
}
