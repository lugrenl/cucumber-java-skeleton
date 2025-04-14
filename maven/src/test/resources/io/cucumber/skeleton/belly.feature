Feature: Belly

  Background:
    Given My belly is empty

  Scenario Outline: a few cukes
    Given I eat <cukes> cukes
    When I wait <hours> hour
    Then my belly should growl
    Examples:
      | cukes | hours |
      | 12    | 1     |
      | 24    | 2     |
      | 48    | 3     |
