Feature: Search Results page scenarios

  @UserStory2
  Scenario: Search Summer Dress from Navigation menu
    Given I am on 'Home' page
    When Hover over 'WOMEN' option from navigation menu
    Then Sub navigation options are displayed
    When I Hover over 'Women' and click 'Summer Dresses'
    Then Summer items are displayed

  @UserStory3
  Scenario: Change slider from Navigation menu
    Given I am on 'Home' page
    When I Hover over 'Women' and click 'Summer Dresses'
    When I change the 'Upper Limit' of slider to 20
    Then Search results are updated from '$16.00 - $20.00'

