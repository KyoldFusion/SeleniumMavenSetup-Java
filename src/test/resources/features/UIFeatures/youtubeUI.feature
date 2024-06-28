Feature: We want to make sure we can access youtube through automation
  Scenario Outline: We want the user to be able to search a video game on youtube through different browsers
    Given We have installed the proper Webdrivers '<driver>'
    When I activate the given web driver
    Then I will be brought to youtube's page with the proper browser

    Examples:

    | driver |
    | chrome |
    | edge |
    | firefox |