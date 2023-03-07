Feature: verify doctors appt with API

@Doctor_appt
  Scenario Outline: Getting Appointment information
  Given user given api "https://medunna.com"
  When user sends a Get request to "/api/appointments/<id>"
  Then user validates "<id>", "<StartDate>", "<EndDate>", "<Status>"

  Examples:appointments data for doctor
     | ID   | StartDate      |  EndDate       |  Status|
     | 2463 | 27/02/23 18:00 | 27/02/23 19:00 | COMPLETED|
