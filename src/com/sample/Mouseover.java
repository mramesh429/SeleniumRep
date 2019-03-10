package com.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://in.ebay.com/");
		//driver.get("https://spiceject.com/");
		
		WebElement element = driver.findElement(By.linkText("Electronics"));
		//System.out.println(element.getText());
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("iPhone")).click();
		
		
		

	}

}
