Feature: Document Types
  Background:
    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario: Create Document Types
    Given Navigate to Document Types
    When Create a Document Types name as "Document1"
    And click on the Student Registration
    Then Document should be successfully

    When Document corrected name as "Document2" and click on the Examination
    Then Document should be successfully updated

    When Document delete the "Document2"
    Then Document should be successfully deleted