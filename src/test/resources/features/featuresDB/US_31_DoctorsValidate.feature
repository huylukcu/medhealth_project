@DB_Physicians_validate
  Feature: US_31 Database

    Scenario: Validate all Physicians using DB
    Given admin connects to the database hu
    And admin gets the columns from "physician" table
    Then admin verifies "<ID>", "<SSN>","<First Name>","<LastName>",


