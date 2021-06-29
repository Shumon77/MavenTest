package seleniumProjectHomework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInMain {

	public static void main(String[] args) {
		
		
		// Setting up and opening up Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to URL
		
		    driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		 
		    driver.findElement(By.name("firstName")).sendKeys("bob");
			
			driver.findElement(By.name("lastName")).sendKeys("John");
			
			driver.findElement(By.name("Email address")).sendKeys("jon_@yahoo.com");
			
			driver.findElement(By.name("usernamereg-month")).sendKeys("08");
			
			driver.findElement(By.linkText("Create a Page")).click();
			
			//driver.quit();

	}

}
