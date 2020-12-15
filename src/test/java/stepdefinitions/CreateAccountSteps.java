package stepdefinitions;

import actions.AuthenticationPageActions;
import actions.CommonActions;
import actions.CreateAccountPageActions;
import actions.MyAccountPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Date;
import java.util.List;

public class CreateAccountSteps {
    CommonActions commonActions;
    AuthenticationPageActions authenticationPageActions;
    MyAccountPageActions myAccountPageActions;
    CreateAccountPageActions createAccountPageActions;

    public CreateAccountSteps(CommonActions commonActions, AuthenticationPageActions authenticationPageActions,
                              CreateAccountPageActions createAccountPageActions,
                              MyAccountPageActions myAccountPageActions) {
        this.commonActions = commonActions;
        this.authenticationPageActions = authenticationPageActions;
        this.createAccountPageActions = createAccountPageActions;
        this.myAccountPageActions = myAccountPageActions;
    }

    @And("Click on {string} link")
    public void clickOnSignInLink(String linkName) {
        commonActions.clickOnLink(linkName);
    }

    @When("Enter {string} in Email address field")
    public void enterEmailInEmailAddressField(String email) {
        if (email.equalsIgnoreCase("valid")) {
            email = email + new Date().getTime() + "@mail.com";
        }
        authenticationPageActions.setEmail(email);
    }

    @Then("Error message {string} should be displayed")
    public void errorMessageInvalidEmailAddressShouldBeDisplayed(String expectedMessage) {
        Assert.assertEquals("Error message is not displayed", expectedMessage,
                authenticationPageActions.getErrorMessage());
    }

    @And("I fill {string} with value {string}")
    public void iFillLastNameWithValueLastName(String fieldName, String fieldValue) {
        createAccountPageActions.fillSignUpFormDetail(fieldName, fieldValue);
    }

    @Then("I should be navigated to {string} page")
    public void iWillBeNavigatedToMyAccountPage(String title) {
        Assert.assertTrue("Not navigted to My account page", commonActions.getCurrentPageTitle().startsWith(title));
    }

    @And("Account name displayed is a combination of {string} and {string}")
    public void accountNameDisplayedIsACombinationOfFirstNameAndLastName(String firstName, String lastName) {
        String expectedAccountName = firstName + " " + lastName;
        Assert.assertEquals("Account name does not match",
                expectedAccountName, myAccountPageActions.getAccountName());
    }

    @Then("Below error messages are displayed")
    public void belowErrorMessagesAreDisplayed(List<String> expectedErrorMessages) {
        List<String> actualErrorMessages = createAccountPageActions.getErrorMessagesList();
        Assert.assertEquals("Count of error messages is not same", expectedErrorMessages.size(),
                actualErrorMessages.size());
        Assert.assertEquals("Error messages are not same", expectedErrorMessages, actualErrorMessages);

    }
}