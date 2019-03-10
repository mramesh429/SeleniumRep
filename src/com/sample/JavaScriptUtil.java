package com.sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {

			
		public static void flash(WebElement element, WebDriver driver)
		{
						
			String bgcolor = element.getCssValue("backgroundColor");
			
			System.out.println(bgcolor);
			
			for(int i=0;i<500;i++)
			{
				changeColor("rgb(0,200,0)",element,driver);
				changeColor("bgcolor",element,driver);
			}
			
		}
		
		public static void changeColor(String color, WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.backgroundColor = +color+", element);
		
		try{
			Thread.sleep(20);
		}
		catch(InterruptedException e)
		{
		}
		}

	}


