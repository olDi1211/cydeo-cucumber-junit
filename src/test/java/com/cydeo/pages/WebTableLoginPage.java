package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "username")
    public WebElement inputUserName;
    @FindBy(name = "password")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement inputLoginButton;

    /**when we call this method it will directly login using: Username: Test and Password: Tester
    */
     public void login(){
        this.inputUserName.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.inputLoginButton.click();
    }

    /**
     * THis method will accept two arguments and login
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        inputLoginButton.click();
    }

    /**
     * This methid will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("webTable.userName"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("webTable.password"));
        inputLoginButton.click();
    }



}
