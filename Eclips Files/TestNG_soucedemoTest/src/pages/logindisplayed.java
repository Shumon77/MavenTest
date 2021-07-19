package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logindisplayed {
	
	
	WebDriver driver;
	
	
	
	public logindisplayed(WebDriver driver) {
		
		
		this.driver=driver;
		
		}
	
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.id("user-name"));
		
		return firstname;
	}
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.id("password"));
		
		
		return password;
		
		
	}
	
	
	public WebElement getLoginButton() {
		
		
		WebElement login = driver.findElement(By.id("login-button"));
		
		return login;
	}

}


















