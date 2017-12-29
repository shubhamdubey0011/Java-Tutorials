package net.valtech.xpathTraversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dependent_TndependentXpath 
{

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");
	   
	   
	   WebDriver driver = new FirefoxDriver();
	   //driver.get("file:///C:/Users/shubham.dubey/Desktop/html_codes/Test2.html");
	   
	   
	   //String text = driver.findElement(By.xpath("//td[contains(text(),'Big data')]/../td[3]")).getText();
	  //System.out.println(" Dependent or duplicate element is " +text);
	  driver.get("http://www.seleniumhq.org/download/");
	  
	  WebElement downloadjava = driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a"));
	  
	//td[text()='Java']/..//a[text()='Download']
	  downloadjava.click();
	
	  
	  driver.close();
	 
	   
	}
}
