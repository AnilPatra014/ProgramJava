package com.string;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorEnter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sushil\\Documents\\chromedriver_win32\\chromedriver.exe\\");
//	    WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.myntra.com/");
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		for(int i=0;i<=0;i++)
//		{
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,1000)");
//		}
//		for(int i=0;i<=5;i++)
//		{
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,-1000)");
//			
//		}
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sushil\\Documents\\chromedriver_win32\\chromedriver.exe\\");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.google.co.in/");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		 Thread.sleep(3000);
		 List<WebElement> sugg=driver.findElements(By.xpath("//span(contains[text(),'selenium'])"));
		 System.out.println(sugg.size());
		 for(int i=0;i<=sugg.size();i++)
		 {
			 Thread.sleep(3000);
			 System.out.println()
		 }
	
	}

}
