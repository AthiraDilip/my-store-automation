package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MyAccountPageElements;
import setup.DriverSetup;

public class MyAccountPageActions {
    MyAccountPageElements myAccountPageElements;
    CommonActions commonActions;
    private final WebDriver driver;
    private final WebDriverWait wait;

    public MyAccountPageActions(DriverSetup driverSetup, CommonActions commonActions) {
        this.driver = driverSetup.getDriverInstance();
        this.commonActions = commonActions;
        this.myAccountPageElements = new MyAccountPageElements(driver);
        this.wait = new WebDriverWait(driver, 30);
    }

    public String getAccountName() {
        return myAccountPageElements.accountName.getText();
    }
}
