Feature: Calculator
  To perform arithmetic operations
  as a user
  I want to use calculator

  Scenario Outline: Addition
    Given Create a calculator
    And Enter first number as <number1> in to the calculator
    And Enter second number as <number2> in to the calculator
    When Click on add button
    Then The result should be <sum> on the console


    Examples:
      | number1 |number2 |sum|
      | 7 |8 |15|
      | 0 |11 |11|
      | 25 |20 |45|