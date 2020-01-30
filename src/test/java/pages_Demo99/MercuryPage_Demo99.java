package pages_Demo99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercuryPage_Demo99 {
	WebDriver driver;
	
	By uname = By.name("userName");
	By pswrd = By.name("password");
	By sbmt = By.name("login");
	
	public MercuryPage_Demo99(WebDriver driver)
	{
		this.driver = driver;  // the main task of this constructor is to initialise the web driver
	}
	
	public void entername()
	{
		driver.findElement(uname).sendKeys("demo");
	}
	public void enterpswrd()
	{
		driver.findElement(pswrd).sendKeys("demo");
	}
	public void submit()
	{
	driver.findElement(sbmt).click();	
	}

}
