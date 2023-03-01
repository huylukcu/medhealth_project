@DB_Dr_Appt.
  Feature: db_Doctor_Appointments
    Scenario: doctor should be able to see his/her appointment list
      Given user(doctor) connects to application's database
      When user gets "id, start_date, end_date, status" from the "appointment" table for "appointment"_id = "