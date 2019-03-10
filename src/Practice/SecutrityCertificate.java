package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SecutrityCertificate {

	public static void main(String[] args) {
		
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.acceptInsecureCerts();
		System.setProperty("webdriver.chrome.driver", "D:/2019/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seobook.com");
        
	}

}
