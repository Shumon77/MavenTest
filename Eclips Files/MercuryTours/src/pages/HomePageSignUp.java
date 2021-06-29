package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import page.HomePage;

public class HomePageSignUp {
	
	WebDriver driver;
	HomePage hp;
	
	@BeforeTest
	public void validateHomePageSignUp() throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
			
	        hp = new HomePage(driver);
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			//driver.manage().window().maximize();
			
			driver.get("http://newtours.demoaut.com/mercuryregister.php");
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(20000);
			
			//driver.quit();
			 
		}
	
	@Test
	public void validateFirstName() {
		
		
		HomePage hp=new HomePage(driver);
		
		hp.getFirstName().sendKeys("John");
		
		hp.getLastName().sendKeys("Bob");
		
		hp.getPhoneNumber().sendKeys("3435545657");
		
		hp.getEmailAddress().sendKeys("John@icloud.com");
		
		hp.getCity().sendKeys("Reston");
		
		hp.getAddress().sendKeys("5767EldenStreet");
		
	}
	
	@Test
	public void validateURL() {
		
		
		String presentURL = driver.getCurrentUrl();
		
		String expectedURL = "http://newtours.demoaut.com/mercuryregister.php";
		
		Assert.assertEquals(expectedURL, presentURL);
		
		
		
	}
	
	@Test
	public void validateTitle() {
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Register: Mercury Tours";
		
		Assert.assertEquals(expectedTitle, actualTitle);
	
	
	}}

