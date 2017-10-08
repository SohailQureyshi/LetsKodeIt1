package FindingElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByClassDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "https://demostore.x-cart.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//	    Finding Element by Class name ++Be careful of multiple classes
		driver.findElement(By.className("title")).click();
		
//		This is not widely used 
//		Finding Element by tag name
//		driver.findElement(By.tagName("a")).click();
	}

}
