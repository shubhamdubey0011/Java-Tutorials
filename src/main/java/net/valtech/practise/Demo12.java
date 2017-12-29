package net.valtech.practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo12 {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "http://localhost:8080/user/submit_tt.do";
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("//div[@id='ext-comp-1016']/span")).click();
		
		String text = driver.findElement(By.xpath("//div[@id='createTasksPopup']/div/div[1]/table/tbody/tr/td/div[contains(text(),'Create New Tasks')]")).getText();
		
		
		
		System.out.println("are bhai bhai bha "+text);
		
		driver.close();
		
		
		
		
		
		
	}
}
