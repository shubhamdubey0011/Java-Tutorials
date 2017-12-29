package net.valtech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(
				"webdriver.chrome.driver",
				"F:/Java_LAB_Workspace/JavaTutorials/src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.alexa.com/topsites/countries;15/LU");

		// to scroll Page Down or UP using Keys Selenium WebDriver:
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		// jse.executeScript("window.scrollBy(0,1000)", "");//to scroll down
		// upto mentioned y pixcel
		
		
		// jse.executeScript("window.scrollBy(0,-1000)", "");
		//to scroll up upto mentioned x pixcel
		
		
		

		// to scroll Page Down till the bottom using Keys Selenium WebDriver:
		// jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// to scroll Page Down till the particular Webelement using Keys
		// Selenium WebDriver:
		// WebElement element =
		// driver.findElement(By.xpath("//li/a[text()='API']"));
		// jse.executeScript("arguments[0].scrollIntoView();", element);

		Actions action = new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(2000);
		//action.click(driver.findElement(By.xpath("//li/a[text()='API']")))
				//.perform();
		//action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();//ctl+END to scroll till bottom 
		action.sendKeys(Keys.CONTROL,Keys.END).perform();//ctl+END to scroll till bottom
		
		//Full scroll to bottom in slow motion:
		
		
		
//		for (int second = 0;; second++) {
//	        if(second >=60){
//	            break;
//	        }
//	            jse.executeScript("window.scrollBy(0,800)", ""); //y value '800' can be altered
//	            Thread.sleep(3000);
//	}
//		
//	}

}
	}
	
