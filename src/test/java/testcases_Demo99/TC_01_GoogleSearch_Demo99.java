/**
 * 
 */
package testcases_Demo99;

import org.openqa.selenium.WebDriver;
import utilities_Demo99.Drivers_Demo99;
import pages_Demo99.LandingPage_Demo99;

/**
 * @author srinivas.godari
 *
 */
public class TC_01_GoogleSearch_Demo99 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		search_validation();
	}
	public static void search_validation() throws InterruptedException
	{
		driver = Drivers_Demo99.getDriver("chrome");
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		LandingPage_Demo99.SearchBox(driver).sendKeys("Accenture");
		Thread.sleep(5000);
		LandingPage_Demo99.SearchBox_Button(driver).click();
		
		
	}

}
