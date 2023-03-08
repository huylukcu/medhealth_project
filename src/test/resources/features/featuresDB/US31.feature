@DB_Physicians
Feature: US_31 Database

  Scenario: Validate all Physicians
    Given admin connects to the database
    When get all "phone" as a list from "physician"
    Then verify list contains "222222222"
