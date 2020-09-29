package net.valtech.testNG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogs {

	private static WebDriver driver;

	private static Logger Log = Logger.getLogger(ReporterLogs.class.getName());

    @Test

	public static void test() {

		
    	PropertyConfigurator.configure("F:/Java_LAB_Workspace/JavaTutorials/src/main/resources/logs/logging.log");
        
    	System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
    	
    	

        Log.info("New driver instantiated");

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Log.info("Implicit wait applied on the driver for 10 seconds");

        driver.get("http://www.store.demoqa.com");

        Log.info("Web application launched");

        // Our first step is complete, so we produce a main event log here for our reports.

        Reporter.log("Application Lauched successfully | ");

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        Log.info("Click action performed on My Account link");

        driver.findElement(By.id("log")).sendKeys("valtechtest");

        Log.info("Username entered in the Username text box");

        driver.findElement(By.id("pwd")).sendKeys("valtech@1");

        Log.info("Password entered in the Password text box");

        driver.findElement(By.id("login")).click();

        Log.info("Click action performed on Submit button");

        // Here we are done with our Second main event

        Reporter.log("Sign In Successful | " );

        driver.findElement(By.id("account_logout"));

        Log.info("Click action performed on Log out link");

        driver.quit();

        Log.info("Browser closed");

        // This is the third main event

        Reporter.log("User is Logged out and Application is closed | ");

	}

}