package net.valtec.synchcronization;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class FluentWait
{
	
	
	private static WebDriver driver;
    WebElement countdown;

    @BeforeClass
    public static void setup(){
        driver = new FirefoxDriver();
        //driver.get("http://stuntsnippets.com/javascript-countdown/");
        driver.get("http://seleniumsimplified.com/testpages/javascript_countdown.html");
    }


    @Before
    public void setupTest(){

        driver.navigate().refresh();

        countdown = driver.findElement(By.id("javascript_countdown_time"));

        new WebDriverWait(driver,10).
                until(ExpectedConditions.visibilityOf(countdown));
    }

    @Test
    public void waitForWebElementFluently(){

    	Wait wait = new FluentWait(driver)
    		    .withTimeout(30, SECONDS)
    		    .pollingEvery(5, SECONDS)
    		    .ignoring(NoSuchElementException.class);
    		 
    		WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
    		{
    		  public WebElement apply(WebDriver driver) {
    		  return driver.findElement(By.id("foo"));
    		}
    		});
    }

    @Test
    public void waitForWebElementFluentlyPredicate(){

        new FluentWait().
                withTimeout(10, TimeUnit.SECONDS).
                pollingEvery(100,TimeUnit.MILLISECONDS).
                until(new Predicate<WebElement>() {
                    @Override
                    public boolean apply(WebElement element) {
                        return element.getText().endsWith("04");
                    }
                }
                );
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
	
	
}
