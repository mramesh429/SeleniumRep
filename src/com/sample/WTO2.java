package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTO2 {
	public static String a;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/losers/bse/daily");
		
		String s = "Tourism Finance";
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		
		for(int i=1;i<row.size();i++)
		{
			int col = driver.findElements(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr["+i+"]/td")).size();
			System.out.println(" ");
			for(int j=1;j<col;j++)
			{
				WebElement ele = driver.findElement(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]"));
				
				 a = ele.getText();
				System.out.print(" "+a+" ");
			
			}
			if(a.trim().equals(s.trim()))
			{
				//WebElement ele2 = driver.findElement(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr["+i+"]/td[3]"));
				
				//String x = ele2.getText();
				System.out.println("Row String matched:::::");
				break;
			}
			
		}
		
driver.close();

}
}
