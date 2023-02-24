@UI_10_staff_edits


Feature:patient edition

  Scenario Outline: staff should be able to edit patient
    Given user clicks the logIn dropdown
    Then user clicks on the sign In
    Then user provides the userName as "<userName>"
    Then user provides the passWord as "<passWord>"
    Then user clicks on the signInButton
    Then user clicks MY PAGE dropdown
    Then user clicks Search Patient button
    Then user provides patient in ssn box "<SSN>"
    Then user edits "<ID>"
    Then user edits "<First Name>"
    Then user edits "<Last Name>"
    Examples: user info
      | ID   | First Name | Last Name |
      | 3190 | Tom        | Hanks1    |
    #123-11-3333 ssn