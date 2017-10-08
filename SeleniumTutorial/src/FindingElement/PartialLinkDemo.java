package FindingElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.next.co.uk/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		// Finding Element by Linktext
		driver.findElement(By.linkText("Women")).click();
		Thread.sleep(2000);
		// Finding Element by Partial linktext- Lipsy part of Lipsy & Co
		driver.findElement(By.partialLinkText("Lipsy")).click();
		driver.quit();
	}

}
