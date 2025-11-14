package com.jenkins.test.test;

import com.jenkins.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jenkins.manager.util.Util.getTitle;

public class VerifyLoginTest extends BaseTest {

    @Test
    public void performLoginTest(){
        String title = getTitle(driver);
        System.out.println("The current windows title is : " + title);
        Assert.assertEquals(title, "Test Login Page for Automation Testing Practice", "Not matched title");
    }
}
