package com.demo.cucumber.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepdefs {
    @Given("Open website")
    public void openWebsite() {
        //
    }

    @When("Search a keyword {String}")
    public void searchKeyword(String keyword) {
        //
    }

    @Then("Should see {String} in the list item")
    public void shouldSeeInListItem(String keyWord) {
        //
    }
}
