package JunitFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpediaRadioBtnAndCheckboxDemo {
	WebDriver driver;
	String BaseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "https://www.expedia.co.uk/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BaseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		WebElement flightbtn = driver.findElement(By.id("tab-flight-tab-hp"));
		flightbtn.click();
		Thread.sleep(2000);

		WebElement onewayRadiobtn = driver.findElement(By.xpath("//label[@id='flight-type-one-way-label-hp-flight']"));
		onewayRadiobtn.click();

		Thread.sleep(2000);

		WebElement returnRadiobtn = driver.findElement(By.id("flight-type-roundtrip-label-hp-flight"));
		returnRadiobtn.click();

		Thread.sleep(2000);

		WebElement addHotelcheckbox = driver.findElement(By.id("flight-add-hotel-checkbox-hp-flight"));
		addHotelcheckbox.click();

		Thread.sleep(2000);

		WebElement addCarcheckbox = driver.findElement(By.id("flight-add-car-checkbox-hp-flight"));
		addCarcheckbox.click();

		Thread.sleep(2000);

		System.out.println("Is OneWay radio button selected: " + onewayRadiobtn.isSelected());
		System.out.println("Is Return radio button selected: " + returnRadiobtn.isSelected());
		System.out.println("Is AddHotel checkbox selected: " + addHotelcheckbox.isSelected());
		System.out.println("Is AddCar checkbox selected: " + addCarcheckbox.isSelected());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
