package com.automation.acceptance.tests.pages;

import com.automation.acceptance.tests.actions.CommonUIActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationFormPage extends CommonUIActions {

    @FindBy(id ="firstName")
    WebElement firstNameField;

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
    WebElement popUpTitleId;

    public StudentRegistrationFormPage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage(String url){
        driver.get(url);
    }

    public void enterFirstName(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void enterSurname(String surName){
        typeInto(surNameField, surName);
    }

    public void enterUserEmail(String email){
        typeInto(userEmailField, email);
    }

    public void enterUserMobile(String userMobileNumber){
        typeInto(userMobileNumberField, userMobileNumber);
    }

    public void selectSubmitBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();
    }

    public void selectFemaleGender(){
        femaleGender.click();
    }

    public boolean verifyPopScreen() {
        driver.switchTo().activeElement();
        waitForElementVisibility(popUpTitleId);
        return popUpTitleId.isDisplayed();
    }
}
