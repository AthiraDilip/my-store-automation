package setup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static utils.PropertyReader.getProp;

public class DriverSetup {
    public static WebDriver driver;

    public void startDriver() {
        boolean isHeadless = Boolean.parseBoolean(getProp("headless"));
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(isHeadless);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);
    }

    public void quitDriver() {
        driver.quit();
    }

    public WebDriver getDriverInstance() {
        return driver;
    }
}
