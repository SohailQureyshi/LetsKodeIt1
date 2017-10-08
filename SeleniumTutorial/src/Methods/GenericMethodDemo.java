package Methods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Methods.GenericMethod;

public class GenericMethodDemo {

	private WebDriver driver;
	private GenericMethod gm;
	private String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://letskodeit.teachable.com/p/practice";
		gm = new GenericMethod(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(BaseUrl);
		WebElement element = gm.getElement("displayed-text", "id");
		element.sendKeys("display");

		WebElement element1 = gm.getElement("//input[@id='name']", "xpath");
		element1.sendKeys("Abi Balogun");
	}

	@After
	public void tearDown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
	}

}
