package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	
	WebDriver driver;
	
	
	public homepage(WebDriver x) {
		
		
		driver = x;
		
		}
	
	public WebElement getUserName() {
		
		WebElement x = driver.findElement(By.id("user-name"));
		
		return x;
	}
	
	
	public WebElement getPassword() {
		
		WebElement x = driver.findElement(By.id("password"));
		
		return x;
		
		
	}
	
	public WebElement getLogin() {
		
		WebElement x = driver.findElement(By.id("login-button"));
		
		return x;
	}

}
