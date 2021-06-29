package signuptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testscript {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://login.yahoo.com/account/create?specId=yidReg");
		
	}
	
	@Test
	public void maintest() {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Bob");
		
		
	}

}
