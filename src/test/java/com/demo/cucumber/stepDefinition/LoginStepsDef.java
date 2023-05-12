package com.demo.cucumber.stepDefinition;

import com.demo.cucumber.core.BaseSteps;
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
    public LoginStepsDef() {
        this.driver = Hook.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePage(driver);
        commonPage = PageGeneratorManager.getCommonPage(driver);
    }
    @When("Login account username: {string} and password: {string}")
    public void loginAccount(String userName, String password){
        homePage.loginAccount(userName, password);
    }

    @Then("HomePage is displayed")
    public void homePageIsDisplayed(){
        homePage.homePageIsDisplayed();
    }
}
