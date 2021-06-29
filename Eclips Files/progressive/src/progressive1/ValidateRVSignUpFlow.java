package progressive1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateRVSignUpFlow {
	
	WebDriver driver;
	
	HomePage hp;
	
	
	@BeforeTest
	public void valedateRVSignUp() throws InterruptedException {
		
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		hp = new HomePage(driver);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/home/home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		driver.quit();
		
		}

		
		//public WebElement getRVOption() {
			
			
			
	
	
	
	
}

