package com.demo.cucumber.helper;

public class TestContext {
    public ScenarioContext scenarioContext;
    public TestContext() {
        scenarioContext = new ScenarioContext();
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}
