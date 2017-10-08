package FindingElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathSiblings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String BaseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(BaseURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		Using xpath to find the price of python programing language using following siblings
		driver.findElement(By.xpath("//table[@id='product']//td[text()='Python Programming Language']//following-sibling::td")).getText();
	}

}
