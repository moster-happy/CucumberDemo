package com.demo.cucumber.stepDefinition;

import com.demo.cucumber.core.BaseSteps;
import com.demo.cucumber.helper.TestContext;
import com.demo.cucumber.helper.enumeration.Context;
import com.demo.cucumber.pages.CommonPage;
import com.demo.cucumber.pages.HomePage;
import com.demo.cucumber.pages.PageGeneratorManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.demo.cucumber.Hook;

public class LoginStepsDef extends BaseSteps {
    private HomePage homePage;
    private CommonPage commonPage;
    private WebDriver driver;
    private TestContext testContext;
    public LoginStepsDef(TestContext testContext) {
        this.driver = Hook.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePage(driver);
        commonPage = PageGeneratorManager.getCommonPage(driver);
        this.testContext = testContext;
    }
    @When("Login account username: {string} and password: {string}")
    public void loginAccount(String userName, String password){
        homePage.loginAccount(userName, password);
        System.out.println("Name: " + testContext.scenarioContext.getContext(Context.NAME));
    }

    @Then("HomePage is displayed")
    public void homePageIsDisplayed(){
        homePage.homePageIsDisplayed();
    }
}
