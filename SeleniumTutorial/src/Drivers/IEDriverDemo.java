package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseURL= "http://www.google.co.uk";
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(baseURL);
        driver.manage().window().maximize();
        driver.quit();
	}

	}


