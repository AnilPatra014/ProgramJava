package com.string;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sushil\\Documents\\chromedriver_win32\\chromedriver.exe\\");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 WebElement left=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		 Actions act=new Actions(driver);
		 act.click(left).perform();
		 //act.release();

	}

}
