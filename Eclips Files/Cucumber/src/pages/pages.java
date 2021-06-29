package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pages {
	
	WebDriver driver;

    public pages(WebDriver x) {
	
	driver = x;
}

public WebElement getfirstName() {
	
	
	WebElement firstName = driver.findElement(By.name("firstname"));
	
	return firstName;
}

public WebElement getlastName() {
	
	WebElement lastName = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
	
	return lastName;
}

 public WebElement emailphonenumber() {
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
	
	return email;


	
	
	
	
}


}
