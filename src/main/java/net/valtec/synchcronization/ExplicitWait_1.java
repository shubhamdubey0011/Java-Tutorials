package net.valtec.synchcronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait_1 {

	private WebDriver driver;

	private String baseUrl;

	@BeforeMethod
	public void beforeMethod() {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		

		

		//driver.get("http://store.demoqa.com/");
		baseUrl = "http://www.flipkart.com";

	}
	@Test
	public void testUntitled() throws Exception {

		
		// Launch the  Website
		driver.get(baseUrl);
		
		
		  // custom explicit wait for search field

        new WebDriverWait(driver, 10)

                      .until(new ExpectedCondition<WebElement>() 
                    		  {

                           

                            public WebElement apply(WebDriver d) 
                            {

                                   return d.findElement(By.xpath("//div[@class='O8ZS_U']/input"));

                            }

               }
                      );

		// custom explicit wait for search field
		driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys("Laptop");
		

		driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();

	}

	@AfterMethod
	public void tearDown() throws Exception {

	driver.quit();

	}

}
