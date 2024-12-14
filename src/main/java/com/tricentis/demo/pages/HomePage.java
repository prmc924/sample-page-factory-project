package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

//    By loginLink = By.linkText("Log in");

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

//   By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on the Login Link " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Login Link");
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on the Register Link " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Register Link");
    }

}
