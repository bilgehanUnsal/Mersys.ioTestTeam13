Feature: Login functionality

  @LoginTest @SmokeTest @Regression
  Scenario: Login with username and password

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully