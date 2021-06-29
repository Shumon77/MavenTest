package parametarization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ValidateURLFlickr {
	
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
	
	@Test
	public void validateTermsURL() {
		
		
	  driver.findElement(By.linkText("Terms")).click();
   	 
   	  String expectedURL = "https://www.flickr.com/help/terms";
   	 
   	  String actualURL = driver.getCurrentUrl();
   	 
   	  Assert.assertEquals(expectedURL, actualURL);
		
		
		
		
		
	}
	
	@AfterTest
	public void aftertest() {
		
		
		
		
	}

}
