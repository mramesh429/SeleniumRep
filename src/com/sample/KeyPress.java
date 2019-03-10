package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("hello");
		//driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"c");
	
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		
		//driver.navigate().refresh();//
		
		//act.sendKeys(keys.ch)

         //driver.findElement(By.id("page-footer")).sendKeys(Keys.SPACE);
		
		/*Actions act = new Actions(driver);
		act.sendKeys(Keys.SPACE).build().perform();
         String s = driver.findElement(By.id("result")).getText();
         System.out.println(s);  */
	}

}
