package FindingElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSWildcardsDemo {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	driver = new FirefoxDriver();
	String BaseUrl = "https://letskodeit.teachable.com/p/practice";
	driver.get(BaseUrl);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    
//     Element used is "Enter Your Name" textbox
//    Syntax "^" represent the starting text in the value
//    tag[attribute*='value'] where Tag = input Attribute = placeholder Value = Enter
     driver.findElement(By.cssSelector("input[placeholder^='Enter']")).sendKeys("Abi Balogun");
     
//   Element used is "Hide/Show Example" textbox
//  Syntax "$" represent the ending text in the value
//  tag[attribute*='value'] where Tag = input Attribute = name Value = hide
     driver.findElement(By.cssSelector("input[name$='hide']")).sendKeys("Testing");
     
//   Element used is "Hide/Show Example" textbox
//  Syntax "*" represent the text contained in  in the value
//  tag[attribute*='value'] where Tag = input Attribute = class Value = displayed
     driver.findElement(By.cssSelector("input[class*='displayed']")).clear();
     
//		Element used is "Open Tab" button
//     Finding Children
//     fieldset>Id where id= opentab use # for id
     driver.findElement(By.cssSelector("fieldset>#opentab")).click();
	}

}
