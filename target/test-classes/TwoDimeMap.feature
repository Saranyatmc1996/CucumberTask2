Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: To check the tariff func
    Given user must in telecom page
    And user need to click add tariff button
    When user need to fill all the tariff details
      | monRen | fLocalMins | fInterins | fSmsPack | lCharg | InterCharg | smsCharg |
      |    500 |        300 |       200 |      300 |     12 |          5 |        6 |
      |    600 |        200 |       100 |      800 |     15 |          1 |        7 |
      |    200 |        100 |       600 |      400 |     13 |          2 |        4 |
    And user need to click submit btn
    Then user should see the successfully completed page
