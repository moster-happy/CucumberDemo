Feature: Search product
  As an user, I can search product

  Scenario: Search for product by a keyword
    Given Open website
    When Search a keyword "iphone"
    Then Should see "iphone" in the list item
