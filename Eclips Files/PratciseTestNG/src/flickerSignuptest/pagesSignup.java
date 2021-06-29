package flickerSignuptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagesSignup {
	
	WebDriver driver;
	
	public pagesSignup(WebDriver x) {
		
		driver = x;
		
	}
	
	public WebElement getFirstName() {
	
		WebElement firstname = driver.findElement(By.id("sign-up-first-name"));
		
		return firstname;
	}
	
	public WebElement getLastName() {
		
		WebElement lastname = driver.findElement(By.id("sign-up-email"));
		
		return lastname;
	}
	
	
     
    
    
    public WebElement getEmail() {
	
	WebElement email = driver.findElement(By.id("sign-up-email"));
	
	return email;
}
    
    
    public WebElement getPassword() {
	
    WebElement password = driver.findElement(By.id("sign-up-password"));
	
	return password;
}
}
