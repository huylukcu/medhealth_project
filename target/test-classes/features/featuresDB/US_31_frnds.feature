@DB_Dr_Validate
Feature: US_31 Database

  Scenario: Validate all Physicians
    Given admin connects to the databasehu
    When admin gets "first_name" as a list from "physician"
    Then admin validates all physicianshu
    Then verify that "name" should be in listhu