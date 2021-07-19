package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	
	
	WebDriver driver;
	
	
	public homepage(WebDriver x) {
		
		//this.driver = driver;
		
		driver = x;
		
		}
	
	public WebElement getzipCodeBox() {
		
		WebElement x = driver.findElement(By.id("zip"));
		
		return x;
		
		}
	
	public WebElement getReviewYourQuote() {
		
		
		WebElement x = driver.findElement(By.id("submit"));
		
		return x;
		
		
		
	}

}
