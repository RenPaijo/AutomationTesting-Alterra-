@Landing
  Feature: Landing page
    This test case is about everything in landing page

#  Scenario Outline: User want sort items
#    Given User open the website sauce demo
#    When User input "standard_user" as userName and input "secret_sauce" as password
#    Then User already on landing page
#    And User sort product list by "<list>"
#  Examples:
#    | list                |
#    | Name (A to Z)       |
#    | Name (Z to A)       |
#    | Price (low to high) |
#    | Price (high to low) |

#  Scenario Outline: User want sort and select 2 items
#    Given User open the website sauce demo
#    When User input "standard_user" as userName and input "secret_sauce" as password
#    Then User already on landing page
#    And User sort product list by "Price (low to high)"
#    And User select 2 items "<item1>" and "<item2>"
#    Examples:
#      | item1                             | item2             |
#      | Test.allTheThings() T-Shirt (Red) | Sauce Labs Onesie |

  Scenario: User want click cart icon
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "Name (Z to A)"
    And User select 2 items
    Then User click cart icon
    And User already on cart page