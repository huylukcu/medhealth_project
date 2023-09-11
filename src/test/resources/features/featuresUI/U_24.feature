@Staff

Feature: Staff invoice

  Scenario:Staff_login
    Given user goes the login page
    When staff types the username "username"
    When staff types the password "password"
    And user clicks sign in button
    And staff goes to search patient page
    And staff search a patient
    And staff clicks show appointments button
    Then staff clicks payment button
    And staff clicks show invoice button

#@patient_search_appointment
#Feature:Staff_Search
#
#
#  Scenario Outline: TC_01_Patient_Search_ByAppintment
#    Given user goes to medunna homePage
#    When admin clicks on user icon
#    And staff clicks Sign in option
#    And staff enters user's name "<patientusername>" in field
#    And staff enterspasswords's   "<patientpassword>" in field
#    And staff click Remember Me checkbox
#    And staff click on Sign In submit buttonAnd
#    And patient click on MY PAGES on menu
#    And patient click on My Appointments opotions
#    And patient click to show Tests button to see test results
#    And patient click on view Results button
#    Then verify that Test Results table name is seen
#    Then verify that sees id, name, default min and max value, test date and description are on table
#
#    Examples: SignIn
#      | patientusername | patientpassword |
#      | HastaBilge      | Luzumsuz71
