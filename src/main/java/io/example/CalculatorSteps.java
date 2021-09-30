package io.example;

import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CalculatorSteps {

    @When("Check {int} + {int} = {int}")
    public void checkSum(int x, int y, int sum) {
        assertEquals(x + y, sum);
    }

    @When("Check {int} + {int} != {int}")
    public void checkSumNegative(int x, int y, int sum) {
        assertNotEquals(x + y, sum);
    }
}
