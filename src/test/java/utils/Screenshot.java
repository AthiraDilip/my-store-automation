package utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void takeScreenshot(WebDriver driver, String screenshotFilePath) {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("screenshots/" + screenshotFilePath + ".png");
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
