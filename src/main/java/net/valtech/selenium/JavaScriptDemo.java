package net.valtech.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemo 
{

	@Test
	public void javaScript() 
	{

		System.setProperty("webdriver.chrome.driver","F:/Java_LAB_Workspace/JavaTutorials/src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("http://localhost:8080/login.do");
				JavascriptExecutor jse = (JavascriptExecutor) driver;
		         jse.executeScript("document.getElementById('username').value='shubham';");
		         
	
	
}
}

	