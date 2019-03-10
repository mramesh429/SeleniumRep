package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizabe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
WebElement element = driver.findElement(By.cssSelector(".ui-resizable-handle"));
		
		Actions act = new Actions(driver);
		
	 act.clickAndHold(element).moveByOffset(200,100).perform();

	}

}


