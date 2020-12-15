package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPageElements {
    @FindBy(css = "h1.page-heading.product-listing > span:first-child")
    public WebElement productListingPageHeading;
    @FindBy(css = "div#layered_price_slider > a:nth-of-type(2)")
    public WebElement sliderElementMax;
    @FindBy(css = "div#layered_price_slider > a:nth-of-type(1)")
    public WebElement sliderElementMin;
    @FindBy(css = "div#layered_price_slider")
    public WebElement sliderRange;
    @FindBy(css = "span#layered_price_range")
    public WebElement selectedSlideRange;
    WebDriver driver;

    public SearchResultsPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
