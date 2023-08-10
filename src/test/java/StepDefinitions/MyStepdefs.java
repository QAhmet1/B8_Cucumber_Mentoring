package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.BaseDriver;


public class MyStepdefs {


    @Given("I entered www.google.com")
    public void i_entered_www_google_com() {
        // Write code here that turns the phrase above into concrete actions
        BaseDriver.getDriver().get("https://www.google.com");
    }
    @When("I searched for towel")
    public void i_searched_for_towel() {
        // Write code here that turns the phrase above into concrete actions
        BaseDriver.getDriver().findElement(By.id("APjFqb")).sendKeys("towel");
        BaseDriver.getDriver().findElement(By.className("gNO89b")).click();
    }
    @Then("There should be more than {int} results")
    public void there_should_be_more_than_results(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        String[] result = BaseDriver.getDriver().findElement(By.id("result-stats")).getText().split(" ");
        Assert.assertTrue(Long.parseLong(result[1].replaceAll(",", "")) > int1);
        BaseDriver.quitDriver();
    }

}
