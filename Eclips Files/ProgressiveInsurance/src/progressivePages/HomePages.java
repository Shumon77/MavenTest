package progressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePages {
	
WebDriver driver;
	
	public HomePages(WebDriver x) {
		
		
		driver=x;
	}
	
	
        public WebElement getAutoOption() {
		
		WebElement Auto = driver.findElement(By.xpath("//*[@id=\\\"primary\\\"]/div/ul[1]/li[2]"));
		
		return Auto;
		
		
		
	}
	
        public WebElement getHomeOption() {
		
		WebElement Home = driver.findElement(By.xpath("//*[@id=\\\"primary\\\"]/div/ul[1]/li[3]/div/ul[1]/li[1]"));
		
		return Home; }
        
        
        public WebElement getRVOption() {
        	
        	
        	
        	WebElement RV = driver.findElement(By.xpath("//*[@id=\"zipCode_ueno\"]"));
		
             return RV;
             
        }
        
          public WebElement getZipcodeOption() {
        	
        	
        	
        	WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"zipCode_ueno\"]"));
		
             return Zipcode;
}}