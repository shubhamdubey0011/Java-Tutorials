package net.valtech.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {

	protected WebDriver driver;

	@Test
	public void guru99tutorials() {
		
		

		System.setProperty(
				"webdriver.chrome.driver",
				"F:/Java_LAB_Workspace/JavaTutorials/src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/guru99home/");

		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		aTitle = driver.getTitle();
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		WebElement guru99seleniumlink;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		guru99seleniumlink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		guru99seleniumlink.click();
	}

}
