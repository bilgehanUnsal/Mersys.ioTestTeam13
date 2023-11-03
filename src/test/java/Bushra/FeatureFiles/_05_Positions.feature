Feature: HR_Positions Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario: Create HR Positions
    Given Navigate to HR Positions
    When Add to Positions
    Then Added Position Successfully
    When Edit Positions
    Then Edited Positions Successfully
    And Position Search and do Active or Deactive
    When Delete to Position
    Then Deleted to Positions Succesfully

