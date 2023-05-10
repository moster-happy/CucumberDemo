package com.demo.cucumber.stepDefinition;

import com.demo.cucumber.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDef extends BaseDef {
    public LoginStepsDef(){
        super();
    }
    public HomePage homePage;

    @When("Login account username: {string} and password: {string}")
    public void loginAccount(String userName, String password) {
        homePage = new HomePage(action);
        homePage.loginAccount(userName, password);
    }

    @Then("Login account successful")
    public void loginSuccessful() {
        System.out.println("Login account successful");
    }

    @Then("HomePage is displayed")
    public void homePageIsDisplayed() {
        System.out.println("HomePage is displayed");
    }
}
