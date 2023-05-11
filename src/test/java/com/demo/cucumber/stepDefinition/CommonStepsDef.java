package com.demo.cucumber.stepDefinition;

import com.demo.cucumber.Hook;
import com.demo.cucumber.core.BaseSteps;
import com.demo.cucumber.pages.CommonPage;
import com.demo.cucumber.pages.HomePage;
import com.demo.cucumber.pages.PageGeneratorManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepsDef extends BaseSteps {
    private CommonPage commonPage;
    private HomePage homePage;
    private WebDriver driver;
    public CommonStepsDef() {
        this.driver = Hook.openAndQuitBrowser();
        commonPage = PageGeneratorManager.getCommonPage(driver);
        homePage = PageGeneratorManager.getHomePage(driver);
    }

    @Given("Open website")
    public void openWebsite() {
        commonPage.navigateToHomePage("https://www.saucedemo.com/");
    }
}
