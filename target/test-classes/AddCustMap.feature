
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: To check add customer functionality
    Given User in telecom Homepage
    And user click on Add Customer button
    When user need to fill all personal details
    |Fname|saranya|
    |Lname|T|
    |Email|sarayatmc@gmail.com|
    |Address|Dindigul|
    |Mobile|7339595826|
    And user need to click on submit button
    Then user should see the customer ID is generated
  