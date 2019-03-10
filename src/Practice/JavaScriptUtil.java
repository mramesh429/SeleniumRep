package Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		flash(element,driver);
		drawBorder(element,driver);
	}
	
	
		public static void flash(WebElement element,WebDriver driver)
		{
			
		
		   String bgcolor  = element.getCssValue("backgroundColor");
		
		   for(int i=0;i<200;i++)
		    {
			changeColor("#000000",element,driver);
			changeColor(bgcolor,element,driver);
		    }
		}	
		
		public static void changeColor(String color,WebElement element,WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		}
		
		
		public static void drawBorder(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].style.border = '3px solid red'",element);
		}
		
	}
		
	


