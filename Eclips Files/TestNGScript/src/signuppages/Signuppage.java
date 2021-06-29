package signuppages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signuppage {
	
	
	
	WebDriver driver;
	
	public Signuppage(WebDriver x) {
		
		
		
		driver = x;
		
		
	}
	
	public WebElement getfirstName() {
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		return firstname;
	}
	
	public WebElement getLastName() {
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		
		return lastname;
		
		
	}
	

}
