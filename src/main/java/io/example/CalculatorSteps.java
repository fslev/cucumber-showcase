package io.example;

import io.cucumber.java.en.When;

public class CalculatorSteps {

    @When("Wait {int}s")
    public void wait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
    }
}
