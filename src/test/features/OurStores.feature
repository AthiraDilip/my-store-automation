Feature: Our Stores page scenarios

  @UserStory5
  Scenario: See a store from West Palm Beach
    Given I am on 'Home' page
    And Click on 'Our Stores'
    Then I should be able to scroll the map to see store near West Palm Beach
    And User should be able to take screenshot