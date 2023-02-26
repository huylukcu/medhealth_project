@UI_10_staff_edits

Feature:patient edition
  Scenario Outline: staff should be able to edit patient
    Given user go to "https://www.medunna.com"
    When user clicks the sign in icon
    Then user clicks on the signIn button
    Then user provides the userName as "<userName>"
    Then user provides the passWord as "<passWord>"
    Then user clicks on the signInButton
    Then user clicks MY PAGE dropdown
    Then user clicks Search Patient button
    Then user provides patient in ssn box "<SSN>"
    Then user edits "<email>"
    Then user edits "<firstName>"
    Then user edits "<lastName>"
    Examples: user info
      |userName        |passWord |        SSN        |      email           |  firstName | lastName|
      |talehmecid      |T2023$tm |     300-20-3030   |temkinabir@gmail.com  |   Temkin   |   Abir  |