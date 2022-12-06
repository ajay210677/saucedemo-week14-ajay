package com.saucedemo.testsuite;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public LoginPageTest() {
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        this.loginPage.enterUserName("standard_user");
        this.loginPage.enterPassword("secret_sauce");
        this.loginPage.clickOnLoginButton();
        Assert.assertEquals(this.loginPage.getTitleText(), "PRODUCTS", "Text not matched");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        this.loginPage.enterUserName("standard_user");
        this.loginPage.enterPassword("secret_sauce");
        this.loginPage.clickOnLoginButton();
        Assert.assertEquals(6, 6, this.loginPage.getListOfProducts());
    }




}