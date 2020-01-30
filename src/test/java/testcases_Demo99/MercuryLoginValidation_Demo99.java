package testcases_Demo99;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities_Demo99.Drivers_Demo99;
import pages_Demo99.MercuryPage_Demo99;

public class MercuryLoginValidation_Demo99 {
	WebDriver driver;
  @Test
  public void loginvalidations() {
	  driver = Drivers_Demo99.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
	  
	  MercuryPage_Demo99 obj1  = new MercuryPage_Demo99(driver);
	  obj1.entername();
	  obj1.enterpswrd();
	  obj1.submit();
  }
}
