package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Calculator;

public class CalculatorSteps {
    private Calculator calculator;
    private int result;
    @Given("Create a calculator")
    public void createACalculator() {
        calculator=new Calculator();
    }

    @Given("Enter first number as {int} in to the calculator")
    public void enter_first_number_as_in_to_the_calculator(Integer int1) {
        calculator.setNumber1(int1);
    }
    @Given("Enter second number as {int} in to the calculator")
    public void enter_second_number_as_in_to_the_calculator(Integer int2) {
       calculator.setNumber2(int2);
    }

    @When("Click on add button")
    public void clickOnAddButton() {
       result= calculator.add();
    }

    @Then("The result should be {int} on the console")
    public void the_result_should_be_on_the_console(Integer expectedResult) {
        System.out.println(result+ " "+ expectedResult);

    }
}
