Feature: Lidl Register

  As a user
  I want to try to register with an invalid password(size less than 8),
  I want to make sure that I cannot register.

  Scenario Outline: Negative Password test
    Given Navigate to register page
    And Fill the registration form with "<firstName>","<lastName>", "<email>","<confirmEmail>","<password>","<phone>","<zip>" and "<birthday>"
    When Click on the join button
    Then The user should see the password worning text message



    Examples:
      | firstName | lastName  |  email |  confirmEmail |  password   |   phone  | zip | birthday |
      | caroline | ozgur  |  tester@gmail.com |  tester@gmail.com |  Ast12   |   2365235258  | 89654 | 12/01/2000 |
