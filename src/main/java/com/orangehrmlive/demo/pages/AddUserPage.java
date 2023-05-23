package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
    WebElement userRoleDropDown;
    @CacheLookup
    @FindBy(linkText = "Admin")
    WebElement userRoleAdmin;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement userNameField;
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement statusDropDown;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement statusDisable;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Enabled')]")
    WebElement statusEnable;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelButton;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast-content oxd-toast-content--success']")
    WebElement successfulSavedMessage;

    public String getAddUserText() {
        log.info("Get Add User text " + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    public void verifyAddUserText(String expectedMessage) {
        Assert.assertEquals(getAddUserText(), expectedMessage);
    }

    public void selectUserRoleAdminFromDropDown() {
        //selectByContainsTextFromDropDown(userRoleDropDown, userRole);
        clickOnElement(userRoleDropDown);
        log.info("Click on User Role dropdown " + userRoleDropDown.toString());
        clickOnElement(userRoleAdmin);
        log.info("Click on User Role Admin " + userRoleAdmin.toString());
    }

    public void enterEmployeeName(String employeeName) {
        sendTextToElement(employeeNameField, employeeName);
        log.info("Enter Employee name " + employeeName.toString());
    }

    public void enterUsername(String username) {
        sendTextToElement(userNameField, username);
        log.info("Enter Username " + userNameField.toString());
    }

//    public void selectStatusDisableFromDropDown() {
//        //  selectByContainsTextFromDropDown(statusDropDown, status);
//        clickOnElement(statusDropDown);
//        log.info("Click on status Dropdown " + statusDropDown.toString());
//
//    }

    public void selectStatusFromDropDown(String status) {
        //  selectByContainsTextFromDropDown(statusDropDown, status);
        clickOnElement(statusDropDown);
        log.info("Click on Status dropdown " + statusDropDown.toString());
        if (statusEnable.equals(status)) {
            clickOnElement(statusEnable);
            log.info(" Click on Status Enable " + statusEnable.toString());
        } else {
            clickOnElement(statusDisable);
            log.info("Click on status Disable " + statusDisable.toString());
        }
    }
    public void enterPassword() {

        sendTextToElement(passwordField, "Tester123");
        log.info(" Enter Password " + passwordField.toString());
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPasswordField, "Tester123");
        log.info("Enter confirm Password filed " + confirmPasswordField.toString());
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        log.info(" Click on Save Button " + saveButton.toString());
    }


    public void VerifySuccessfullySavedMessage(String expectedMessage) {
        Assert.assertTrue(getTextFromElement(successfulSavedMessage).contains(expectedMessage));
    }

    public void clickOnCancelButton() {
        clickOnElement(cancelButton);
        log.info("Click on Cancel Button " + cancelButton.toString());
    }


}
