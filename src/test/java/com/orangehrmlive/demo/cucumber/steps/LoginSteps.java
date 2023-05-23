package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^enter Username$")
    public void enterUsername() {
        new LoginPage().enterUsername();
    }

    @And("^Enter password$")
    public void enterPassword() {
        new LoginPage().enterPassword();
    }

    @And("^Click on Login Button$")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^Verify dashboard text is displayed \"([^\"]*)\"$")
    public void verifyDashboardTextIsDisplayed(String expected) {
        new LoginPage().verifyDashboardText(expected);
    }

    @Then("^Verify Logo is displayed$")
    public void verifyLogoIsDisplayed() {
        new DashboardPage().verifyLogoIsDisplayed();
    }

    @And("^click on User Profile logo$")
    public void clickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @And("^Mouse hover on Logout and click$")
    public void mouseHoverOnLogoutAndClick() {
        new DashboardPage().mouseHoverOnLogoutAndClick();
    }

    @Then("^Verify the Login panel text \"([^\"]*)\" is displayed$")
    public void verifyTheLoginPanelTextIsDisplayed(String expected) {
        new LoginPage().verifyTheTextLoginPanelIsDisplayed(expected);
    }
}
