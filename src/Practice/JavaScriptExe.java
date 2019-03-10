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

public class JavaScriptExe {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('u_0_j').value ='hello'");
		
		//js.executeScript("document.getElementById('u_0_j').setAttribute('value','hello')");
		
		//System.out.println(js.executeScript("return document.getElementById('u_0_j').getAttribute('id')"));
		
		//System.out.println(js.executeScript("return document.getElementById('email').innerHTML").toString());
		
		//js.executeScript("window.location = 'http://ebay.in'");
		
		//js.executeScript("document.location = 'http://makemytrip.com'");
		
		String Title = js.executeScript("return document.title").toString();
		System.out.println(Title);
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@value = 'Log In']"));
		
		js.executeScript("arguments[0].click();",element);
		WebElement ele = driver.findElement(By.xpath("//*[text()=' Facebook © 2019']"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		//js.executeScript("document.getElementById('123').scrollIntoView()");
		
		//js.executeScript("window.scrollBy(0,500)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("alert('custom alert message')");
		
		//js.executeScript("history.go(0)");
		//js.executeScript("history.back()");
		//js.executeScript("history.forward()");
		
		//js.executeScript("window.history.go(0)");
		//js.executeScript("window.history.back()");
		//js.executeScript("window.history.forward()");
		

		}
		
	}


