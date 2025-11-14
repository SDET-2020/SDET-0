package com.jenkins.manager.page;

import com.jenkins.manager.util.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.jenkins.manager.util.Util.actionClick;

public class Page {

    WebDriver driver;

    Util util = new Util();

    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement signin;

    @FindBy(xpath = "//b[text()='You logged into a secure area!']")
    private WebElement loginSuccessfulMessage;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignin() {
        return signin;
    }

    public WebElement getLoginSuccessfulMessage() {
        return loginSuccessfulMessage;
    }

    public void loginTOTheApp(){
        getUsername().sendKeys("sharma350");
        getPassword().sendKeys("Sharma@350");
        actionClick(driver, getSignin());
    }

    public void verifyLoginSuccessfulMessage(){
        String loginSuccessfulMessage = util.getText(driver, getLoginSuccessfulMessage());
        System.out.println(loginSuccessfulMessage);
    }
}
