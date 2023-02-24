@US_10
Feature: PatientInfo_Editing
  Scenario Outline: Staff should be able to change PatientInfo

    Given user(staff) navigate to "https://www.medunna.com/"
    When user(staff) click Sign in icon
    And user(staff) choose Sign in from dropdown
    And user(staff) enter the username "<lastname>"
    And user(staff) enter the password "<lastname>"
    And user(staff) click the sign in button
    And user(staff) click on MY PAGE
    And user(staff) click the Search Patient



