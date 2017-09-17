package com.cms.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		WebDriver driver = DriverManager.threadDriver.get();
		if (driver == null) {
			driver = new ChromeDriver();
			threadDriver.set(driver);			
		}
		return driver;
	}

}
