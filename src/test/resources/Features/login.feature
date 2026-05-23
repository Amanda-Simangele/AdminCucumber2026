Feature: Login
  Verify that a user can log in and see the welcome message

  Scenario Outline: Successful login
    Given user navigates to the application
    When user clicks login
    And user logs in with "<username>" and "<password>"
    Then user should see welcome message containing "working today"

    Examples:
      | username               | password     |
      | admin@gmail.com        | @12345678 |

