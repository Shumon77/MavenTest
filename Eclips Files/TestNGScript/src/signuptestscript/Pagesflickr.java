package signuptestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pagesflickr {
	
	WebDriver driver;
	
	public Pagesflickr(WebDriver x) {
		
		driver = x;
		
		
		
	}
	
	
	
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.id("sign-up-first-name"));
		
		
		return firstName;
	}
	
       public WebElement getLastName() {
		
		WebElement lastName = driver.findElement(By.id("sign-up-last-name"));
		
		
		return lastName;
	}
	
	
	
	
	
	
	
	
	
	
	

}
