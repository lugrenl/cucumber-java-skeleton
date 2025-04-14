Feature: Belly

  Background:
    Given My belly is empty

  @Hungry
  Scenario Outline: eat few cukes
    Given I eat <cukes> cukes
    When I wait <hours> hours
    Then my belly should growl
    Examples:
      | cukes | hours |
      | 12    | 1     |
      | 24    | 2     |
      | 48    | 3     |

  @Full
  Scenario: i am full
    Given I eat 12 cukes
    When I wait 0 hours
    Then my belly should not growl