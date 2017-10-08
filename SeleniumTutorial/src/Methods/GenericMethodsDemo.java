package Methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import Methods.GenericMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsDemo {
	
	private WebDriver driver;
	private String BaseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://letskodeit.teachable.com/p/practice";
		gm = new GenericMethods(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	}
	@Test
	public void test() {
		driver.get(BaseUrl);
		List<WebElement> ElementList = gm.getElementList("//input[@type='text']", "xpath");
		int size = ElementList.size();
		System.out.println("Size of the Element: " + size);
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
