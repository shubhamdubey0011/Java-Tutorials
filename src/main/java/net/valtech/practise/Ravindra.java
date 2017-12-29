package net.valtech.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ravindra 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.gecko.driver",
			"src\\main\\resources\\drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
                            String  URL="https://www.facebook.com/"; 
                            driver.get(URL);
                            driver.findElement(By.xpath("//a[contains(text(),'Data Policy')]")).click();
                            System.out.println("clicked on Data policies");
                            
	
}
}
