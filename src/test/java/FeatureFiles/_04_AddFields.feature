Feature: Add Fields

  Background: Login
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

    Scenario: Add Field
      And Click On The element
        | setup      |
        | parameters |
        | Fields     |
        | btnAdd     |
      And Enter Data in Text box
        | inputName | asdfg   |
        | inputCode | 4322884 |
      And Click On The element
        | btnSave |
      Then User should Field successfully created

      Scenario Outline: Edit Field
        And Click On The element
          | setup      |
          | parameters |
          | Fields     |
        When Enter the "<name>"
        And
        Examples:
          | name |


  Scenario Outline: Delete Field
        And Click On The element
          | setup      |
          | parameters |
          | Fields     |
        When Enter the "<name>"
        Then User should Field successfully deleted
        Examples:
          | name  |
          | asdfg |