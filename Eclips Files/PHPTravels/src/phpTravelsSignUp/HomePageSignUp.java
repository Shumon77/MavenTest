package phpTravelsSignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import phpTravels.HomePages;

public class HomePageSignUp {
	
	WebDriver driver;
	
	
	HomePages hp;
	
	@BeforeTest
	
	public void validateHomePageSignUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
	   //hp = new HomePages(driver);
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/register");
		
		HomePages hp = new HomePages(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		//driver.quit();
		 
		
	}
	
	@Test
	public void validateFirstName() {
		
		HomePages hp = new HomePages(driver);
		
		hp.getFirstName().sendKeys("Bob");
		
		
	}
	@Test
	public void vlidateLastName() {
		
		HomePages hp = new HomePages(driver);
		
		hp.getLastName().sendKeys("John");
		
	}
	
	@Test
	public void validateEmailAddress() {
		
		HomePages hp = new HomePages(driver);
		
		hp.getEmailAddress().sendKeys("fhghghg@jkhjkhj.com");
		
		
		}
	
	@Test
	public void validateMobileNumber() {
		
		HomePages hp = new HomePages(driver);
		
		hp.getMobile().sendKeys("5252524542");
		
		
	}
	
	@Test
	public void validatePassward() {
		
		HomePages hp = new HomePages(driver);
		
		hp.getPassward().sendKeys("fjhfhjggjj");
	}
	
	@Test
	public void validateConfermPassward() {
		
		HomePages hp = new HomePages(driver);
		
		hp.getConfirmPassward().sendKeys("fjhfhjggjj");
		
		
	}
	
	@Test
	public void validateSignUP() {
		
		HomePages hp = new HomePages(driver);
		
		
		
		
	}
	//@Test
	//public void validateSignUp() {
		
		 //WebElement SignUpButton = driver.findElement(By.name("signupbtn btn_full btn btn-success btn-block btn-lg"));
		 
		// boolean SignUppresent = SignUpButton.isDisplayed();
		 
		// driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
	//}
	
	@Test
	public void validateTitle() {
		
		String expectedTitle = "Register";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void validateURL() {
	
		String expectedURL = "https://www.phptravels.net/register";
		String actualtURL = driver.getCurrentUrl();		
		Assert.assertEquals(actualtURL,  expectedURL);		
				
	}
	
	  // @AfterTest
	  //public void AfterTest() {
		   
		   
		   
		   
	   

	
		
	
	
	
	}

   
		
	
