package net.valtech.xpathTraversing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forward_Backward_XpathTraversing {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/shubham.dubey/Desktop/html_codes/Test1.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// forward traversing....(from table node to testing node)
		String text = driver.findElement(
				By.xpath("//table[@id='t1']/tbody/tr[3]/td[2]")).getText();
		System.out.println("from table node to testing node"+text);

		// forward traversing....(from table node to 3(S.No) node)
		String text1 = driver.findElement(
				By.xpath("//table[@id='t1']/tbody/tr[4]/td[1]")).getText();
		System.out.println("from table node to 3(S.No) node"+text1);

		// backward traversing...from big-data node to table node 
		String text2 = driver.findElement(
				By.xpath("//td[contains(text(),'Big data')]/../../.."))
				.getText();
		System.out.println("from big-data node to table node"+text2);

		// backward traversing...from big-data node to body node
		String text3 = driver.findElement(
				By.xpath("//td[contains(text(),'18L PA')]/../../../.."))
				.getText();
		System.out.println("from big-data node to body node"+text3);
		
		driver.quit();

	}
}
