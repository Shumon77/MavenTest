package signuptestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import signuppages.Signuppage;

public class Signuptest {
	
	
	
	WebDriver driver;
	
	Signuppage SP;
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		SP = new Signuppage(driver);
		
		driver.navigate().to("https://login.yahoo.com/account/create?specId=yidReg");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void validateSignupe() {
		
		driver.findElement(By.id("usernamereg-password")).sendKeys("Sgg5757");
		//System.out.println("Test");
		
		
		SP.getfirstName().sendKeys("John");
		
		SP.getLastName().sendKeys("Henry");
		
		
		
	} 
	
	@Test
	public void valedateURL() {
		
		
	String	expectedUrl = "https://login.yahoo.com/account/create?specId=yidReg";
		
	String	actualactual = driver.getCurrentUrl();
	
	Assert.assertEquals(actualactual, expectedUrl);
	
	System.out.println("actual");
		
		
	}
	
	
	
	
	
	@AfterTest
	public void aftertest() {
		
		
	}
	
	
		
		
		
		
		
	
	

}
