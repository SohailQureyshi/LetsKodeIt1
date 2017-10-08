package JunitFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaDropdownDemo {
	WebDriver driver;
	String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://www.expedia.co.uk/";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);
		WebElement flightbtn = driver.findElement(By.id("tab-flight-tab-hp"));
		flightbtn.click();
		System.out.println("Flight button clicked");
		Thread.sleep(2000);
	}

	@Test
    public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.id("flight-adults-hp-flight"));
		Select sel = new Select(element);

		sel.selectByValue("1");
		System.out.println("Select 1 by value");
		Thread.sleep(2000);

		sel.selectByVisibleText("2");
		System.out.println("Select 2 by visible text");
		Thread.sleep(2000);

		 sel.selectByIndex(3);
		 System.out.println("Select 4 by index");
		 Thread.sleep(2000);

		 List<WebElement> options = sel.getOptions();
		 int size = options.size();
		
		 for(int i=0; i<size; i++){
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
