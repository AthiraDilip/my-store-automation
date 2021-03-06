package actions;

import enums.FieldName;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AuthenticationPageElements;
import pages.CreateAccountPageElements;
import setup.DriverSetup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class CreateAccountPageActions {
    AuthenticationPageElements authenticationPageElements;
    CreateAccountPageElements createAccountPageElements;
    CommonActions commonActions;
    private WebDriver driver;
    private WebDriverWait wait;

    public CreateAccountPageActions(DriverSetup driverSetup, CommonActions commonActions) {
        this.driver = driverSetup.getDriverInstance();
        this.commonActions = commonActions;
        this.authenticationPageElements = new AuthenticationPageElements(driver);
        this.createAccountPageElements = new CreateAccountPageElements(driver);
        this.wait = new WebDriverWait(driver, 30);
    }

    public void fillSignUpFormDetail(String fieldName, String fieldValue) {
        wait.until(ExpectedConditions.visibilityOf(createAccountPageElements.firstnameInput));
        wait.until(ExpectedConditions.elementToBeClickable(createAccountPageElements.firstnameInput));
        wait.until(ExpectedConditions.elementToBeClickable(createAccountPageElements.registerButton));
        switch (Objects.requireNonNull(FieldName.getFieldName(fieldName))) {
            case TITLE:
                selectTitle(fieldValue);
                break;
            case FIRST_NAME:
                createAccountPageElements.firstnameInput.sendKeys(fieldValue);
                break;
            case LAST_NAME:
                createAccountPageElements.lastnameInput.sendKeys(fieldValue);
                break;
            case PASSWORD:
                createAccountPageElements.passwordInput.sendKeys(fieldValue);
                break;
            case DATE_OF_BIRTH:
                selectDateOfBirth(fieldValue);
                break;
            case COMPANY:
                createAccountPageElements.companyInput.sendKeys(fieldValue);
                break;
            case ADDRESS:
                createAccountPageElements.addressInput.sendKeys(fieldValue);
                break;
            case CITY:
                createAccountPageElements.cityInput.sendKeys(fieldValue);
                break;
            case STATE:
                selectUsingVisibleText(createAccountPageElements.stateSelection, fieldValue);
                break;
            case ZIP_POSTAL_CODE:
                createAccountPageElements.zipPostcodeInput.sendKeys(fieldValue);
                break;
            case COUNTRY:
                selectUsingVisibleText(createAccountPageElements.countrySelection, fieldValue);
                break;
            case ADDITIONAL_INFORMATION:
                createAccountPageElements.additionalInformation.click();
                createAccountPageElements.additionalInformation.sendKeys(fieldValue);
                break;
            case HOME_PHONE:
                createAccountPageElements.phoneInput.sendKeys(fieldValue);
                break;
            case MOBILE_PHONE:
                createAccountPageElements.mobileInput.sendKeys(fieldValue);
                break;
            case ADDRESS_ALIAS:
                createAccountPageElements.aliasAddress.clear();
                createAccountPageElements.aliasAddress.sendKeys(fieldValue);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + FieldName.getFieldName(fieldName));
        }
    }

    private void selectDateOfBirth(String fieldValue) {
        String[] dateOfBirth = new String[3];
        if (nonNull(fieldValue)) {
            dateOfBirth = fieldValue.split("/");
        }
        if (nonNull(dateOfBirth[0]) && nonNull(dateOfBirth[1]) && nonNull(dateOfBirth[2])) {
            selectUsingValue(createAccountPageElements.daySelection, dateOfBirth[0]);
            selectUsingValue(createAccountPageElements.monthSelection, dateOfBirth[1]);
            selectUsingValue(createAccountPageElements.yearSelection, dateOfBirth[2]);
        } else {
            Assert.fail("Invalid Date format provided for DOB: " + fieldValue);
        }
    }

    private void selectUsingValue(WebElement selectElement, String value) {
        Select select = new Select(selectElement);
        select.selectByValue(value);
    }

    private void selectUsingVisibleText(WebElement selectElement, String value) {
        Select select = new Select(selectElement);
        select.selectByVisibleText(value);
    }

    private void selectTitle(String fieldValue) {
        if (fieldValue.equalsIgnoreCase("Mr.")) {
            wait.until(ExpectedConditions.elementToBeClickable(createAccountPageElements.genderMale));
            createAccountPageElements.genderMale.click();
        } else {
            wait.until(ExpectedConditions.elementToBeClickable(createAccountPageElements.genderFemale));
            createAccountPageElements.genderFemale.click();
        }
    }

    public List<String> getErrorMessagesList() {
        List<String> actualList = new ArrayList<>();
        createAccountPageElements.errorMessageList.
                forEach(errorMessage -> actualList.add(errorMessage.getText()));
        return actualList;
    }
}
