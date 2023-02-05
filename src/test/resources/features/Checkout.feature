@Checkout
  Feature: Checkout Page
    This test is about everything in checkout page

  Scenario: User want to verify total price
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "Name (Z to A)"
    And User select 2 items
    Then User click cart icon
    And User already on cart page
    When User click remove button on T-Shirt Red in cart page
#    Then T-Shirt Red in cart should no longer be there
    And User want to continue to checkout information page
    Then User already in checkout information page
    When User input "Aldan Maulana" as firstname, "Fajri" as lastname, and "64482" as Zip code
    Then User already in checkout page
    When User verify total price