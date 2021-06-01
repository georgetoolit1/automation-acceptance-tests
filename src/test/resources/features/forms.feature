Feature: Student Registration Form
  @smoke-test
  Scenario:
    Given User is on the student form registration page
    And User fills in the form with valid data
    When User selects the submit button
    Then Success Pop up form should be displayed.
