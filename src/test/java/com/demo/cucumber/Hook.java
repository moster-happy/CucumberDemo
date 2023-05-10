package com.demo.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class Hook {
    @Before
    public void setup() {
        System.out.println("Before Suite");
    }

    @After
    public void cleanup() {
        System.out.println("After Suite");
    }
}
