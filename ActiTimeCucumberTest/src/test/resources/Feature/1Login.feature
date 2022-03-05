Feature: Verifying the login page

  Scenario Outline: Verifying the login page valid credentials
    Given User is on login page
    When User enters the <username> and <password>
    And Click on the Login button
    Then Navigated to homepage

    Examples: 
      | username                | password |
      | maruthirajabn@gmail.com | Mav@1989 |
