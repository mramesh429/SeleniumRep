package com.sample;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.payscale.com/research/IN/Job=Personal_Trainer/Salary");
		
		List<WebElement> data = driver.findElements(By.xpath("//table//tbody/tr/th[text() = 'Employer']/parent::*/parent::*//parent::*/td"));
		
		for(WebElement e: data)
		{
			System.out.println(e.getText()+" ");
		}
		
		
	}

}
