package io.example;

import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorSteps {

    @When("Check {int} + {int} = {int}")
    public void checkSum(int x, int y, int sum) {
        assertEquals(x + y, sum);
    }

    @When("Check {int} + {int} != {int}")
    public void checkSumNegative(int x, int y, int sum) {
        assertNotEquals(x + y, sum);
    }

    @When("Wait {int}s")
    public void wait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
    }
}
