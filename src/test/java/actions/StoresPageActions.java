package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.StoresPageElements;
import setup.DriverSetup;
import utils.Screenshot;

public class StoresPageActions {
    private final WebDriver driver;
    private final WebDriverWait wait;
    CommonActions commonActions;
    StoresPageElements storesPageElements;

    public StoresPageActions(DriverSetup driverSetup, CommonActions commonActions) {
        this.driver = driverSetup.getDriverInstance();
        storesPageElements = new StoresPageElements(driver);
        this.commonActions = commonActions;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void scrollToLocationInMap() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(storesPageElements.dismissWarning));
        storesPageElements.dismissWarning.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                storesPageElements.mapElement);
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(storesPageElements.mapElement));
        actions.click(storesPageElements.mapElement).
                sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        wait.until(ExpectedConditions.elementToBeClickable(storesPageElements.mapZoomInButton));
        storesPageElements.mapZoomInButton.click();
        Thread.sleep(2000);             //Adding sleep for the zoom in action to complete
    }


    public void clickOnOurStores(String linkName) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                storesPageElements.ourStoresLink);
        wait.until(ExpectedConditions.elementToBeClickable(storesPageElements.ourStoresLink));
        storesPageElements.ourStoresLink.click();
    }

    public void takeScreenshot(String filename) {
        Screenshot.takeScreenshot(driver, filename);
    }
}
