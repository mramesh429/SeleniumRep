package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		
		//Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//*[@id ='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id ='droppable']"));
		
		act.clickAndHold(source).moveToElement(target).release().perform();
		
	//	act.dragAndDrop(source, target).perform();
		
		//rightclick
		
		

	}

}
