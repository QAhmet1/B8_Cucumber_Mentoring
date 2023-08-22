package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Calculator;
import utilities.BaseDriver;

import java.util.List;

public class CalculatorSteps extends BaseDriver {
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

    @Given("Navigate to demo shop website")
    public void navigateToDemoShopWebsite() {
        driver.get("https://demowebshop.tricentis.com/digital-downloads");

    }

    @Then("Verfy the left naw elements")
    public void verfyTheLeftNawElements() {
        List<WebElement>itemList=driver.findElements(By.xpath("//li[@class='inactive']"));
        for (WebElement element : itemList) {
            Assert.assertTrue(element.isDisplayed());
        }
    }
}
