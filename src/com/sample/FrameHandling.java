package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.expedia.co.in/deals");
		
		int total_frames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(total_frames );
		
		driver.switchTo().window("2").getTitle();
		

	}

}
