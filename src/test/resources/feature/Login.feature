Feature: Login account
  As an user, I can login account

  @test
  Scenario Outline: Login account
    Given Open website
    When Login account username: "<userName>" and password: "<password>"
    Then HomePage is displayed

    Examples:
      | userName        | password     |
      | standard_user   | secret_sauce |