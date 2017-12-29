package net.valtech.toolsqa;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListBoxSelectOption 
{

	private WebDriver driver ;
	
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
	
	
	@Test(description="selecting iphone opiton from the product category using sendkeys()")
	public void verifyingMultiListBox()
	{
		
		WebElement dropdown_menu = driver.findElement(By.xpath("//li[@id='menu-item-33']/a[contains(text(),'Product Category')]"));
		
		dropdown_menu.sendKeys("i");
		dropdown_menu.sendKeys(Keys.DOWN);
		dropdown_menu.sendKeys(Keys.ENTER);
		
	
	
	
}
}