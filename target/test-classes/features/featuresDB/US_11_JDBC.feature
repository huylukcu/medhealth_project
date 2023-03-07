@DB_Dr_Appt.
  Feature: db_Doctor_Appointments
    Scenario: user(doctor) should be able to see his/her appointment list
      Given user(doctor) connects to application's database
      And user gets the column "created_by" from table "appointment"
      Then verify that with the database


