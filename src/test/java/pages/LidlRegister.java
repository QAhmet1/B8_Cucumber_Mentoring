package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LidlRegister extends BaseDriver {
    public LidlRegister() {
        PageFactory.initElements(driver,this);
    }

	@FindBy(id="input0")
	private WebElement name;
    @FindBy(id="input1")
	private WebElement lastName;
    @FindBy(id="input2")
	private WebElement email;
    @FindBy(id="input3")
	private WebElement confirmEmail;
    @FindBy(id="input4")
	private WebElement password;
    @FindBy(id="input5")
	private WebElement phone;
    @FindBy(id="input6")
	private WebElement zip;
    @FindBy(name="birthday")
	private WebElement dob;

	@FindBy(xpath="//div[@class='spinnie-container']")
	private WebElement joinBtn;

	@FindBy(id="input4-helper-text")
	private WebElement errorMsg;



    public WebElement getName() {
        return name;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getConfirmEmail() {
        return confirmEmail;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getZip() {
        return zip;
    }

    public WebElement getDob() {
        return dob;
    }

    public WebElement getErrorMsg() {
        return errorMsg;
    }

    public WebElement getJoinBtn() {
        return joinBtn;


    }
}
