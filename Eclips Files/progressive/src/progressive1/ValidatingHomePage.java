package progressive1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatingHomePage {
	
	
	WebDriver driver;
	
	HomePage hp;
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
        hp = new HomePage(driver);
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/home/home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		driver.quit();
		
	
	}
		
		
		
		@Test
		public void validateURL() {
			
			
			
			String actualURL = driver.getCurrentUrl();
			
			String expectedURL ="https://www.progressive.com/";
			
			Assert.assertEquals(actualURL, expectedURL);}
			
			
			
			@Test
			public void validateTitle() {
				
				
				
				String actualTitle = driver.getTitle();
				
				String expectedTitle ="https://www.progressive.com/";
				System.out.println(expectedTitle);
				Assert.assertEquals(actualTitle, expectedTitle); }
			
			
			
			//@AfterTest
			//public//void //ValidateHomePage();
			
			//driver.quit();
			
			
		
		

}
