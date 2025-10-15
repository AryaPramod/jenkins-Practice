Feature: Sauce Login page

  Background:
    Given user on login page

  Scenario Outline: Successful Login functionality
  #Given the user is on the sauce demo login page
    When entering valid username "<username>" and password "<password>"
    Then dashboard page is displayed

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
      | visual_user   | secret_sauce |
  Scenario Outline: UnSuccessful Login functionality
    When invalid  credentials "<username>" and "<password>"
    Then still in login page

    Examples:
      | username | password |
      | empty    | user     |
      
 # @Completed
  Scenario Outline: When the product is added  the cart t
  
  When  from the login "<username>" and "<password>" navigate to add to cart is clicked on a product
  Then cart page is opened 
   Examples:
  | username      | password     |
  | standard_user | secret_sauce |

