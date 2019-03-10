package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://in.ebay.com/");
		
		WebElement element = driver.findElement(By.id("gh-cat"));
		Select s = new Select(element);
		s.selectByVisibleText("Stamps");
		
		//JavaScriptUtil.flash(element1, driver);
		 
		//JavascriptExecutor  js = (JavascriptExecutor) driver;
		

		//js.executeScript("window.location = 'http://ebay.in'");
		
		//js.executeScript("document.location ='http://ebay.in'");
		
		//Thread.sleep(5000);
		
		//js.executeScript("document.getElementById('gh-ac').value = 'Hello'");
		
		//js.executeScript("document.querySelector('#gh-ac').value = 'bye'");

		//String str = js.executeScript("return document.title").toString();
		 //System.out.println(str);
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.history.back()");

	}

}
