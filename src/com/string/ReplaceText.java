package com.string;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReplaceText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sushil\\Documents\\chromedriver_win32\\chromedriver.exe\\");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 WebElement username=driver.findElement(By.id("email"));
		 username.sendKeys("Anil");
		 System.out.println(username.getAttribute("value"));
		 
		 
	}

}
