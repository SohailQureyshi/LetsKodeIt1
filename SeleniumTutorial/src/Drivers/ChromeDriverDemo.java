package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseURL= "http://www.google.co.uk";
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
        driver.manage().window().maximize();
        driver.quit();
	}

}
