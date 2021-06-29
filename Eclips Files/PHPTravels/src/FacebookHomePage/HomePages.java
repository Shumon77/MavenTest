package FacebookHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePages {
	
	WebDriver driver;
	
	public HomePages(WebDriver x) {
		
		driver = x;
	}
	
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.name("firstname"));
			
			return firstName;
		}
	
       public WebElement getLastName() {
		
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		
		return lastName;
	}
       
       
       public WebElement getEmailAddress() {
   		
   		WebElement email = driver.findElement(By.name("reg_email__"));
   		
   		return email;
   		
        
    	}
       
       public WebElement getMobile() {
   		
   		WebElement Mobile = driver.findElement(By.name(""));
   		
   		return Mobile;
   		

   }
           public WebElement getPassward() {
    	   
    	   WebElement Passward = driver.findElement(By.name(""));
    	   
    	   return Passward;
    	   
    	   
       }
           
           
              public WebElement getConfirmPassward() {
        	   
        	   WebElement ConfirmPassward = driver.findElement(By.name(""));
        	   
        	   return ConfirmPassward;
        	   
        	   
           }
              
             // public WebElement getSignUp() {
            	  
            	  
            	 //WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button"));
            	  //return SignUp;
              //}
    	
	
	
	}





