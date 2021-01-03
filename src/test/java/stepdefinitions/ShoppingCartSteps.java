package stepdefinitions;

import actions.CommonActions;
import actions.ShoppingCartPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ShoppingCartSteps {
    CommonActions commonActions;
    ShoppingCartPageActions shoppingCartPageActions;

    public ShoppingCartSteps(CommonActions commonActions, ShoppingCartPageActions shoppingCartPageActions) {
        this.commonActions = commonActions;
        this.shoppingCartPageActions = shoppingCartPageActions;
    }

    @Then("An item with description name {string} is available in Shopping cart summary")
    public void anItemWithDescriptionNameIsAvailableInShoppingCartSummary(String expectedItemName) {
        Assert.assertTrue("Item not found in Cart",
                shoppingCartPageActions.isEntryPresentInCart(expectedItemName));
    }

    @And("There is {string} in cart")
    public void thereIsProductInCart(String expectedProductQuantity) {
        Assert.assertEquals("Product count is not " + expectedProductQuantity, expectedProductQuantity,
                shoppingCartPageActions.getProductQuantity());
    }

    @Then("Delete button should be displayed for the item {string}")
    public void buttonShouldBeDisplayedForTheItem(String itemName) {
        Assert.assertTrue("Delete button is not Displayed",
                shoppingCartPageActions.isDeleteButtonPresent(itemName));
    }

    @When("Click on Delete button of the item {string}")
    public void clickOnButtonOfTheItem(String itemName) {
        shoppingCartPageActions.clickOnDelete(itemName);
    }

    @Then("The shopping cart is empty")
    public void theShoppingCartIsEmpty() {
        Assert.assertEquals("Shopping cart is not empty", "(empty)",
                shoppingCartPageActions.getVisibleProductQuantityText());
    }


    @Then("Banner displays the message {string}")
    public void bannerDisplaysTheMessage(String expectedBannerMessage) {
        Assert.assertEquals("Banner message not displayed correctly",
                expectedBannerMessage, shoppingCartPageActions.getBannerMessage());
    }
}
