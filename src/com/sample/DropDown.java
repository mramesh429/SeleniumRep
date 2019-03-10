package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
		//month_dd.selectByIndex(3);
		Thread.sleep(2000);
		//month_dd.selectByValue("2");
		//Thread.sleep(2000);
		//month_dd.selectByVisibleText("Aug");
		//Thread.sleep(3000);

		//month_dd.deselectByIndex(3);
		
		List<WebElement> list =  month_dd.getAllSelectedOptions();
		
		System.out.println(list.size());
		
		/* for(int i=0;i<list.size();i++)
		{
			String value = month_dd.getOptions().get(i).getText();
			if(value.equals("Aug"))
			{
				month_dd.selectByIndex(i);
				break;
			}
		}  */



		
		

	}

}
