Feature: Shopping cart page scenarios

  Background:
    Given I am on 'Home' page
    When I Hover over 'Faded Short Sleeve T-shirts' and click 'Add to cart'
    And Click on 'Proceed to checkout' button
    Then An item with description name 'Faded Short Sleeve T-shirts' is available in Shopping cart summary

  @UserStory1
  Scenario: Delete an item present in the basket
    Given I am on 'ShoppingCart' page
    And There is '1 Product' in cart
    Then Delete button should be displayed for the item 'Faded Short Sleeve T-shirts'
    When Click on Delete button of the item 'Faded Short Sleeve T-shirts'
    Then The shopping cart is empty
    And Banner displays the message 'Your shopping cart is empty.'
