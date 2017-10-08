package JunitFramework;
/***
 * Radio button is identified by Type = "Radio" in the element
 * Check boxes is identified by Type = "Checkbox" in the element
 */

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://letskodeit.teachable.com/p/practice/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);

	}

	@Test
	public void test() throws InterruptedException {
		WebElement bmwRadiobtn = driver.findElement(By.id("bmwradio"));
		bmwRadiobtn.click();

//		To check if the radio button was clicked
		System.out.println("Is Bmw Radio Button Selected? " + bmwRadiobtn.isSelected());
		Thread.sleep(2000);

		WebElement benzRadiobtn = driver.findElement(By.id("benzradio"));
		benzRadiobtn.click();

		System.out.println("Is Benz Radio Button Selected? " + benzRadiobtn.isSelected());
		Thread.sleep(2000);

		WebElement bmwCheckbox = driver.findElement(By.id("bmwcheck"));
		bmwCheckbox.click();
		
//	To check if the check box was clicked
		System.out.println("Is Bmw CheckBox Selected? " + bmwCheckbox.isSelected());
		Thread.sleep(2000);

		WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
		benzCheckbox.click();

		System.out.println("Is Benz CheckBox Selected? " + benzCheckbox.isSelected());
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}

}
