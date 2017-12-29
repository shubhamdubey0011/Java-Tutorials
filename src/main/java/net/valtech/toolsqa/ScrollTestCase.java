package net.valtech.toolsqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollTestCase 
{

	
public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();


driver.get("http://jqueryui.com");
	

Thread.sleep(5000);

((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		  
		     
		 }
}
