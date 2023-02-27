@US11_Api
Feature: verify doctors appt with API

  Scenario: TC01_Get_Request
    Given user sends a request for appointment data
    Then user gets the appointment data

