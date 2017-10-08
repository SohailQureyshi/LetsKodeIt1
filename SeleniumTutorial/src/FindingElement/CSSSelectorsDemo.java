package FindingElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorsDemo {

	
	public static void main(String[] args) {

		WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);
		driver.manage().window().maximize();
			
//		Element used is "Hide/Show Example" textbox
//		CSS selector cheat sheet Syntax = tag[attribute='value']   where Tag-input Attribute - id  and Value -displayed-text
		driver.findElement(By.cssSelector("input[id='displayed-text']")).sendKeys("Test");
		
//		Element used is "Enter Your Name" textbox
//		CSS selector  cheat sheet Syntax = #id where id = name
		driver.findElement(By.cssSelector("#name")).sendKeys("Abi Balogun");
		
//		Element used is "Hide/Show Example" textbox
//		CSS selector  cheat sheet Syntax = tag#id where Tag = input  id = displayed-text"
		driver.findElement(By.cssSelector("input#displayed-text")).clear();
		
		
//		Element used is "Hide/Show Example" textbox
//		CSS selector cheat sheet Syntax = tag[attribute='value'] where Tag = input attribute = class Value =inputs displayed-class
		driver.findElement(By.cssSelector("input[class='inputs displayed-class']")).sendKeys("Test");
		
//		Element used is "Hide/Show Example" textbox
//		CSS selector  cheat sheet Syntax - tag.class where Tag = input  class = displayed-class
		driver.findElement(By.cssSelector("input.displayed-class")).sendKeys("ing");
		
		
//		Element used is "Hide/Show Example" textbox
//		CSS selector  cheat sheet Syntax = .class where class = displayed-class
		driver.findElement(By.cssSelector(".displayed-class")).clear();
		
//		Element used is "Open Tab" button
//		Syntax= .class1.class2.class3>>>Until we find the unique element
		driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
}
}