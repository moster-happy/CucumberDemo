package com.demo.cucumber.pages;

import com.demo.cucumber.WebKeywords.WebKeywords;
import com.demo.cucumber.core.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public WebDriver driver;
    public String INPUT_USERNAME = "//input[@name='user-name']";
    public String INPUT_PASSWORD = "//input[@name='password']";
    public String BTN_LOGIN = "//input[@name='login-button']";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public HomePage navigateToHomePage() {
        action.openBrowser("");
        return this;
    }

    public HomePage loginAccount(String userName, String password) {
        action.setText(INPUT_USERNAME, userName);
        action.setText(INPUT_PASSWORD, password);
        action.click(BTN_LOGIN);
        return this;
    }
}
