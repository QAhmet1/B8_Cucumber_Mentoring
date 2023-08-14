package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class Products extends BaseDriver {
    public Products() {
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="search_product")
    private WebElement searchArea;

	@FindBy(xpath="//button[@id='submit_search']")
	private WebElement searchButton;

	@FindBy(xpath="//div[@class=\"productinfo text-center\"]/p")
	private List<WebElement> productList;

    public WebElement getSearchArea() {
        return searchArea;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getProductList() {
        return productList;
    }
}
