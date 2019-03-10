package com.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class TakeScreenShot {

	
   public static void screenShot(WebDriver driver,String fileName) throws IOException
     {
		try
		{
			
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source,new File("D:/2019/Screenshots/" + fileName+".png")); 
		FileHandler.copy(source,new File("D:/2019/Screenshots/" + fileName+".png"));
		System.out.println("Screen-shot taken");
		
		}
		 
		catch(Exception e)
	    {
		  System.out.println("Exception while taking screenshot" + e.getMessage()); 
	    }
    
    }
   
   
   
 
   
   
   
   
   
   
   
   
   
   
   
}

