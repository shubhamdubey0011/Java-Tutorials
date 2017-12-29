package net.valtech.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Asserts {

	private static WebDriver driver;

  @Test

  public void f() {

	  System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
	  
	  driver = new FirefoxDriver();

      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://www.store.demoqa.com");

      // Here driver will try to find out My Account link on the application

      WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));

      //Test will only continue, if the below statement is true

      //This is to check whether the link is displayed or not

      Assert.assertTrue(myAccount.isDisplayed());

      //My Account will be clicked only if the above condition is true

      myAccount.click();

  }
  
  
  
  @Test

  public void test() {

	  String sValue = "Lakshay Sharma";

	  System.out.println(" What is your full name");

	  Assert.assertEquals("Lakshay Sharma", sValue);

	  System.out.println(sValue);

  }

}