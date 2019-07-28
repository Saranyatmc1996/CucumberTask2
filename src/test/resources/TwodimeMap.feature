Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: To check add customer functionality
    Given User must in telecom Homepage
    And user to click on Add Customer Button
    When user need to fill all the personal details
      | Fname   | Lname | Email           | Address   | Mobile     |
      | saran   | T     | saran@gmail.com | dindigul  | 7339595826 |
      | Ajith   | K     | aji@gmail.com   | singapore | 9562286596 |
      | Gowtham | T     | gow@gmail.com   | kerala    | 4523689542 |
    And user to click on submit Button
    Then user to see the customer ID is generated or not.
