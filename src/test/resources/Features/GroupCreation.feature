Feature:

  Scenario Outline: create and verify Admin Group
    Given : We have logged in successfully
    When : User navigates to Admin Panel
    And : User clicks on Group
    And : User Creates a group
    And : User logout
    And : User Navigates to sign-up Page
    Then : User Validates that the group created in step 4 exist in the group dropdown

    Examples:
