package com.math.calculatorservice.stepdefs;

import com.math.calculatorservice.CalcClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorStepDefinitions {

    private int c = 0;

    @Autowired
    private CalcClient calcClient;

    @When("^two numbers(\\d+)  (\\d+) is provided to add method$")
    public void two_numbers(final int a, final int b) {
        c = calcClient.getAddition(a, b);
    }

    @Then("^it should return (\\d+)$")
    public void testAdditionValue() {
        Assert.assertEquals(70, c);
    }

}

//classes = CalculatorServiceApplication.class,
//		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)