package stepdefinitions;

import actions.CommonActions;
import actions.HomePageActions;
import actions.SearchResultsPageActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchResultsSteps {
    CommonActions commonActions;
    HomePageActions homePageActions;
    SearchResultsPageActions searchResultsPageActions;

    public SearchResultsSteps(CommonActions commonActions, HomePageActions homePageActions,
                              SearchResultsPageActions searchResultsPageActions) {
        this.commonActions = commonActions;
        this.homePageActions = homePageActions;
        this.searchResultsPageActions = searchResultsPageActions;
    }

    @When("Hover over {string} option from navigation menu")
    public void hoverOverOptionFromNavigationMenu(String option) {
        homePageActions.hoverOverMenuItem(option);
    }

    @Then("Sub navigation options are displayed")
    public void subNavigationOptionsAreDisplayed() {
        Assert.assertTrue("Sub menu options are not displayed",
                homePageActions.checkVisibilityOfSubMenuItemInWomen());
    }

    @Then("Summer items are displayed")
    public void summerItemsAreDisplayed() {
        Assert.assertEquals("Summer items is not displayed", "SUMMER DRESSES",
                searchResultsPageActions.getProductListingPageHeading());
    }


    @When("I change the {string} of slider to {int}")
    public void iChangeTheUpperLimitOfSliderTo(String limitType, int value) {
        searchResultsPageActions.changeSliderOfUpperLimit(limitType, value);
    }

    @Then("Search results are updated from {string}")
    public void searchResultsAreUpdated(String expectedSliderRange) {
        Assert.assertEquals("Slider not set to expected Price Range",
                expectedSliderRange, searchResultsPageActions.getUpdatedSliderRange());
    }
}
