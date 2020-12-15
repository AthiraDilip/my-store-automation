package actions;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.StoresPageElements;
import setup.DriverSetup;

import java.io.File;
import java.io.IOException;

public class StoresPageActions {
    CommonActions commonActions;
    StoresPageElements storesPageElements;
    private final WebDriver driver;
    private final WebDriverWait wait;

    public StoresPageActions(DriverSetup driverSetup, CommonActions commonActions) {
        this.driver = driverSetup.getDriverInstance();
        storesPageElements = new StoresPageElements(driver);
        this.commonActions = commonActions;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void scrollToLocationInMap() {
        storesPageElements.dismissWarning.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                storesPageElements.mapElement);
        Actions actions = new Actions(driver);
        actions.click(storesPageElements.mapElement).
                sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        storesPageElements.mapZoomInButton.click();
    }


    public void clickOnOurStores(String linkName) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                storesPageElements.ourStoresLink);
        wait.until(ExpectedConditions.elementToBeClickable(storesPageElements.ourStoresLink));
        storesPageElements.ourStoresLink.click();
    }

    public void takeScreenshot() {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("screenshots/west_palm_beach_stores.png");
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
