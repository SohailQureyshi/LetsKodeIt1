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

public class ExpediaListofElements {
	WebDriver driver;
	String BaseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://www.expedia.co.uk/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);
	}

	
	@Test
	public void testListOfElemnts() throws InterruptedException {
		
		WebElement flightbtn = driver.findElement(By.id("tab-flight-tab-hp"));
		flightbtn.click();
		Thread.sleep(2000);
		
		boolean isChecked =false;
		List<WebElement> checkbox = driver.findElements(
		By.xpath("//input[contains(@type,'checkbox') and contains(@value,'a')and contains(@attributes,'autocomplete:off')]"));
         int size = checkbox.size();
         System.out.println("Size of the list: " + size);
         
         for(int i=0; i<size; i++){
        	 isChecked = checkbox.get(i).isSelected();
        	 
        	 if(!isChecked)
        		 checkbox.get(i).click();
        	 Thread.sleep(2000);
         }
	
	}
	
	
	@After
	public void tearDown() throws Exception {
		 Thread.sleep(2000);
		 driver.quit();
	}

	
		
	}


