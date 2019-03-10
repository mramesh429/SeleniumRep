package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTO1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/losers/bse/daily");
		
		List<WebElement> r =  driver.findElements(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr"));
		
		
		System.out.println(r.size());
		for(int i=1;i<r.size();i++){
			
			WebElement ele = driver.findElement(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr["+i+"]/td[1]"));
			System.err.println(ele.getText());
			String a = ele.getText();
			if(a.equals("Advance Syntex"))
			{
				WebElement ele1 = driver.findElement(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr["+i+"]/td[4]"));
				System.out.println(ele1.getText());
				break;
			}
		}
		
				
		
		driver.close();

}
}
