package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePageElements;
import setup.DriverSetup;

import java.time.Duration;

public class HomePageActions {
    HomePageElements homePageElements;
    CommonActions commonActions;
    private final WebDriver driver;
    WebDriverWait wait;

    public HomePageActions(DriverSetup driverSetup, CommonActions commonActions) {
        this.driver = driverSetup.getDriverInstance();
        this.homePageElements = new HomePageElements(driver);
        this.commonActions = commonActions;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void hoverAndAddToCart(String itemName) {
        commonActions.hoverAndClick(getProductLink(itemName), getAddToCartButton(itemName));
    }

    public WebElement getProductLink(String itemName) {
        return getProductContainer(itemName).findElement(By.cssSelector("a.product_img_link"));
    }

    public WebElement getAddToCartButton(String itemName) {
        return getProductContainer(itemName).findElement(By.cssSelector("a[title='Add to cart']"));
    }

    private WebElement getProductContainer(String itemName) {
        for (WebElement productContainer : homePageElements.productContainers) {
            if (productContainer.findElement(By.cssSelector("a.product_img_link")).getAttribute("title").equalsIgnoreCase(itemName)) {
                return productContainer;
            }
        }
        return null;
    }

    public WebElement getMenuItem(String option) {
        for (WebElement element : homePageElements.listMenuItems) {
            if (element.getText().equalsIgnoreCase(option)) {
                return element;
            }
        }
        return null;
    }

    public WebElement getSubMenuItem(String option) {
        for (WebElement element : homePageElements.listSubMenuItems) {
            if (element.getAttribute("title").equalsIgnoreCase(option)) {
                return element;
            }
        }
        return null;
    }

    public void hoverOverMenuItem(String option) {
        Actions mouseActions = new Actions(driver);
        Action hover = mouseActions
                .moveToElement(getMenuItem(option))
                .pause(Duration.ofSeconds(3))
                .build();
        hover.perform();
    }

    public boolean checkVisibilityOfSubMenuItemInWomen() {
        wait.until(ExpectedConditions.visibilityOf(homePageElements.submenuItemWomen));
        return homePageElements.submenuItemWomen.getAttribute("style").endsWith("block;");
    }

    public void hoverAndClickMenuItem(String parentMenuItem, String childMenuItem) {
        commonActions.hoverAndClick(getMenuItem(parentMenuItem), getSubMenuItem(childMenuItem));
    }

}
