package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {

	WebDriver driver;

	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found by id: " + locator);
			return this.driver.findElement(By.id(locator));
		}

		else if (type.equals("xpath")) {
			System.out.println("Element found by xpath: " + locator);
			return this.driver.findElement(By.xpath(locator));
		}

		else if (type.equals("css")) {
			System.out.println("Element found by css: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		}

		else if (type.equals("linktext")) {
			System.out.println("Element found by linktext: " + locator);
			return this.driver.findElement(By.linkText(locator));
		}

		else if (type.equals("partiallinktext")) {
			System.out.println("Element found by partialLinktext: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("Locator type not supported");
			return null;
		}
	}

	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found by id: " + locator);
			return this.driver.findElements(By.id(locator));
		}

		else if (type.equals("xpath")) {
			System.out.println("Element found by xpath: " + locator);
			return this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("Element found by cssSelector: " + locator);
			return this.driver.findElements(By.cssSelector(locator));
		}

		else if (type.equals("linktext")) {
			System.out.println("Element found by linktext: " + locator);
			return this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("Element found by partiallinktext: " + locator);
			return this.driver.findElements(By.partialLinkText(locator));
		} else
			System.out.println("Locator type not found");
		return null;
	}

public boolean IsElementPresent(String locator, String type){
	List<WebElement> ElementList = getElementList(locator, type);
	
	int size = ElementList.size();
	
	if(size>0){
		return true;
	}
	else {
		return false;
	}
}
}
