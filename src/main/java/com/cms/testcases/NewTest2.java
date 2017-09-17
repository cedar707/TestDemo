package com.cms.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	@Test // default enable=true
    public void test1() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = true)
    public void test2() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test3() {
        Assert.assertEquals(true, true);
    }

}
