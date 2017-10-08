package FindingElement;
/***
 * Always remove * from the Xpath
 * Xpath main Syntax= //tag[@attribute='value']
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String BaseURL = "https://letskodeit.teachable.com/";
		driver.get(BaseURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		

		
//		 Xpath main Syntax= //tag[@attribute='value']
//		Using relative Xpath to find the element (Login button)
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		
//		Relative xpath using single '/' for (login link button)
		driver.findElement(By.xpath("//div[@id='navbar']/div/div/div/ul/li[2]/a")).click();
		
		driver.navigate().back();

//		Relative xpath  using double '//' for (Practice link button)
		driver.findElement(By.xpath("//div[@id='navbar']//ul/li[1]/a")).click();
		
		driver.navigate().back();
		
//		Building Relative Xpath using text of the element (Enroll Up button)
//		Syntax= //tag[@attribute='value']//tag[text()='value'] where Value = Enroll now
		driver.findElement(By.xpath("//div[@class='homepage-hero']//a[text()='Enroll now']")).click();
		
//		Building relative Xpath using "contains" to find the element (Sign Up button)
//		Syntax = //tag[contains(attribute,'value')]
	    driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Sign Up')]")).click();
	    
	    
//		Building relative Xpath using "contains" to find the element (Login button)
//		Syntax = //tag[contains(@attribute,'value')]
		driver.findElement(By.xpath("//div[@id='navbar']//a[contains(@class,'navbar-link') and contains(@href,'sign_in')]")).click();
		
//		Building relative Xpath using "Starts-with" to find the element (Practice button)
//		Syntax = //tag[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("//div[@id='navbar']//a[starts-with(@class,'fedora')]")).click();
		 
//		Using preceding-sibling in xpath to get an element(Login)
		driver.findElement(By.xpath("//a[@href='/sign_up']//parent::li//preceding-sibling::li[1]")).click();
		
//		Using parent in xpath to get an element (Sign Up)
		driver.findElement(By.xpath("//a[@href='/sign_up']//parent::li")).click();
		
		
	driver.quit();
	}

}
