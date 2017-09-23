package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxdriverDemo {

	public static void main(String[] args) {

		WebDriver driver;
//	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		String baseURL = "http://www.google.co.uk";
		driver.get(baseURL);
	}
}
