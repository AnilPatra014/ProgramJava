package com.string;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebPushNotification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sushil\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		
	}

}
