package stepdefinitions;

import actions.CommonActions;
import actions.HomePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import setup.DriverSetup;

public class CommonSteps {
    CommonActions commonActions;
    HomePageActions homePageActions;
    WebDriver driver;

    public CommonSteps(DriverSetup driverSetup, CommonActions commonActions,
                       HomePageActions homePageActions) {
        this.driver = driverSetup.getDriverInstance();
        this.homePageActions = homePageActions;
        this.commonActions = commonActions;
    }

    @When("I Hover over {string} and click {string}")
    public void hoverAndClickButton(String itemName, String buttonName) {
        if (buttonName.equalsIgnoreCase("Add to cart")) {
            homePageActions.hoverAndAddToCart(itemName);
        } else {
            homePageActions.hoverAndClickMenuItem(itemName, buttonName);
        }
    }

    @Given("I am on {string} page")
    public void iAmOnPage(String pageName) {
        commonActions.validatePageUrl(pageName);
    }

    @When("Click on {string} button")
    public void clickOnButton(String buttonName) {
        commonActions.clickButton(buttonName);
    }
}
