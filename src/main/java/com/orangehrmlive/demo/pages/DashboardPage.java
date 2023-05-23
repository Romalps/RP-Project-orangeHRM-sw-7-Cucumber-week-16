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

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboardText;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userProfileLogo;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logoImage;

    public String getDashboardText() {
        log.info("Get Dashboard text " + dashboardText.toString());
        return getTextFromElement(dashboardText);
    }

    public void clickOnUserProfileLogo() {

        clickOnElement(userProfileLogo);
        log.info(" Click on User Profile Logo " + userProfileLogo.toString());
    }

    public void mouseHoverOnLogoutAndClick() {

        mouseHoverToElementAndClick(logoutLink);
        log.info("Mouse Hover on Logout And click " + logoutLink.toString());
    }

    public void verifyLogoIsDisplayed() {
        Assert.assertTrue(logoImage.isDisplayed(), "Logo is not displayed");
    }

}
