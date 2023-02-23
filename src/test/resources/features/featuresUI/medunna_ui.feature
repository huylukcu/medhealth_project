@Ui_Dr_Appt
Feature: Ui_Feature

  Background:Login
    Given User navigate to "https://www.medunna.com/"
    When Click Sign in icon
    And Choose Sign in from dropdown
    And Enter the username
    And Enter the password
    And Click the sign in button
    And Click on MY PAGE
    And Choose My Appointments from dropdown

    @TC_01
    Scenario:Doctor should be able to see his/her appointment list
    Then Verify that their Appointments list on My Appointments page
    Then Verify that their Appointments time slots on My Appointments page

    @TC_02
    Scenario:User(doctor) can see patient id, start date, end date, status…
    Then Verify that patient id, start date, end date, status


