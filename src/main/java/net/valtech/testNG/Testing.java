package net.valtech.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.Test;

public class Testing {
    
    public static void main(String[] args) {
		
	
    	System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
                                String  URL="http://localhost:8080/login.do;jsessionid=2amo6qart53a5"; 
                                
        
        driver.get(URL);
        
        // RemoteWebDriver does not implement the TakesScreenshot class
        // if the driver does have the Capabilities to take a screenshot
        // then Augmenter will add the TakesScreenshot methods to the instance
      String  url=driver.getCurrentUrl();
      System.out.println(url);
      String tile = driver.getTitle();       
      //username
      driver.findElement(By.id("username")).sendKeys("admin");
      driver.findElement(By.name("pwd")).sendKeys("manager");
      driver.findElement(By.linkText("Login")).click();
      
      System.out.println("user is logged in ");
      
      
      
    }
}
