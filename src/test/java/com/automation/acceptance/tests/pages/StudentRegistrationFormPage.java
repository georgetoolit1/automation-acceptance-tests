package com.automation.acceptance.tests.pages;

import com.automation.acceptance.tests.actions.CommonUIActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationFormPage extends CommonUIActions {

    @FindBy(id ="firstName")
    WebElement fistNameField;

    @FindBy(id ="lastName")
    WebElement surNameField;

    @FindBy(id ="userEmail")
    WebElement userEmailField;

    @FindBy(id = "userNumber")
    WebElement userMobileNumberField;

    @FindBy(id ="submit")
    WebElement submitBtn;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement femaleGender;

    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement pouptitleId;

    public StudentRegistrationFormPage(WebDriver driver) {
        super(driver);
    }

    public StudentRegistrationFormPage goToHomePage(String url){
        driver.get(url);
        return this;
    }

    public StudentRegistrationFormPage enterFirstName(String firstName){
        fistNameField.sendKeys(firstName);
        return this;
    }

    public StudentRegistrationFormPage enterSurname(String surName){
        surNameField.sendKeys(surName);
        return this;
    }

    public StudentRegistrationFormPage enterUserEmail(String email){
        userEmailField.sendKeys(email);
        return this;
    }

    public StudentRegistrationFormPage enterUserMobile(String number1){
        userMobileNumberField.sendKeys(number1);
        return this;
    }

    public StudentRegistrationFormPage selectSubmitBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();
        return this;
    }

    public StudentRegistrationFormPage selectFemaleGender(){
        femaleGender.click();
        return this;
    }

    public   StudentRegistrationFormPage verifyFemaleGender() {
        femaleGender.isSelected();
        return this;
    }

    public StudentRegistrationFormPage verifyPopScreen() {
        driver.switchTo().activeElement();
        waitForElementVisibility(pouptitleId);
        pouptitleId.isDisplayed();
        return this;
    }
}
