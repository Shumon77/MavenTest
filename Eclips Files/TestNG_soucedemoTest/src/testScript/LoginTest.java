package testScript;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.logindisplayed;

public class LoginTest {
	
	WebDriver driver;
	
	logindisplayed ld;
	
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		ld = new logindisplayed(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}
	
	@BeforeMethod
	public void beforeEachTest() {
		
	driver.get("https://www.saucedemo.com/");	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
	
	
	
	@Test
	public void loginTest() throws InterruptedException {
		
		Thread.sleep(1000);
		ld.getFirstName().sendKeys("standard_user");
		
		boolean x = ld.getFirstName().isDisplayed();
		
		Assert.assertTrue(x);
		
		System.out.println(x);
		
		
		Thread.sleep(1000);
		ld.getPassword().sendKeys("secret_sauce");
		
		boolean y = ld.getPassword().isDisplayed();
		
		Assert.assertTrue(y);
		
		System.out.println(y);
		
		Thread.sleep(1000);
		ld.getLoginButton().click();
		
		String expectedresult = "https://www.saucedemo.com/inventory.html";
		
		String actualresult = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedresult, actualresult);
		
		System.out.print(actualresult);
		
	
		
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
		
		
		
	}
	

}
