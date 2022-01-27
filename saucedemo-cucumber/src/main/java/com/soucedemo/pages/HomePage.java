package com.soucedemo.pages;

import com.soucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class HomePage extends Utility {
    // For logging, we're declaring variable of Logger class from Log4J2
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // with this constructor, we initialize all the page object with initElement method of PageFactory class
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameTab;
@CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordTab;
@CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginTab;

    public void enterUsername(String username){
        pmSendTextToElement(userNameTab,username);
        log.info("Enter User name :"+ username);
    }
    public void enterPassword(String password){
        pmSendTextToElement(passwordTab,password);
        log.info("Enter Password :"+ password);
    }
    public void clickOnLogin(){
        pmClickOnElement(loginTab);
        log.info("Click on Login Tab :"+ loginTab.toString());
    }

}
