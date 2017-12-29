package net.valtech.selenium;



import java.io.File;
 
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreeShotDemo 
{

	public static void main(String[] args) 
	
	{

		System.setProperty("webdriver.chrome.driver","F:/Java_LAB_Workspace/JavaTutorials/src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		// Maximize the window
	
		 
		// Pass the url
		driver.get("http://toolsqa.com/selenium-webdriver/install-testng/");
		 
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("F:/selenium/TestNgInstallation1.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}
}
