package com.demo.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/Login.feature"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
