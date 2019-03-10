package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://in.ebay.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.cssSelector(".gh-tb"));
		
		//Actions act = new Actions(driver);
		
		element.sendKeys("selenium");
		
		element.sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("gh-btn")).click();
		
		WebElement element1 = driver.findElement(By.cssSelector(".gh-1199"));

		Thread.sleep(2000);
		element1.sendKeys(Keys.CLEAR);
		Thread.sleep(2000);

		element1.sendKeys(Keys.CONTROL+"v");
		//System.out.println();
		
		

	}

}
