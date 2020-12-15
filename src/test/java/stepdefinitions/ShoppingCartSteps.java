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
    public void an_item_with_description_name_is_available_in_Shopping_cart_summary(String expectedItemName) {
        Assert.assertTrue("Item not found in Cart",
                shoppingCartPageActions.isEntryPresentInCart(expectedItemName));
    }

    @And("There is {string} in cart")
    public void there_is_product_in_cart(String expectedProductQuantity) {
        Assert.assertEquals("Product count is not " + expectedProductQuantity, expectedProductQuantity,
                shoppingCartPageActions.getProductQuantity());
    }

    @Then("Delete button should be displayed for the item {string}")
    public void button_should_be_displayed_for_the_item(String itemName) {
        Assert.assertTrue("Delete button is not Displayed",
                shoppingCartPageActions.isDeleteButtonPresent(itemName));
    }

    @When("Click on Delete button of the item {string}")
    public void click_on_button_of_the_item(String itemName) {
        shoppingCartPageActions.clickOnDelete(itemName);
    }

    @Then("The shopping cart is empty")
    public void the_shopping_cart_is_empty() {
        Assert.assertEquals("Shopping cart is not empty", "(empty)",
                shoppingCartPageActions.getVisibleProductQuantityText());
    }


    @Then("Banner displays the message {string}")
    public void banner_displays_the_message(String expectedBannerMessage) {
        Assert.assertEquals("Banner message not displayed correctly",
                expectedBannerMessage, shoppingCartPageActions.getBannerMessage());
    }

}
