package Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDNameDemo {

	public static void main(String[] args) {

		WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "http://www.google.co.uk";
		driver.get(baseURL);
		driver.manage().window().maximize();
//		Finding Element by ID
		driver.findElement(By.id("gs_htif0")).sendKeys("https://apps.devbrandbank.com/");
//		Finding Element by Name
		driver.findElement(By.name("btnK")).click();
	}

}
