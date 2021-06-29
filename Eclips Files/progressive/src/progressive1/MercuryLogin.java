package progressive1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MercuryLogin {

	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void setupTest(String browser) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		
		
		driver = new ChromeDriver();
		
		
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		

}
	
   @Parameters({"username","password"})
   @Test
   public void login(String username, String password) {
	   
	WebElement username1 = driver.findElement(By.name("userName")); 
	WebElement passward = driver.findElement(By.name("password")); 
	// Hard coding our data
	// before username.sendKeys("Bob");
	 passward.sendKeys("fsgfdhfg");
	username1.sendKeys(username);
	passward.sendKeys(password); 
	
	String actualTitle = driver.getTitle();
	//Assert.assertEquals(actualTitle, expecteddata);
	
	
   }

   @AfterTest
	public void afterTest() {
		
		
		//driver.quit();
		
		
	  
	  
  }}

    
