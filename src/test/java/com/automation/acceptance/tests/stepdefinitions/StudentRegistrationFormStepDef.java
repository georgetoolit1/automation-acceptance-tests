package com.automation.acceptance.tests.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import com.automation.acceptance.tests.pages.StudentRegistrationFormPage;
import com.automation.acceptance.tests.utils.ConfigData;
import com.automation.acceptance.tests.utils.DataBuilder;
import com.automation.acceptance.tests.utils.SingletonDriver;

import static org.junit.Assert.assertTrue;

public class StudentRegistrationFormStepDef {
    WebDriver driver= SingletonDriver.driver;
    DataBuilder dataContext = new DataBuilder().build();
    StudentRegistrationFormPage studentRegistrationFormPage = new StudentRegistrationFormPage(driver);
    ConfigData configData = new ConfigData();

    @Given("^User is on the student form registration page$")
    public void user_is_on_the_student_form_registration_page() throws Throwable {
        studentRegistrationFormPage.goToHomePage(configData.getConfig().getString(ConfigData.ConfigKeys.URL));
    }

    @Given("^User fills in the form with valid data$")
    public void user_fills_in_the_form_with_valid_data() throws Throwable {
//        studentRegistrationFormPage.enterFirstName(dataContext.getFirstN());
//        studentRegistrationFormPage.enterSurname(dataContext.getLastN());
//        studentRegistrationFormPage.enterUserEmail(dataContext.getEmail());
//        studentRegistrationFormPage.enterUserMobile(dataContext.getEnterMobilePhone());
//        studentRegistrationFormPage.selectFemaleGender();
    }

    @When("^User selects the submit button$")
    public void user_selects_the_submit_button() throws Throwable {
        studentRegistrationFormPage.selectSubmitBtn();
    }

    @Then("^Success Pop up form should be displayed\\.$")
    public void success_Pop_up_form_should_be_displayed() throws Throwable {
        assertTrue(studentRegistrationFormPage.verifyPopScreen());
    }
}
