Feature: Login with Valid Credentials

@sanity @regression
  Scenario: Successfull Login with Valid Credentials
    Given User Launch the browser
    And Open URL "https://demo.nopcommerce.com/"
    When User click on Login button
    Then check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"
    
    
    Examples:
      |row_index|
      |1|
      |2|
      |3|
    
