Feature: Users Test
  As a User I want to add user on OrangeHRM website
  @sanity   @regression
  Scenario: Verify that admin should Add user successfully
    Given Login to application
    When I click On Admin Tab
    Then Verify "System Users" Text
    When click On Add button
    Then Verify add user "Add User" Text
    When Select User Role Admin
    And enter Employee Name "Alice Duval"
    And enter Username "tester801"
    And Select status "Enabled"
    And enter password
    And enter Confirm Password
    And click On Save Button
    Then verify message "Successfully Saved"

  @smoke   @regression
Scenario: search the user created and verify it
  Given Login to application
  When I click On Admin Tab
  Then Verify "System Users" Text
  When enter Username "tester801"
  And Select Admin User Role
  And Select status "Enabled"
  And Click on Search Button
  Then Verify the User should be in Result list

  @regression
    Scenario: verify that admin should delete The User successfully
      Given Login to application
      When I click On Admin Tab
      Then Verify "System Users" Text
      When enter Username "tester801"
      And Select Admin User Role
      And Select status "Enabled"
      And Click on Search Button
      Then Verify the User should be in Result list
      When I Click on Check box
      And I Click on Delete Button and Popup will display
      And Click on Ok Button on Popup
      Then verify delete message "Successfully Deleted"

  @regression
    Scenario: verify the delete user and verify the message no record found
      Given Login to application
      When I click On Admin Tab
      Then Verify "System Users" Text
      When enter Username "tester801"
      And Select Admin User Role
      And Select status "Enabled"
      And Click on Search Button
      Then verify no records found message "No Records Found"