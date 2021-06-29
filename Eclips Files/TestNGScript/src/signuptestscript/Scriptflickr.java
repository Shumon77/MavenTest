package signuptestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Scriptflickr {
	
	WebDriver driver;
	
	Pagesflickr pl;
	
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		pl=new Pagesflickr(driver);
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
		
		
		
		
	}
	
	@Test
	public void maintest() {
		
	    pl.getFirstName().sendKeys("John");
		
	    pl.getLastName().sendKeys("Mac");
	    
	
		
		
		
		//WebElement Signup = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button"));
		
		//Signup.click();
		
		//String x = Signup.getText();
		
		//System.out.println(x);
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		
	}
	
	@Test
	public void validateurl() {
		
        String expectedUrl = "https://identity.flickr.com/sign-up";
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
		
		System.out.println(actualUrl);
		
		
		
		
		
		
	}
	
	@Test
	public void validatetitle() {
		
        String expectedtitle = "Flickr Login";
		
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(expectedtitle, actualtitle);
		
		
		
		
	}
	
	
	


     @Test
     public void signupisdisplayed() {

	
	 boolean x = pl.getFirstName().isDisplayed();
	
	 System.out.println(x);
	
	 Assert.assertTrue(x);
	
	
	
	
	
}
     @Test(priority=1)
     public void validateTermsURL() {
    	 
    	 
    	 driver.findElement(By.linkText("Terms")).click();
    	 
    	 String expectedURL = "https://www.flickr.com/help/terms";
    	 
    	 String actualURL = driver.getCurrentUrl();
    	 
    	 Assert.assertEquals(expectedURL, actualURL);
     }
	
	
	
	
	@AfterTest
	public void aftertest() {
		
		//driver.quit();
		
	}

}
