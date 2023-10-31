@Parameters @Education @Smoke @Regression
Feature: School Departments

  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully
    When  Click on the element in LeftNav
      | setup2         |
      | parameters2    |
      | nationalities |



  Scenario: Create Nationality
    And Click on the element in Dialog
      | addButton2 |
    And User sending the keys in Dialog
      | nameInput2 | teamOnUc |
    And Click on the element in Dialog
      | saveButton2 |
    Then Success message should be displayed

  Scenario: Search Nationality
    And User sending the keys in Dialog
      | searchInput | teamOnUc |
    And Click on the element in Dialog
      | searchButton |
    Then Name should display successfully
      | nameList | teamOnUc |

  Scenario: Edit Nationality

    And User sending the keys in Dialog
      | searchInput | teamOnUc |
    And Click on the element in Dialog
      | searchButton |
    And Click on the element in Dialog
      | editBtn |
    And User sending the keys in Dialog
      | nameInput2 | team13 |
    And Click on the element in Dialog
      | saveButton2 |
    Then Success message should be displayed

  Scenario: Delete Nationality

    And User delete the element from Dialog
      | team13 |
