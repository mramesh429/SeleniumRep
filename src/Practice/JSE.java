package Practice;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.sample.JavaScriptExecutor;

public class JSE {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.makemytrip.com/");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('load_more').scrollIntoView()");
		
		//js.executeScript("window.scrollBy(0,500)");
		//String a = driver.findElement(By.xpath("//*[text()='LOAD MORE']")).getText();
		
		//System.out.println(a);
		//driver.findElement(By.xpath("//*[text()='LOAD MORE']")).click();
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).click();
		//driver.navigate().refresh();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@id = 'ui-id-2']/li"));
		try{
			
			for(WebElement a:ele)
			{
				String x = a.getText();
				System.out.println(x);

	            if(x.equals("New Delhi, India\nDEL"))
				{
	            	System.out.println("heloooooooooooooo");
					a.click();
				}
				
			}

		
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("catch block");
			
			List<WebElement> ele1 = driver.findElements(By.xpath("//ul[@id = 'ui-id-2']/li"));
			
			for(WebElement a:ele1)
			{
				String x = a.getText();
				System.out.println(x);

	            if(x.equals("New Delhi, India"))
				{
	            	System.out.println("heloooooooooooooo");
					a.click();
				}
				
			}

		}
		
	}

}
