Feature: Search and place order for vegetables  
  
  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on GreenKart landing page    
    When User searched for "Cucumber" vegetable        
    Then "Cucumber" results are displayed

  @SeleniumTest
  Scenario: Search for items and then move to checkout page
    Given User is on GreenKart landing page    
    When User searched for "Brinjal" vegetable        
    And Added items to the cart
    And User proceeded to Checkout page for purchase
  	Then Verify selected "Brinjal" items are displayed in Check out page
  	
  	
  	
  	
  	