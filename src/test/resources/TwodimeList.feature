Feature: Add tariff page in Two Dimensional list
  I want to use this template for my feature file

  Background: 
    Given user should in telecom home page
    And need to click a add Tarifff button

  Scenario: To check add tariff page
    When need to fill all the tariff details
      | 400 | 300 | 500 | 300 | 2 | 5 | 6 |
      | 200 | 200 | 100 | 200 | 8 | 1 | 7 |
      | 400 | 500 | 150 |  20 | 8 | 9 | 6 |
      | 300 | 200 | 100 | 150 | 1 | 1 | 7 |
    And need to click the submit button
    Then user should see the successfully completed Page

  Scenario: To check add tariff page
    When need to fill all the tariff detailss
      | 400 | 300 | 500 | 300 | 2 | 5 | 6 |
    And need to click the submit button
    Then user should see the successfully completed Page
