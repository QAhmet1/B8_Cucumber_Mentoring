Feature: Search product
  Scenario Outline: verify product title
    Given Navigate to website
    And Enter searched word "<word>" to search area
    And Click on search button
    Then Verify all ordered products titles include the word
    Examples:
      | word |
      | blue |