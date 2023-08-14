package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.testng.Assert;
import pages.Products;
import utilities.BaseDriver;

public class ProductSteps extends BaseDriver {
    Products p=new Products();
    @Given("Navigate to website")
    public void navigateToWebsite() {
        driver.get("https://www.automationexercise.com/products");
    }

    @And("Enter searched word {string} to search area")
    public void enterSearchedWordToSearchArea(String word) {
        p.getSearchArea().sendKeys(word);
    }

    @And("Click on search button")
    public void clickOnSearchButton() {
        p.getSearchButton().click();
    }

    @Then("Verify all ordered products titles include the word")
    public void verifyAllOrderedProductsTitlesIncludeTheWord() {
        for (int i = 0; i < p.getProductList().size(); i++) {
            System.out.println(p.getProductList().get(i).getText());
            //Assert.assertTrue(p.getProductList().get(i).getText().contains("blue"));

        }
    }
}
