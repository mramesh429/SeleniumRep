package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProtectedMode {

	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);

		System.setProperty("webdriver.ie.driver", "D:/2019/Software/IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        driver.quit();
	}

}
