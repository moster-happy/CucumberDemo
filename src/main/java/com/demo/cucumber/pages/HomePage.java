package com.demo.cucumber.pages;

import com.demo.cucumber.core.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;
    public String INPUT_USERNAME = "//input[@name='user-name']";
    public String INPUT_PASSWORD = "//input[@name='password']";
    public String BTN_LOGIN = "//input[@name='login-button']";
    public String LOGO = "//div[@class='app_logo']";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage loginAccount(String userName, String password){
        setText(driver, INPUT_USERNAME, userName);
        setText(driver, INPUT_PASSWORD, password);
        click(driver, BTN_LOGIN);
        return this;
    }

    public HomePage homePageIsDisplayed() {
        verifyElementIsDisplayed(driver, LOGO);
        return this;
    }
}
