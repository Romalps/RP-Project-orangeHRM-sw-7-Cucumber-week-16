package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='User Management']")
    WebElement userManagementLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Job']")
    WebElement jobLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Organization']")
    WebElement organizationLink;


    public void clickOnUserManagementLink() {
        clickOnElement(userManagementLink);
        log.info(" Click on User management " + userManagementLink.toString());
    }

    public void clickOnJobLink() {
        clickOnElement(jobLink);
        log.info("Click on Job link " + jobLink.toString());
    }

    public void clickOnOrganizationLink() {
        clickOnElement(organizationLink);
        log.info(" Click on Organization Link " + organizationLink.toString());
    }


}
