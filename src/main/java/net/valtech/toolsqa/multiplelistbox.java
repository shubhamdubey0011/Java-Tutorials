package net.valtech.toolsqa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.LSTORE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multiplelistbox
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

		driver.get("file:///C:\\Users\\shubham.dubey\\Desktop\\dropdown.html");

	}
	
	@Test(description="checking list box is multi select")
	public void verifyingMultiListBox()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
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
	@Test(description="selecting all the options present in the listbox")
	public void SelectingMultipleoption()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
		 Select select = new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		int count = alloptions.size();
		for (int i = 0; i < count; i++) 
		{
		   select.selectByIndex(i);	
		}
		
	}
	
	@Test(description="fetching all the seleted items from the list box ")
	public void getMultipleoption()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
		 Select select = new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		int count = alloptions.size();
		for (int i = 0; i < count; i++) 
		{
		 System.out.println(alloptions.get(i).getText());
		 
		}
		
	}
	
	@Test(description="deselecting all the options from the listbox  ")
	public void dedelsectingMultipleoption()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
		 Select select = new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		int count = alloptions.size();
		for (int i = 0; i < count; i++) 
		{
		select.deselectByIndex(i);
		 
		}
		
	}
	
	@Test(description="selecting all the options from the listbox in reverse order   ")
	public void sectingMultipleoptioninreverseorder()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
		 Select select = new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		int count = alloptions.size();
		for (int i = count-1; count> 0; i--) 
	   
		{
		select.selectByIndex(i);
		}
		
	}
	
	@Test(description="selecting alternate  options from the listbox    ")
	public void sectingalternateoptionins()
	{
		
		WebElement listbox = driver.findElement(By.xpath("//select[@name='mydropdown']"));
		 Select select = new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		int count = alloptions.size();
		for (int i = 0; i < count; i=i+2) 
		{
		select.selectByIndex(i);
		}
		
	}
	
	
	@AfterMethod
	public void afterMethod() {

		// Close the driver

		driver.quit();

	}
	
	
	
}
