package JunitFramework;

import java.util.List;
/***
 * Dropdown is identified by "select" tag
 * 
 */
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	WebDriver driver;
	String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://letskodeit.teachable.com/p/practice/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);
	}

	@Test
	public void test() throws InterruptedException {

		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		sel.selectByIndex(1);
		System.out.println("Select BMW by index");
		Thread.sleep(2000);

		sel.selectByValue("benz");
		System.out.println("Select Benz by value");
		Thread.sleep(2000);

		sel.selectByVisibleText("Honda");
		System.out.println("Select Honda by visible text");
		Thread.sleep(2000);

		List<WebElement> options = sel.getOptions();

		int size = options.size();

		for (int i = 0; i < size; i++) {
			String OptionsName = options.get(i).getText();
			System.out.println("List of options: " + OptionsName);
		}

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
