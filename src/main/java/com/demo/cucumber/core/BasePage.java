package com.demo.cucumber.core;

import com.demo.cucumber.WebKeywords.WebKeywords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriverWait explicit;
    public WebKeywords action;
    public static BasePage getBasePage() {
        return new BasePage();
    }

    protected void openBrowser(WebDriver driver, String url) {
        driver.get(url);
    }
}
