package actions;

import org.openqa.selenium.WebDriver;
import pages.SearchResultsPageElements;
import setup.DriverSetup;

public class SearchResultsPageActions {
    private final WebDriver driver;
    SearchResultsPageElements searchResultsPageElements;
    CommonActions commonActions;

    public SearchResultsPageActions(DriverSetup driverSetup, CommonActions commonActions) {
        this.driver = driverSetup.getDriverInstance();
        this.commonActions = commonActions;
        searchResultsPageElements = new SearchResultsPageElements(driver);
    }


    public String getProductListingPageHeading() {
        return searchResultsPageElements.productListingPageHeading.getText().replace("\u00a0", "").trim();
    }

    private int getOffsetValue(String limitType, int value) {
        int dollarToPixel = searchResultsPageElements.sliderRange.getSize().width / 16;
        if (limitType.equalsIgnoreCase("Lower Limit")) {
            return (value - 16) * dollarToPixel;
        } else {
            return (32 - value) * dollarToPixel * -1;
        }
    }

    public void changeSliderOfUpperLimit(String limitType, int value) {
        commonActions.dragAndDropSlider(searchResultsPageElements.sliderElementMax,
                getOffsetValue(limitType, value) - 1, 0);
    }

    public String getUpdatedSliderRange() {
        return searchResultsPageElements.selectedSlideRange.getText().trim();
    }
}
