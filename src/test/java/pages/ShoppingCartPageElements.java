package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPageElements {
    @FindBy(css = "span#summary_products_quantity")
    public WebElement productQuantity;
    @FindBy(css = "tbody > tr")
    public List<WebElement> cartEntries;
    @FindBy(css = "div.shopping_cart >a > span:not([class$='unvisible'])")
    public WebElement visibleProductQuantity;
    @FindBy(css = "p.alert.alert-warning")
    public WebElement bannerMessage;
    @FindBy(css = "span.navigation_page")
    public WebElement shoppingCartBreadCrumb;
    WebDriver driver;


    public ShoppingCartPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
