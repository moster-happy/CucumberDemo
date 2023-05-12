package com.demo.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feafure",

        plugin = {
                "pretty",
                "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"
        },
//        glue = "com.demo.cucumber.stepdefinition",
//        monochrome = false,
        tags = "@test"
//        strict = true
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
