@US_31_Api
Feature:Physicians Api Test
  Scenario: TC01 Get Request
    Given User set the urlHU
    When Send a get request to get PhysiciansHU
    Then verify HTTP Status Code is 200 HU
    Then verify user get the Physicians data as expectedHU
