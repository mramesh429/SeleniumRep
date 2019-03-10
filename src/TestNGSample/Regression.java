package TestNGSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Regression {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
	}
	
	@Test
	public void hello()
	{
		System.out.println("hello");
	}
		
	@Test
   public void bye()
   {
		System.out.println("bye");
   }
}
