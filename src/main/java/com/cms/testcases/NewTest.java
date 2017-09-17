package com.cms.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver = new FirefoxDriver();
//	WebDriver driver = new ChromeDriver();

	  @BeforeTest
	  public void launchapp()
	  {		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chromedriver.exe");
		
		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Launch website
	    driver.navigate().to("http://www.baidu.com");	
	    driver.manage().window().maximize();
	  }
			
	  @Test
	  public void calculatepercent()
	  {

		// Enter value 10 in the first number of the percent Calculator
		driver.findElement(By.id("kw")).sendKeys("webdriver"); 		
	

		// Click Calculate Button	
		driver.findElement(By.id("su")).click();	   

		
		//Print a Log In message to the screen		
		System.out.println(" The Result is " );					
			
		
	  }

	  @AfterTest
	  public void terminatetest()
	  {   
	    driver.close();
	  }

}
