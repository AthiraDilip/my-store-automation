Feature: Create Account page scenarios

  @UserStory4
  Scenario Outline: Validate error message while Creating an account with invalid email
    Given I am on 'Home' page
    And Click on 'Sign in' link
    When Enter '<invalid_email>' in Email address field
    And Click on 'Create an account' button
    Then Error message 'Invalid email address.' should be displayed
    Examples:
      | invalid_email |
      | abc           |
      | abc@xy        |
      | @abc          |
      | @abc.com      |

  @UserStory4
  Scenario: Create an account without providing mandatory fields
    Given I am on 'Home' page
    And Click on 'Sign in' link
    When Enter 'valid' in Email address field
    And Click on 'Create an account' button
    And Click on 'Register' button
    Then Below error messages are displayed
      | You must register at least one phone number.                                     |
      | lastname is required.                                                            |
      | firstname is required.                                                           |
      | passwd is required.                                                              |
      | address1 is required.                                                            |
      | city is required.                                                                |
      | The Zip/Postal code you've entered is invalid. It must follow this format: 00000 |
      | This country requires you to choose a State.                                     |

  @UserStory4
  Scenario Outline: Validate Error message by providing invalid data in all the values
    Given I am on 'Home' page
    And Click on 'Sign in' link
    When Enter 'valid' in Email address field
    And Click on 'Create an account' button
    When I fill 'First Name' with value '<First Name>'
    And I fill 'Last Name' with value '<Last Name>'
    And I fill 'Password' with value '<Password>'
    And I fill 'Address' with value '<Address>'
    And I fill 'City' with value '<City>'
    And I fill 'Zip/Postal code' with value '<Zip/Postal code>'
    And I fill 'Home Phone' with value '<Home Phone>'
    And I fill 'Mobile Phone' with value '<Mobile Phone>'
    And Click on 'Register' button
    Then Below error messages are displayed
      | lastname is invalid.                                                             |
      | firstname is invalid.                                                            |
      | passwd is invalid.                                                               |
      | address1 is invalid.                                                             |
      | postcode is invalid.                                                             |
      | city is invalid.                                                                 |
      | phone is invalid.                                                                |
      | phone_mobile is invalid.                                                         |
      | The Zip/Postal code you've entered is invalid. It must follow this format: 00000 |
      | This country requires you to choose a State.                                     |
    Examples:
      | First Name | Last Name | Password | Address | City   | Zip/Postal code | Home Phone | Mobile Phone |
      | Ath!ra     | V!vek     | Pass     | $%^&*(  | "%^&*( | "$%^&*(         | ABCDBCNENN | ABCDBCNENN   |


  @UserStory4
  Scenario Outline: Create an account by providing all the values
    Given I am on 'Home' page
    And Click on 'Sign in' link
    When Enter 'valid' in Email address field
    And Click on 'Create an account' button
    When I fill 'Title' with value '<Title>'
    When I fill 'First Name' with value '<First Name>'
    And I fill 'Last Name' with value '<Last Name>'
    And I fill 'Password' with value '<Password>'
    And I fill 'Date Of Birth' with value '<Date Of Birth>'
    And I fill 'Company' with value '<Company>'
    And I fill 'Address' with value '<Address>'
    And I fill 'City' with value '<City>'
    And I fill 'State' with value '<State>'
    And I fill 'Zip/Postal code' with value '<Zip/Postal code>'
    And I fill 'Country' with value '<Country>'
    And I fill 'Additional Information' with value '<Additional Information>'
    And I fill 'Home Phone' with value '<Home Phone>'
    And I fill 'Mobile Phone' with value '<Mobile Phone>'
    And I fill 'Address Alias' with value '<Address Alias>'
    And Click on 'Register' button
    Then I should be navigated to 'My account' page
    And Account name displayed is a combination of '<First Name>' and '<Last Name>'
    Examples:
      | Title | First Name | Last Name | Password | Date Of Birth | Company  | Address | City  | State  | Zip/Postal code | Country       | Additional Information          | Home Phone | Mobile Phone | Address Alias |
      | Mrs.  | Athira     | Vivek     | Password | 20/1/1980     | Company1 | Grattan | Leeds | Alaska | 50011           | United States | Looking for practice Automation | 9999999999 | 9999999999   | Bradford, UK  |

  @UserStory4
  Scenario Outline: Create an account by providing only mandatory fields
    Given I am on 'Home' page
    And Click on 'Sign in' link
    When Enter 'valid' in Email address field
    And Click on 'Create an account' button
    When I fill 'First Name' with value '<First Name>'
    And I fill 'Last Name' with value '<Last Name>'
    And I fill 'Password' with value '<Password>'
    And I fill 'Address' with value '<Address>'
    And I fill 'City' with value '<City>'
    And I fill 'State' with value '<State>'
    And I fill 'Zip/Postal code' with value '<Zip/Postal code>'
    And I fill 'Country' with value '<Country>'
    And I fill 'Mobile Phone' with value '<Mobile Phone>'
    And Click on 'Register' button
    Then I should be navigated to 'My account' page
    And Account name displayed is a combination of '<First Name>' and '<Last Name>'
    Examples:
      | First Name | Last Name | Password | Address | City  | Zip/Postal code | State  | Country       | Mobile Phone |
      | Athira     | Vivek     | Password | Grattan | Leeds | 50011           | Alaska | United States | 9999999999   |

