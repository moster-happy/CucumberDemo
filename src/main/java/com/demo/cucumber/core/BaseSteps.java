package com.demo.cucumber.core;
import org.openqa.selenium.WebDriver;

public class BaseSteps extends BasePage {
    private WebDriver driver;

    protected BaseSteps() {
        super();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
