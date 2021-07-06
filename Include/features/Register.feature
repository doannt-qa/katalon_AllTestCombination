Feature: First test in the Register website

  Scenario Outline: Register the the website successfully
    Given Open url
    When I enter <name>, <email> and <password>
    And I check the check-box Check me out if you Love IceCreams
    And I select the item Female in the listbox
    And I choose the radio button Student
    And I click submit button
    Then I receive a successful notification "Success! The Form has been submitted successfully!."

    Examples: 
      | name         | email            | password     |
      | Test Name 01 | test01@email.com | tzH6RvlfSTg= |
      | Test Name 02 | test02@email.com | tzH6RvlfSTg= |
