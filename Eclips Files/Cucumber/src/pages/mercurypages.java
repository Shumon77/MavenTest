package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercurypages {
	
	WebDriver driver;
	
	public mercurypages(WebDriver x) {
		
		driver = x;
	}
	
	public WebElement getfirstnameName() {
		
		
		WebElement firstnameName = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		
		return firstnameName;
	}

	public WebElement getlastnameName() {
		
		WebElement lastnameName = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		
		return lastnameName;
	}

	 public WebElement emailphone() {
		
		WebElement emailphone = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		
		return emailphone;


		
		
		
		
	}

}
