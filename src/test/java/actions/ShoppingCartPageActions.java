package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ShoppingCartPageElements;
import setup.DriverSetup;

public class ShoppingCartPageActions {
    ShoppingCartPageElements shoppingCartPageElements;
    private final WebDriver driver;
    private final WebDriverWait wait;

    public ShoppingCartPageActions(DriverSetup driverSetup) {
        this.driver = driverSetup.getDriverInstance();
        shoppingCartPageElements = new ShoppingCartPageElements(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public WebElement getEntryFromCart(String itemName) {
        for (WebElement cartEntry : shoppingCartPageElements.cartEntries) {
            if (cartEntry.findElement(By.cssSelector("p.product-name > a")).getText().equalsIgnoreCase(itemName)) {
                return cartEntry;
            }
        }
        return null;
    }

    public boolean isEntryPresentInCart(String itemName) {
        return getEntryFromCart(itemName) != null;
    }

    public String getProductQuantity() {
        return shoppingCartPageElements.productQuantity.getText();
    }

    public boolean isDeleteButtonPresent(String itemName) {
        return getEntryFromCart(itemName).findElement(By.cssSelector("a[title='Delete']")).isDisplayed();
    }

    public void clickOnDelete(String itemName) {
        getEntryFromCart(itemName).findElement(By.cssSelector("a[title='Delete']")).click();
    }

    public String getVisibleProductQuantityText() {
        wait.until(ExpectedConditions.numberOfElementsToBe(
                By.cssSelector("div.shopping_cart > a > span:not([class$='unvisible'])"), 1));
        return shoppingCartPageElements.visibleProductQuantity.getText();
    }

    public String getBannerMessage() {
        return shoppingCartPageElements.bannerMessage.getText();
    }
}
