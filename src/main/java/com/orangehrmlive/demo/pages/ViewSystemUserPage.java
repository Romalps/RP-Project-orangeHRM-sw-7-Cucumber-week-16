package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViewSystemUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());

    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    WebElement userRollDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'-- Select --')])[2]")
    WebElement statusDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement resetButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteButton;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-table-card'])")
    WebElement resultList;
    @CacheLookup
    @FindBy(xpath = "//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkboxLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast-container oxd-toast-container--bottom']")
    WebElement successfulDeleteMessage;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDeleteButton;
    @CacheLookup
    @FindBy(id= "oxd-toaster_1")
    WebElement noRecordsFoundText;

    public String getSystemUsersText() {
        log.info(" Get System users text " + systemUsersText.toString());
        return getTextFromElement(systemUsersText);
    }

    public void verifySystemUsersText(String expectedMessage) {
        Assert.assertEquals(getSystemUsersText(), expectedMessage);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
        log.info("enter username " + username.toString());
    }

    public void selectUserRollFromDropDown() {
        selectByVisibleTextFromDropDown(userRollDropDown, "-- Select --");
        log.info("Select User Role from Dropdown " + userRollDropDown.toString());
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
        log.info("Enter Employee name " + name.toString());
    }

    public void selectStatusFromDropDown() {
        selectByVisibleTextFromDropDown(statusDropDown, "-- Select --");
        log.info("Select status from dropdown " + statusDropDown.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        log.info(" Click on Search Button " + searchButton.toString());
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
        log.info(" Click on Reset button " + resetButton.toString());
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        log.info("Click on add button  " + addButton.toString());
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
        log.info(" Click on Delete Button " + deleteButton.toString());
    }

    public String getResultListText() {
        log.info(" Get result List text " + resultList.toString());
        return getTextFromElement(resultList);

    }

    public void verifyTheUserShouldBeInResultList() {
        Assert.assertTrue(getResultListText().contains("Admin"));
    }

    public void clickOnCheckbox() {
        clickOnElement(checkboxLink);
        log.info(" Click on Checkbox " + checkboxLink.toString());
    }

    public void clickOnYesDeleteButton() {
        //switchToAlert();
        clickOnElement(yesDeleteButton);
    }

    public void verifyMessageSuccessfullyDeleted(String expectedMessage) {
        Assert.assertTrue(getTextFromElement(successfulDeleteMessage).contains(expectedMessage));
    }

    public void verifyNoRecordsFoundText(String expectedMessage) {
        Assert.assertTrue(getTextFromElement(noRecordsFoundText).contains(expectedMessage));
    }
}
