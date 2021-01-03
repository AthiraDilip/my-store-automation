package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateAccountPageElements {
    private final WebDriver driver;
    @FindBy(css = "div.radio[id$='1'] > span")
    public WebElement genderMale;
    @FindBy(css = "div.radio[id$='2'] > span")
    public WebElement genderFemale;
    @FindBy(css = "input#customer_firstname")
    public WebElement firstnameInput;
    @FindBy(css = "input#customer_lastname")
    public WebElement lastnameInput;
    @FindBy(css = "input#passwd")
    public WebElement passwordInput;
    @FindBy(css = "input#company")
    public WebElement companyInput;
    @FindBy(css = "input#address1")
    public WebElement addressInput;
    @FindBy(css = "input#city")
    public WebElement cityInput;
    @FindBy(css = "input#postcode")
    public WebElement zipPostcodeInput;
    @FindBy(css = "div#uniform-days > select#days")
    public WebElement daySelection;
    @FindBy(css = "div#uniform-months > select#months")
    public WebElement monthSelection;
    @FindBy(css = "div#uniform-years > select#years")
    public WebElement yearSelection;
    @FindBy(css = "div#uniform-id_state > select#id_state")
    public WebElement stateSelection;
    @FindBy(css = "div#uniform-id_country > select#id_country")
    public WebElement countrySelection;
    @FindBy(css = "p.textarea > textarea")
    public WebElement additionalInformation;
    @FindBy(css = "input#phone")
    public WebElement phoneInput;
    @FindBy(css = "input#phone_mobile")
    public WebElement mobileInput;
    @FindBy(css = "input#alias")
    public WebElement aliasAddress;
    @FindBy(css = "button#submitAccount")
    public WebElement registerButton;
    @FindBy(css = "div.alert.alert-danger > ol > li")
    public List<WebElement> errorMessageList;

    public CreateAccountPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
