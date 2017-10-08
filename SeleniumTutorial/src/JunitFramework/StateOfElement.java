package JunitFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StateOfElement {
	WebDriver driver;
	String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://www.google.co.uk/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);
	}

	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		
//		To check if the element is enabled
		System.out.println("Is e1 enabled?: " + e1.isEnabled());

		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("Is e2 enabled?: " + e2.isEnabled());

		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("Is e3 enabled?: " + e3.isEnabled());
		e3.sendKeys("next.co.uk");

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
