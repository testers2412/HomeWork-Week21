package com.soucedemo;

import com.cucumber.listener.Reporter;

import com.soucedemo.propertyreader.PropertyReader;
import com.soucedemo.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {
    //This will run before every scenario
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Mehul");
    }

    //This will run after every scenario
    @After
    public void tearDown(Scenario scenario) {
//Using the isFailed method of teh scenario interface to get a screenshot upon test failure
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
