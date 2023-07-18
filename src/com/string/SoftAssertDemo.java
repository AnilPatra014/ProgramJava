package com.string;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

public WebDriver driver;
	
	@Test
	public void verifyloginpage()
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sushil\\Documents\\chromedriver_win32\\chromedriver.exe\\");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		String expectedtitle="Anil";
		String actualtitle=driver.getTitle();
		//Assert.assertEquals(actualtitle, expectedtitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("execution complete");
}
}
