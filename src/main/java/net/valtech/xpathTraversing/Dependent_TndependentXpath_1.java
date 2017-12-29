package net.valtech.xpathTraversing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dependent_TndependentXpath_1 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");
	   
	   
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://www.flipkart.com/offers-list/onlyonflipkart?screen=dynamic&pk=themeViews%3DOnlyonFlipkart%3ADesktopView~widgetType%3DdealCard~contentType%3Dneo&wid=9.dealCard.OMU&otracker=clp_omu_%23OnlyonFlipkart_mobile-phones-store_8");
	 ///div[contains(text(),'Panasonic P77')]/..
	 //div[contains(text(),'Panasonic P77')]/../div[contains(text(),'Now ₹')]
	   driver.findElement(By.xpath("//div[contains(text(),'Panasonic P77')]/../div[contains(text(),'Now ₹')]")).click();

	   driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	   
	   //driver.close();
}
}
