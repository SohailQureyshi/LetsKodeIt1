package JunitFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElementDemo {
	 WebDriver driver;
	 private JavascriptExecutor js;
	 String BaseUrl1;
	 String BaseUrl2;
	

	@Before
	public void setup() throws Exception {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		BaseUrl1 = "https://letskodeit.teachable.com/p/practice/";
		BaseUrl2 = "https://www.expedia.co.uk/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void testLetsKodeIt() throws InterruptedException {
		driver.get(BaseUrl1);
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		System.out.println("Is Text Box displayed: " + textbox.isDisplayed());
		Thread.sleep(2000);
		
		
		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		HideButton.click();
		System.out.println("Hide button is clicked");
		System.out.println("Is Text Box displayed: " + textbox.isDisplayed());
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, -190);");
		WebElement ShowButton = driver.findElement(By.id("show-textbox"));
		ShowButton.click();
		System.out.println("Show button is clicked");
		System.out.println("Is Text Box displayed: " + textbox.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	@Test
	public void testExpedia() {
     	driver.get(BaseUrl2);
//     	The Element was hidden in the DOM hence when it failed
		WebElement ChildDropdown = driver.findElement(By.id("'package-1-age-select-1-hp-package"));
		System.out.println("Is child dropdown displayed: " + ChildDropdown.isDisplayed());
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}
