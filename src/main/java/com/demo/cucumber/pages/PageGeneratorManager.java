package com.demo.cucumber.pages;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    private PageGeneratorManager() {
    }
    public static CommonPage getCommonPage(WebDriver driver) {
        return new CommonPage(driver);
    }
    public static HomePage getHomePage(WebDriver driver) {
        return new HomePage(driver);
    }
}
