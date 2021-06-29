package parametarization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignupParameter {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
        driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Parameters({"firstname",})
	@Test
	public void flickrtest(String firstname) throws InterruptedException {
		
		WebElement firstname1 = driver.findElement(By.id("sign-up-first-name"));
		
		Thread.sleep(2000);
		
		firstname1.sendKeys(firstname);
		
		
		
		
	}
	
	
	@AfterTest
	public void aftertest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
