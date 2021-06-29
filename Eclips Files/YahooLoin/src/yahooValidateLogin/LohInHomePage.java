package yahooValidateLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LohInHomePage {
	
	
	WebDriver driver;
	
	public LohInHomePage(WebDriver x) {
		
		driver = x;
	}
	
	
	public WebElement getFirstName() {
		
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		
		return firstname;
	}
	
     public WebElement getLasttName() {
		
		
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]"));
		
		return lastname;
	}
	
     public WebElement getEmailAddress() {
 		
 		
 		WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
 		
 		return emailaddress;
 	}
     
     public WebElement getPassward() {
 		
 		
 		WebElement Passward = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
 		
 		return Passward;
 	}
	
     public WebElement getMobileNumber() {
 		
 		
 		WebElement MobileNumber = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
 		
 		return MobileNumber;
 	}
     
     public WebElement getDropdownMonth() {
  		
  		
  		WebElement month = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
  		
  		return month;
  	}
     
     public WebElement getDropdownDate() {
    	 
    	 WebElement date = driver.findElement(By.id("id=\"usernamereg-day\""));
    	 
    	 return date;
     }
     
      public WebElement getDropdownYear() {
    	  
    	  
    	  WebElement year = driver.findElement(By.xpath("//*[@id=\\\"usernamereg-year\\\"]"));
    	  
    	  return year;
    	 
    	 
    	 }
      
      public WebElement getYahooOption() {
    	  
    	  WebElement Yahoo = driver.findElement(By.xpath("//*[@id=\"Stencil\"]/body/div[2]/div[1]/span[1]/a/img[1]"));
    	  
    	  return Yahoo;
      }
 	

}
