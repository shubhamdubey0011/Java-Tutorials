package net.valtech.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeselectOptions 
{
	public WebDriver driver;
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
	
	@Test(description="checking list box is multi select")
	public void verifyingMultiListBox()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
		driver.manage().window().maximize();
		 Select select = new Select(listbox);
		 if (select.isMultiple()) 
		 {
		         System.out.println("list box has multiple selects options ");
		         
		}
		
		 else
		 {
		System.out.println("Not a multi select list box ");
		
		 }
	}
	
	
}
