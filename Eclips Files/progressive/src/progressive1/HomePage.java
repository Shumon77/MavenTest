package progressive1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
     public HomePage(WebDriver x) {
		
		
		driver = x;
	}
	

	@BeforeTest
	public void setupTest() {
		

	
	
	
	}
	
	  @Test
    public void validateInsuranceOpsion() {
	
	
	
	WebElement Auto = driver.findElement(By.xpath("//*[@id=\"primary\"]"));
	
	boolean autopresent = Auto.isDisplayed();
	
	String Actualautotest = Auto.getText();{
		
	
	
	
	
	}}}
	
