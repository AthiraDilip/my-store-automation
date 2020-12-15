package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoresPageElements {
    @FindBy(css = "div#map")
    public WebElement mapElement;
    @FindBy(css = "button.dismissButton")
    public WebElement dismissWarning;
    @FindBy(css = "button[title='Zoom in']")
    public WebElement mapZoomInButton;
    @FindBy(css = "li > a[title='Our stores']")
    public WebElement ourStoresLink;
    WebDriver driver;

    public StoresPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
