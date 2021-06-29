package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver x) {
		
		driver = x;
	}
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		
		return firstName;
		
		
		}
	
	public WebElement getLastName() {
		
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		
		return lastName;
	}
	
     public WebElement getEmailAddress() {
		
		WebElement email = driver.findElement(By.name("userName"));
		
		return email;
		
     }
		
	
        public WebElement getPhoneNumber() {
		
		WebElement phone = driver.findElement(By.name("phone"));
		
		return phone;
		

}
        public WebElement getAddress() {
	
	
	WebElement address = driver.findElement(By.name("address1"));
	
	return address;
}
        
        public WebElement getCity() {
        	
        	WebElement city = driver.findElement(By.name("city"));
        	
        	return city;
        
        }
        

}
