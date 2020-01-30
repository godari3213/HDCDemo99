package pages_Demo99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testcases_Demo99.TC_01_GoogleSearch_Demo99;

public class LandingPage_Demo99 {

	public static WebElement SearchBox(WebDriver driver) {
		// Search Input field
		WebElement element = driver.findElement(By.name("q"));
		return element;

	}
	public static WebElement SearchBox_Button(WebDriver driver) {
	
		// Search button
		WebElement element = driver.findElement(By.name("btnK"));
		return element;

	}
	

}
