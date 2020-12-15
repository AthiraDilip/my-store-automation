package actions;

import enums.ButtonName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AuthenticationPageElements;
import pages.CreateAccountPageElements;
import pages.HomePageElements;
import setup.DriverSetup;

import java.time.Duration;

import static utils.PropertyReader.getProp;

public class CommonActions {
    HomePageElements homePageElements;
    AuthenticationPageElements authenticationPageElements;
    WebDriver driver;
    WebDriverWait wait;
    CreateAccountPageElements createAccountPageElements;

    public CommonActions(DriverSetup driverSetup) {
        this.driver = driverSetup.getDriverInstance();
        this.homePageElements = new HomePageElements(driver);
        this.authenticationPageElements = new AuthenticationPageElements(driver);
        this.createAccountPageElements = new CreateAccountPageElements(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public void validatePageUrl(String pageName) {
        switch (pageName.trim().toUpperCase()) {
            case "HOME":
                driver.get(getProp("homepage.url"));
                break;
            case "SHOPPING CART":
                driver.get(getProp("Shoppingcartpage.url"));
                break;
            default:
                System.out.println("Invalid page");
        }
    }

    public void clickButton(ButtonName buttonName) {
        switch (buttonName) {
            case PROCEED_TO_CHECKOUT:
                wait.until(ExpectedConditions.visibilityOf(homePageElements.proceedToCheckoutButton));
                homePageElements.proceedToCheckoutButton.click();
                break;
            case CREATE_AN_ACCOUNT:
                wait.until(ExpectedConditions.elementToBeClickable(authenticationPageElements.createAccountButton));
                authenticationPageElements.createAccountButton.click();
                break;
            case REGISTER:
                wait.until(ExpectedConditions.elementToBeClickable(createAccountPageElements.registerButton));
                createAccountPageElements.registerButton.click();
                break;
            default:
                System.out.println("Invalid button name");
        }
    }

    public void hoverAndClick(WebElement hoverElement, WebElement clickElement) {
        Actions mouseActions = new Actions(driver);
        Action hoverAndClick = mouseActions
                .moveToElement(hoverElement)
                .pause(Duration.ofSeconds(2))
                .moveToElement(clickElement)
                .pause(Duration.ofSeconds(2))
                .click(clickElement)
                .build();
        hoverAndClick.perform();
    }

    public void dragAndDropSlider(WebElement element, int xOffset, int yOffset) {
        Actions mouseActions = new Actions(driver);
        mouseActions.clickAndHold().
                dragAndDropBy(element, xOffset, yOffset).release().build().perform();
    }

    public void clickOnLink(String linkName) {
        driver.findElement(By.partialLinkText(linkName)).click();
    }

}
