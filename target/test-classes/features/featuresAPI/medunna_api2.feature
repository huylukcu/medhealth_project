Feature:Api

 Background:
    Given User navigate to "https://www.medunna.com/"
    When doctor sends a request to "
    And Choose Sign in from dropdown
    And Enter the username
    And Enter the password
    And Click the sign in button
    And Click on MY PAGE
    And Choose My Appointments from dropdown
  Scenario:
    Then HTTP status codes should be "200"
