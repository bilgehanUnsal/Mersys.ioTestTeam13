Feature: Subject Categories Functionality

  Background:
   Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

   Scenario: Education Setup
  When Navigate to Location setup
  When Add education location
  Then Added education successfully
  When Edit education location
  Then Edited educatoin successfully
  When Delete education locaation
  Then Deleted education successfully
  And  Education Location  


