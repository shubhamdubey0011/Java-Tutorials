package net.valtech.actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


 class LoginPage 
{

	  public WebDriver driver;
	
	/*@BeforeMethod
	public void beforeMethod() {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Online Store Website

		driver.get("http://localhost:8080/login.do");

	}
    */
	

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(name = "pwd")
	private WebElement password;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement checkbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		userName.sendKeys("admin");
		password.sendKeys("manager");
		checkbox.click();
		loginBtn.click();
		String actual = driver.findElement(By.id("logoutLink")).getText();
		Assert.assertEquals(actual, "Logout");

	}

}
