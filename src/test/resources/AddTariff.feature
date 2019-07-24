Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: to check Add Tariff functionality
    Given user in telecom page
    And need to click add tariff button
    When need to fill all the details
      | 500 | 90 | 15 | 100 | 1 | 5 | 1 |
    And need to click submit button
    Then user should see the successfully compeletion page
