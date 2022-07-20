Feature: Checking distance

  Scenario: I want to check the distance between two locations

    Given Electronic navigator
    When I enter the starting point
    And I enter the endpoint
    And I choose a vehicle
    Then The distance to the final point should be 2425 km