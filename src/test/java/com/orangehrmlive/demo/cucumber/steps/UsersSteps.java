package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersSteps {
    @Given("^Login to application$")
    public void loginToApplication() {
        new LoginPage().enterUsername();
        new LoginPage().enterPassword();
        new LoginPage().clickOnLoginButton();
    }

    @When("^I click On Admin Tab$")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminLink();
    }

    @Then("^Verify \"([^\"]*)\" Text$")
    public void verifyText(String expected) {
        new ViewSystemUserPage().verifySystemUsersText(expected);
    }

    @When("^click On Add button$")
    public void clickOnAddButton() {
        new ViewSystemUserPage().clickOnAddButton();
    }

    @Then("^Verify add user \"([^\"]*)\" Text$")
    public void verifyAddUserText(String expected) {
        new AddUserPage().verifyAddUserText(expected);
    }

    @When("^Select User Role Admin$")
    public void selectUserRoleAdmin() {
        new AddUserPage().selectUserRoleAdminFromDropDown();
    }

    @And("^enter Employee Name \"([^\"]*)\"$")
    public void enterEmployeeName(String employeeName) {
        new AddUserPage().enterEmployeeName(employeeName);
    }


    @And("^enter password$")
    public void enterPassword() {
        new AddUserPage().enterPassword();
    }

    @And("^enter Confirm Password$")
    public void enterConfirmPassword() {
        new AddUserPage().enterConfirmPassword();
    }


    @And("^click On Save Button$")
    public void clickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("^verify message \"([^\"]*)\"$")
    public void verifyMessage(String expected) {
        new AddUserPage().VerifySuccessfullySavedMessage(expected);
    }

    @When("^enter Username \"([^\"]*)\"$")
    public void enterUsername(String username) {
        new AddUserPage().enterUsername(username);
    }

    @And("^Select Admin User Role$")
    public void selectAdminUserRole() {
        new AddUserPage().selectUserRoleAdminFromDropDown();
    }


    @And("^Select status \"([^\"]*)\"$")
    public void selectStatus(String status) {
        new AddUserPage().selectStatusFromDropDown(status);
    }

    @And("^Click on Search Button$")
    public void clickOnSearchButton() {
        new ViewSystemUserPage().clickOnSearchButton();
    }

    @Then("^Verify the User should be in Result list$")
    public void verifyTheUserShouldBeInResultList() {
        new ViewSystemUserPage().verifyTheUserShouldBeInResultList();
    }


    @When("^I Click on Check box$")
    public void iClickOnCheckBox() {
        new ViewSystemUserPage().clickOnCheckbox();
    }


    @And("^I Click on Delete Button and Popup will display$")
    public void iClickOnDeleteButtonAndPopupWillDisplay() {
        new ViewSystemUserPage().clickOnDeleteButton();
    }

    @And("^Click on Ok Button on Popup$")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUserPage().clickOnYesDeleteButton();
    }

    @Then("^verify delete message \"([^\"]*)\"$")
    public void verifyDeleteMessage(String expected) {
        new ViewSystemUserPage().verifyMessageSuccessfullyDeleted(expected);
    }


    @Then("^verify no records found message \"([^\"]*)\"$")
    public void verifyNoRecordsFoundMessage(String expected)  {
        new ViewSystemUserPage().verifyNoRecordsFoundText(expected);
    }
}
