@ApiGetTest
Feature:Api_staf_editing_pation

  Scenario:US_TC05_Get_Request
    Given user set the url "https://medunna.com/api/user?ssn=301-20-3030"
    And Call the Pojo to create expected data
    And sends a get-request to get all registrant data
    Then HTTP Status Code should be 200
    Then  Verify response content type is "application/json"
    Then Verify expected values and actual values should be same
    Then close the application