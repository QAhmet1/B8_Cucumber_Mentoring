package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LidlRegister;
import utilities.BaseDriver;

public class LidlRegisterSteps extends BaseDriver {
    LidlRegister ld=new LidlRegister();
    String pass;
    @Given("Navigate to register page")
    public void navigateToRegisterPage() {
        driver.get("https://www.lidl.com/register");
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
    }

    @And("Fill the registration form with {string},{string}, {string},{string},{string},{string},{string} and {string}")
    public void fillTheRegistrationFormWithAnd(String name, String lastname, String email, String emailConfirm, String password, String phone, String zip, String dob) {
        ld.getName().sendKeys(name);
        ld.getLastName().sendKeys(lastname);
        ld.getEmail().sendKeys(email);
        ld.getConfirmEmail().sendKeys(emailConfirm);
        ld.getPassword().sendKeys(password);
        ld.getPhone().sendKeys(phone);
        ld.getZip().sendKeys(zip);
        ld.getDob().sendKeys(dob);
        pass=password;
    }

    @When("Click on the join button")
    public void clickOnTheJoinButton() {
        ld.getJoinBtn().click();
    }


    @Then("The user should see the password warning text message")
    public void theUserShouldSeeThePasswordWarningTextMessage() {
        if (pass.length()<8){
            System.out.println(ld.getErrorMsg().getText());
            Assert.assertTrue(ld.getErrorMsg().isDisplayed());
        }
    }
}
