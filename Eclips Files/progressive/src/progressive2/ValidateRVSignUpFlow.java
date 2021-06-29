package progressive2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import progressive1.HomePage;
import progressive1.Homepages;

public class ValidateRVSignUpFlow {
	
	WebDriver driver;
	
	HomePages hp;
	
	
	@BeforeTest
	public void valedateRVSignUp() throws InterruptedException {
		
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
        hp = new HomePages(driver);
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/home/home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		driver.quit();
		
		}

	@Test
    public void validateRVSignUpFlow() {
		
	
    
	
	
	
	
}
}
