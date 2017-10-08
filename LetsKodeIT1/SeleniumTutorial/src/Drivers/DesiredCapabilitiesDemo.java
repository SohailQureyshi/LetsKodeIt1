package Drivers;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = "http://www.google.co.uk";
		DesiredCapabilities caps =  DesiredCapabilities.firefox();
		caps.setBrowserName("Firefox");
		caps.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.quit();
	}

}
