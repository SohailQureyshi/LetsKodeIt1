package JunitFramework;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatePages {
	WebDriver driver;
	String baseUrL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrL = "http://www.next.co.uk/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrL);
		String title =	driver.getTitle();
		System.out.println("Title of the page is: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentUrl);
		
		
		String UrlToNavigate = "https://www.next.co.uk/secure/account/Login";
		driver.navigate().to(UrlToNavigate);
		
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentUrl);
		
        Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentUrl);
		driver.navigate().refresh();
		System.out.println("Navigate Referesh");
//		Another way to refresh the current page
		driver.get(currentUrl);
		System.out.println("Navigate Referesh");
		Thread.sleep(5000);
		
//		To get Page source
		String pagesource = driver.getPageSource();
		System.out.println("Print pagesource");
		
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}
