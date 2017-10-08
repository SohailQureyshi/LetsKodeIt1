package JunitFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextDemo {
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
	public void testGetText() {
		
		WebElement ButtonElement = driver.findElement(By.id("openwindow"));
		String ElementText = ButtonElement.getText();
		System.out.println("Button text: " + ElementText);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
