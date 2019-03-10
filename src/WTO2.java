import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTO2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/losers/bse/daily");
		
	/*1--	List<WebElement> r = driver.findElements(By.xpath("//*[@id = 'leftcontainer']/table/thead/tr/th"));
		
		System.out.println(r.size());
		for(int i=0;i<r.size();i++){
			
			System.out.println(r.get(i).getText());
		}
		
	*/
				
		
		
		

}

}
