package valedateCompare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesHomePage {
	
	WebDriver driver;
	
	public PagesHomePage(WebDriver x) {
		
		driver = x;
		
		
	}
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.id("sign-up-first-name"));
		
		return firstname;
	}
	
      public WebElement getLarstName() {
		
		WebElement lastname = driver.findElement(By.id("sign-up-last-name"));
		
		return lastname;
	}

}
