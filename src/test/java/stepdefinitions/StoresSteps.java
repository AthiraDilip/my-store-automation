package stepdefinitions;

import actions.CommonActions;
import actions.StoresPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StoresSteps {

    CommonActions commonActions;
    StoresPageActions storesPageActions;

    public StoresSteps(CommonActions commonActions, StoresPageActions storesPageActions) {
        this.commonActions = commonActions;
        this.storesPageActions = storesPageActions;
    }

    @Then("I should be able to scroll the map to see store near {string}")
    public void iShouldBeAbleToScrollTheMapToSeeStore(String location) throws InterruptedException {
        storesPageActions.scrollToLocationInMap();
    }

    @And("Click on {string}")
    public void clickOnOurStores(String linkName) {
        storesPageActions.clickOnOurStores(linkName);
    }

    @And("User should be able to take screenshot")
    public void userShouldBeAbleToTakeScreenshot() {
        storesPageActions.takeScreenshot("west_palm_beach_stores");
    }
}
