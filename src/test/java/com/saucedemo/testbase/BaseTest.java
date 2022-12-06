package com.saucedemo.testbase;


import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "chrome";
    @BeforeMethod
    public  void setup(){
        selectBrowser(browser);
    }

    public void selectBrowser(String browser) {
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    public void closeBrowser() {
    }
}
