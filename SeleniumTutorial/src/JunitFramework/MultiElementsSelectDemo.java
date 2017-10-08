package JunitFramework;
import java.util.List;
import java.util.concurrent.TimeUnit;

/***
 * multiple Select Element can be identified in the element
 * 
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiElementsSelectDemo {
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
	public void tesMultipleSelect() throws InterruptedException {
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		sel.selectByValue("apple");
		System.out.println("Apple is selected");
		Thread.sleep(2000);
		
		sel.deselectByIndex(0);
		System.out.println("Apple is de-selected");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Orange");
		System.out.println("Orange is selected");
		Thread.sleep(2000);
		
		sel.selectByIndex(2);
		System.out.println("Peach is selected");
		Thread.sleep(2000);
		
		System.out.println("Print all selected options");
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		
		}
		
		Thread.sleep(2000);
		sel.deselectAll();
		System.out.println("De-select all selected options");
	}
	
	
	

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}
