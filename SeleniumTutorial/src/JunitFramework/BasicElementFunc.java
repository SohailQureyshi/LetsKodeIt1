package JunitFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicElementFunc {
	WebDriver driver;
	String baseUrL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrL = "https://secure.devbrandbank.com/login";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrL);

		driver.findElement(By.id("txtEmail")).sendKeys("abi.balogun@brandbank.com");
		driver.findElement(By.id("txtPassword")).sendKeys("Mamaze851!");
		driver.findElement(By.xpath("//input[@id='manageAccount']")).click();
		driver.findElement(By.xpath("//a[@href='/logoff.aspx']")).click();
		Thread.sleep(5000);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
