package valedateCompare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script {
	
	WebDriver driver;
	
	PagesHomePage ph;
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		ph = new PagesHomePage(driver);
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test(priority=1)
	public void test() {
		
		ph.getFirstName().sendKeys("John");
		
		ph.getLarstName().sendKeys("Henry");
		
		
		boolean x = ph.getFirstName().isDisplayed();
		
		Assert.assertTrue(x);
		
		
		boolean y = ph.getLarstName().isDisplayed();
		
		Assert.assertTrue(y);
		
			
		
	}
	
	
	@Test(priority=2)
	public void testlinkTerms() {
		
		
		WebElement linkterms = driver.findElement(By.linkText("Terms"));
		linkterms.click();
		
		String expectedURL = "https://www.flickr.com/help/terms";
		
		
		String actualURL = driver.getCurrentUrl();
		
		
		Assert.assertEquals(actualURL, expectedURL);
		
		
		
		
		
		
		
		
	}
	
	@AfterTest
	public void aftertest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//driver.quit();
		
		Thread.sleep(2000);
		
	}

}
