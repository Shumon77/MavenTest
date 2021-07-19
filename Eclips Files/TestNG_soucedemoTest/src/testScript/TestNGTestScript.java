package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.logInpage;

public class TestNGTestScript {
	
	
	WebDriver driver;
	
	logInpage lp;
	
	
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		lp = new logInpage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
	}
	
	
	@BeforeMethod
	public void beforeEachTest() {
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}
	
	
	
	
	
	
	@Test(priority=1)
	public void positiveloginTest() throws InterruptedException {
		
		
		Thread.sleep(1000);
		lp.getUserName().sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		lp.getPassword().sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		lp.getLogInButton().click();
		
		
		String expectedResult = "https://www.saucedemo.com/inventory.html";
		
		String actualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedResult, actualResult);
		Thread.sleep(1000);	
	     
		
		
	}
	
	
	@Test(priority=2)
	public void negativeloginTest() throws InterruptedException {
		
		
		Thread.sleep(1000);
		lp.getUserName().sendKeys("locked_out_user");
		
		
		
		Thread.sleep(1000);
		
		lp.getPassword().sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		
		lp.getLogInButton().click();
		
		
		String expectedResult = "https://www.saucedemo.com/";
		
		String actualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedResult, actualResult);
			
		
		
		
		
		
		
		
		
	}
	

	
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		//driver.navigate().back();
		
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
	}

}


















