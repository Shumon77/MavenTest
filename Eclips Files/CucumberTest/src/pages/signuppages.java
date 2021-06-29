package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppages {
	
	WebDriver driver;
	
	public signuppages(WebDriver x) {
		
		driver = x;
	}
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.id("sign-up-first-name"));
		
		return firstname;
	}
	
public WebElement getLasttName() {
		
		WebElement lastname = driver.findElement(By.id("sign-up-last-name"));
		
		return lastname;
	}

public WebElement getInvalidFirstName() {
	
	WebElement invalidfirstname = driver.findElement(By.id("sign-up-first-name"));
	
	return invalidfirstname;
}

public WebElement getInvalidLastName() {
	
	WebElement invalidlastname = driver.findElement(By.id("sign-up-last-name"));
	
	return invalidlastname;
}



}
