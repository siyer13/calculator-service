Feature: Calculator Service

  Scenario: Get number 10 from calculator service
    When the get method is called
    Then the method should return number 10
