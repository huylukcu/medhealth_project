@UI_10_staff_edits
Feature:patient edition

  Scenario Outline: staff should be able to edit patient
    Given user clicks the logIn dropdown
    When  user clicks on the signIn button
    And user provides the userName as "<userName>"
    Then user provides the passWord as "<passWord>"
    Then user clicks on the signInButton
    Then user clicks MY PAGE
    Then user clicks SearchPatient button
    Then user provides patient in ssn box "<SSN>"
    Then user clicks edit button
    Then user edit "<firstName>"
    Then user editss "<lastName>"
    Then user edit birthDateBox
    Then user edit "<email>"
    Then user  edit phoneNumberBox
    Then user edit genderDropDown
    Then user edit bloodGroupDropDown
    Then user edit addressBox
    Then user edit descriptionBox
    Then user edit userPatientDropDown
    Then user edit countryDropDown
    Then user edit stateDropDown
    Then user  edit saveButton

    Then user verifies password changed successfully
    Examples: user info
      |userName        |passWord |        SSN        |      email           |  firstName | lastName|
      |talehmecid      |T2023$tm |     300-20-3030   |temkinabir@gmail.com  |   Temkin   |   Abir  |