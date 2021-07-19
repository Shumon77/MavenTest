package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesGaico {
	
	
	WebDriver driver;
	
	
	public SalesGaico(WebDriver driver2) {
		
		
		driver = driver2;
		
		}
	
	
	public WebElement getdateOfBirth() {
		
		WebElement x = driver.findElement(By.id("Id_GiveDateOfBirth_56562"));
		
		return x;
		
	}

}
