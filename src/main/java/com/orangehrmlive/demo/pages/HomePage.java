package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchLink;
    @CacheLookup
    @FindBy(linkText = "Admin")
    WebElement adminLink;
    @CacheLookup
    @FindBy(linkText = "PIM")
    WebElement pIMLink;
    @CacheLookup
    @FindBy(linkText = "Leave")
    WebElement leaveLink;
    @CacheLookup
    @FindBy(linkText = "Dashboard")
    WebElement dashboardLink;


    public void clickOnSearchLink(String text) {
        sendTextToElement(searchLink, text);
        log.info("Click on search link " + searchLink.toString());
    }

    public void clickOnAdminLink() {
        clickOnElement(adminLink);
        log.info("Click on Admin link " + adminLink.toString());
    }

    public void clickOnPIMOLink() {
        clickOnElement(pIMLink);
        log.info(" Click on PIM link " + pIMLink.toString());
    }

    public void clickOnLeaveLink() {
        clickOnElement(leaveLink);
        log.info("Click on Leave link " + leaveLink.toString());
    }

    public void clickOnDashboardLink() {
        clickOnElement(dashboardLink);
        log.info("Click on Dashboard Link " + dashboardLink.toString());
    }


}
