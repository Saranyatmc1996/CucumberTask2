Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: To check addcustomer functionality
    Given User in telecom home pages.
    And user need to click on Add Customer btn.
    When user need to fill all the details.
      | Saranya | Thangavel | saran@gamil.com | Dindigul | 7339595826 |
    And user need to click submit btn.
    Then user should see the customer id is generated or not.
