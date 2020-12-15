package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPageElements {
    @FindBy(css = "input#email_create")
    public WebElement createAccountEmailInput;
    @FindBy(css = "button#SubmitCreate")
    public WebElement createAccountButton;
    @FindBy(css = "div#create_account_error li")
    public WebElement errorMessage;
    @FindBy(css = "div.alert.alert-danger")
    public WebElement alertDangerElement;
    WebDriver driver;

    public AuthenticationPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
