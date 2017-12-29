package net.valtech.test.pom;

import java.util.concurrent.TimeUnit;

import net.valtech.pagefactory.Guru99HomePage;
import net.valtech.pagefactory.Guru99Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test99GuruLoginWithPageFactory {

    WebDriver driver;

    Guru99Login objLogin;

    Guru99HomePage objHomePage;

    

    @BeforeTest

    public void setup(){


    	// Create a new instance of the Firefox driver

    			System.setProperty("webdriver.gecko.driver",
    					"src\\main\\resources\\drivers\\geckodriver.exe");
    			driver = new FirefoxDriver();
    			// Put a Implicit wait, this means that any search for elements on the
    			// page could take the time the implicit wait is set for before throwing
    			// exception

    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");

    }

    /**

     * This test go to http://demo.guru99.com/V4/

     * Verify login page title as guru99 bank

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

    objLogin = new Guru99Login(driver);

    //Verify login page title

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application

    objLogin.loginToGuru99("mngr92011", "nyzatan");

    // go the next page

    objHomePage = new Guru99HomePage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr92011"));

    }

    

}