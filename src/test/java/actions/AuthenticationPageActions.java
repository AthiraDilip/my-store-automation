package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AuthenticationPageElements;
import setup.DriverSetup;

public class AuthenticationPageActions {
    AuthenticationPageElements authenticationPageElements;
    private final WebDriver driver;
    private final WebDriverWait wait;

    public AuthenticationPageActions(DriverSetup driverSetup) {
        this.driver = driverSetup.getDriverInstance();
        this.authenticationPageElements = new AuthenticationPageElements(driver);
        this.wait = new WebDriverWait(driver, 30);
    }

    public void setEmail(String email) {
        wait.until(ExpectedConditions.titleIs("Login - My Store"));
        authenticationPageElements.createAccountEmailInput.sendKeys(email);
    }

    public String getErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(authenticationPageElements.alertDangerElement));
        return authenticationPageElements.errorMessage.getText().trim();
    }
}
