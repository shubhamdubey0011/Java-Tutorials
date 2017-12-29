package net.valtech.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileDemo {

	public static void main(String[] args) {

		ProfilesIni init = new ProfilesIni();

		FirefoxProfile profile = init.getProfile("default");
		System.setProperty("webdriver.gecko.driver",
				"src\\main\\resources\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(profile);

		driver.get("http://learn-automation.com/");
		driver.quit();
	}
}
