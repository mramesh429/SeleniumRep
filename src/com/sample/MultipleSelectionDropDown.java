package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://toolsqa.com/automation-practice-form");
		WebElement MS = driver.findElement(By.id("selenium_commands"));
		
		Select s = new Select(MS);
		s.selectByIndex(2);
		s.selectByVisibleText("Wait Commands");
		s.selectByIndex(1);
		
		List list = s.getAllSelectedOptions();
		System.out.println(list.size());
		
		Thread.sleep(3000);
		
		//s.deselectByIndex(1);
		//s.deselectByVisibleText("Switch Commands");
		//s.deselectByValue("2");
		s.deselectAll();
		List list1 = s.getAllSelectedOptions();
		System.out.println(list1.size());
		
		System.out.println(s.isMultiple());
		

	}

}
