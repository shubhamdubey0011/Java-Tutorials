package net.valtech.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdownmenu 
{
   private WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Online Store Website

		driver.get("http://store.demoqa.com/");

	}
	
	
	
	
	@Test(description="handling drop down menu")
	public void main()
	{
		
		WebElement dropdown_menu = driver.findElement(By.xpath("//li[@id='menu-item-33']/a[contains(text(),'Product Category')]"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdown_menu).perform();
		
		driver.findElement(By.linkText("iPhones")).click();
		System.out.println("selected iphone ");
		
		
		
		
	}
	
	
	@AfterMethod
	public void afterMethod() {

		// Close the driver

		driver.quit();

	}
}
