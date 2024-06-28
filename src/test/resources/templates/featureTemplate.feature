Feature: This is the feature to test
  Scenario Outline: There are Multiple Scenarios Listed
    Given We want to incorporate multiple versions of  '<item>'
    When I try to access '<item>' with '<OS>'
    Then I will recieve the following results

    Examples:

      | item | OS |
      | chrome | Windows
      | edge | MacOS
      | firefox | Linux


    Feature: This is a generic automation test
      Scenario: We want to have a basic with no parameters
        Given I know what I want to test
        When I Start My Task
        Then I Finish My Task

