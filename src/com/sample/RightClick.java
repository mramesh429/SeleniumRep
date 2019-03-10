package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://in.ebay.com/");
		
		WebElement element = driver.findElement(By.cssSelector(".gh-tb"));
		
		Actions act = new Actions(driver);
		
		//act.contextClick(element).perform();
		
		act.contextClick().perform();
		
		

	}

}
