Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User in telecom HomePage
    And user need to click on Add customer Button

  Scenario: To check addcustomer functionalities
    
    When user need to fill the personal details
      | Saranya | T         | saran@gamil.com   | Dindigul  | 7339595826 |
      | priya   | Thangavel | saran56@gamil.com | Delhi     | 8669535874 |
      | Gowma   | T         | saran4@gamil.com  | Velachery | 5336985421 |
      | Sindhu  | S         | saran24@gamil.com | theni     | 5896248562 |
    And user need to click the submit button
    Then user should to see the customer id is generated

  Scenario: To check addcustomer functionality
    
    When user need to fill all the details
      | Saranya | Thangavel | saran@gamil.com | Dindigul | 7339595826 |
   And user need to click the submit button
    Then user should to see the customer id is generated
