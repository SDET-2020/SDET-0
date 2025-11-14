package com.jenkins.manager.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class Base {

    public WebDriver driver;

    @BeforeSuite
    public void startServer(){
        System.out.println("========== Server started Successfully!==========");
    }

    @BeforeTest
    public void startTest(){
        System.out.println("========== Test has been started Successfully!==========");
    }

    @BeforeClass
    public void initializeBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://practice.expandtesting.com/login");
        System.out.println("========== Browser Launched Successfully!==========");
    }

    @BeforeMethod
    public void loginToApp(){
        System.out.println("========== Logged in operation performed Successfully!==========");
    }

    @BeforeMethod
    public void logoutToApp(){
        System.out.println("========== Log out operation performed Successfully!==========");
    }

    @AfterClass
    public void stopBrowser(){
        driver.quit();
        System.out.println("========== Browser has stoped Successfully!==========");
    }

    @AfterTest
    public void stopTest(){
        System.out.println("========== Test has been stoped Successfully!==========");
    }

    @AfterSuite
    public void stopServer(){
        System.out.println("========== Server stoped Successfully!==========");
    }


}
