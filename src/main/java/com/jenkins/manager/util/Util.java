package com.jenkins.manager.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {

    /**
     * Use this method to get performed click action
     * @param element
     */
    public static void click(WebElement element){
        try {
            element.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to get performed sendkeys action
     * @param element
     * @param message
     */
    public static void sendkeys(WebElement element, String message){
        try {
            element.sendKeys(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to get performed to get text action
     * @param element
     * @return
     */
    public static String getText(WebDriver driver, WebElement element){
        String message;
        try {
            waitUntilDisplayed(driver, element);
            message = element.getText();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return message;
    }

    /**
     * Use this method to get performed
     * @param driver
     * @param element
     */
    public static void waitUntilDisplayed(WebDriver driver, WebElement element){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to get action click
     * @param driver
     * @param element
     */
    public static void actionClick(WebDriver driver, WebElement element){
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to get current web title
     * @param driver
     * @return
     */
    public static String getTitle(WebDriver driver){
        return driver.getTitle();
    }
}
