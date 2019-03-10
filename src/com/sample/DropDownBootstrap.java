package com.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownBootstrap {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']//li/a"));
		
		/* for(int i=0;i<list.size();i++)
		{
			//String s =list.get(i).getText();
			//String s =list.get(i).getTagName();
			String s = list.get(i).getAttribute("innerHTML");
			//String s = list.get(i).getAttribute("href");
			
			System.out.println(s);
			
			if(s.contentEquals("JavaScript"))
			{
				list.get(i).click();
				break;
			}

		}   */
		
		for(WebElement ele:list)
		{
			String s = ele.getText();
			System.out.println(s);
			if(s.equals("JavaScript"))
			{
				ele.click();
				break;
			}
		}
		//driver.quit();
	}

}
