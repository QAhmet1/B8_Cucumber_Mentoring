Feature: Search Item in Google

  Scenario: Search something in google.com

    Given I entered www.google.com
    When I searched for towel
    Then There should be more than 20000 results