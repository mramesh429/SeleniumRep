package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().refresh();
		
		

	}

}
