@US_31_Api
Feature:Physicians Api Test
  Scenario: TC01 Validate all physicians using api
    Given User set the urlHU
    When Send a get request to get PhysiciansHU with token
    Then verify user get the Physicians name as expectedHU


