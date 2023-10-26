Feature: School Setup Parameters
  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario: School Setup
    When Navigate to location setup
    When Add school location
    Then Added school successfully
    When Edit school location
    Then Edited school successfully
    When Delete school location
    Then Deleted school successfully
    And School location do active and deactive