package progressive1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepages {
	
	
	
	WebDriver driver;
	
	public Homepages(WebDriver x) {
		
		
		driver=x;
	}
	
	
	public WebElement getAutoOption() {
		
		WebElement Auto = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/ul[1]/li[2]"));
		
		return Auto;
		
		
		 
	}
	
     public WebElement getHomeOption() {
		
		WebElement Home = driver.findElement(By.xpath("//*[@id=\\\"primary\\\"]/div/ul[1]/li[3]/div/ul[1]/li[1]"));
		
		return Home;
		
    }


    public WebElement getRVOption() {
	
	WebElement RV = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/ul[1]/li[6]"));
	
	return RV; 
	

}}
