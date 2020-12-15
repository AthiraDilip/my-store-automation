package actions;

import enums.FieldName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AuthenticationPageElements;
import pages.CreateAccountPageElements;
import setup.DriverSetup;

import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.nonNull;

public class CreateAccountPageActions {
    AuthenticationPageElements authenticationPageElements;
    CreateAccountPageElements createAccountPageElements;
    CommonActions commonActions;
    private final WebDriver driver;
    private final WebDriverWait wait;

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
        switch (FieldName.getButtonName(fieldName)) {
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
                selectByVisibleText(createAccountPageElements.stateSelection, fieldValue);
                break;
            case ZIP_POSTAL_CODE:
                createAccountPageElements.zipPostcodeInput.sendKeys(fieldValue);
                break;
            case COUNTRY:
                selectByVisibleText(createAccountPageElements.countrySelection, fieldValue);
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
                createAccountPageElements.aliasAddress.sendKeys(fieldValue);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + FieldName.getButtonName(fieldName));
        }
    }

    private void selectDateOfBirth(String fieldValue) {
        String[] dateOfBirth = new String[3];
        if (nonNull(fieldValue)) {
            dateOfBirth = fieldValue.split("/");
        }
        if (dateOfBirth.length == 3) {
            selectByValue(createAccountPageElements.daySelection, dateOfBirth[0]);
            selectByValue(createAccountPageElements.monthSelection, dateOfBirth[1]);
            selectByValue(createAccountPageElements.yearSelection, dateOfBirth[2]);
        }
    }

    private void selectByValue(WebElement selectElement, String value) {
        Select select = new Select(selectElement);
        select.selectByValue(value);
    }

    private void selectByVisibleText(WebElement selectElement, String value) {
        Select select = new Select(selectElement);
        select.selectByVisibleText(value);
    }

    private void selectTitle(String fieldValue) {
        if (fieldValue.equalsIgnoreCase("Mr.")) {
            createAccountPageElements.genderMale.click();
        } else {
            createAccountPageElements.genderFemale.click();
        }
    }

    public List<String> getErrorMessagesList() {
        List<String> actualList = new LinkedList<>();
        createAccountPageElements.errorMessageList.
                forEach(errorMessage -> actualList.add(errorMessage.getText()));
        return actualList;
    }
}
