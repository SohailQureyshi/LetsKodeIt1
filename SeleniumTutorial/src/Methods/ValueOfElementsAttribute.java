package Methods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValueOfElementsAttribute {
	private WebDriver driver;
	private String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://letskodeit.teachable.com/p/practice/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);
	}

	@Test
	public void test() {
		WebElement element = driver.findElement(By.id("name"));
		String ElementAttribute1 = element.getAttribute("class");
		System.out.println("Value of Class attribute: " + ElementAttribute1);
		
		String ElementAttribute2 = element.getAttribute("name");
		System.out.println("Value of Name attribute: " + ElementAttribute2);
		
		String ElementAttribute3 = element.getAttribute("placeholder");
		System.out.println("Value of Placeholder attribute: " + ElementAttribute3);
		
		String ElementAttribute4 = element.getAttribute("type");
		System.out.println("Value of Type attribute: " + ElementAttribute4);
		
	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
