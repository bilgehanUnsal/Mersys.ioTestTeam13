Feature: Bank Accounts
  @Parameters @Finance @Banking @Smoke @Regression
    Scenario: Organize Bank Accounts

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully
    Then Click setup
    Then Click parameters
    And Click bank accounts
    Then Add new account
    Then Account update
    Then Account will be inactive
    Then User should successfully delete account