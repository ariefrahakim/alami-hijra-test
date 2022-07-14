@Web
Feature: Elevania

  @Elevania
  Scenario Outline: Hijra Test
    Given user skip pop up banner
    And user type on search bar "<product>"
    Then user choose best product
    And user choose the first product
    Then user can see the details of product
    And user add item "<item>"
    And user choose add to cart
    And user choose ya on confirmation page
    Then user can see the details of cart
    And user choose change kurir
    And user choose cancel
    And user choose delete product
    And user choose ok delete
    Then user can see empty product on the shopping cart

    Examples:
    |product         | item |
    |komputer        |  3   |
