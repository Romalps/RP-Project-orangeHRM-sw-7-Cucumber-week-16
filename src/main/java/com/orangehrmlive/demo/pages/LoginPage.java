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

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameLink;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']")
    WebElement hrForAllLogoText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButtonLink;
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginPanelTextLocator;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboardText;

    public void enterUsername() {
        sendTextToElement(usernameLink, "Admin");
        log.info("Enter user name " + usernameLink.toString());
    }

    public void enterPassword() {
        sendTextToElement(passwordLink, "admin123");
        log.info("Enter password " + passwordLink.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButtonLink);
        log.info("Click on Login Button " + loginButtonLink.toString());
    }

    public void verifyDashboardText(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(dashboardText), expectedMessage);
    }

    public String getLoginPanelText() {
        log.info("Get Login Panel text " + loginPanelTextLocator.toString());
        return getTextFromElement(loginPanelTextLocator);
    }

    public void verifyTheTextLoginPanelIsDisplayed(String expectedMessage) {
        Assert.assertEquals(getLoginPanelText(), expectedMessage);
    }

}
