package com.sample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {
	
	public static void main(String args[]) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	//driver.get("http://the-internet.herokuapp.com/key_presses");
	driver.get("https://www.gmail.com");
	
	TakeScreenShot.screenShot(driver,"gmail");
	
	

}
}