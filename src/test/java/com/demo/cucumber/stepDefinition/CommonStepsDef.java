package com.demo.cucumber.stepDefinition;

import com.demo.cucumber.pages.CommonPage;
import io.cucumber.java.en.Given;

public class CommonStepsDef extends BaseDef {
    public CommonStepsDef(){
        super();
    }
     public CommonPage commonPage;
    @Given("Open website")
    public void openWebsite() {
        commonPage = new CommonPage(action);
        commonPage.navigateToHomePage("https://www.saucedemo.com/");
        System.out.println("Open website successful");
    }
}
