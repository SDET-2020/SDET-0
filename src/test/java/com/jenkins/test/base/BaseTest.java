package com.jenkins.test.base;

import com.jenkins.manager.base.Base;
import com.jenkins.manager.page.Page;
import org.testng.annotations.Test;

public class BaseTest extends Base {

    @Test
    public void baseTest(){
        Page page = new Page(driver);
        page.loginTOTheApp();
    }
}
