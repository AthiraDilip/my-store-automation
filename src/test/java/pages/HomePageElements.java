package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElements {
    @FindBy(linkText = "Our stores")
    public WebElement ourStoresLink;
    @FindBy(css = "div.product-container")
    public List<WebElement> productContainers;
    @FindBy(css = "a[title = 'Proceed to checkout']")
    public WebElement proceedToCheckoutButton;
    @FindBy(css = "ul.menu-content > li > a")
    public List<WebElement> listMenuItems;
    @FindBy(css = "li> a[title='Women'] + ul.submenu-container")
    public WebElement submenuItemWomen;
    @FindBy(css = "ul.submenu-container > li:nth-child(2) > ul > li > a")
    public List<WebElement> listSubMenuItems;
    WebDriver driver;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
