Feature: Login account
  As an user, I can login account

  Scenario Outline: Login account
    Given Open website
    When Login account username: "<userName>" and password: "<password>"
    Then Login account successful
    And HomePage is displayed

    Examples:
      | userName        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |