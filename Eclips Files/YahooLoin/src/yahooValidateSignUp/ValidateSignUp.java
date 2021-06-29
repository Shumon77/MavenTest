package yahooValidateSignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import yahooValidateLogin.LohInHomePage;

public class ValidateSignUp {
	
	
	WebDriver driver;
	
	LohInHomePage hp;
	
	@BeforeTest
	
	public void validateSignUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		   hp = new LohInHomePage(driver);
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			//driver.manage().window().maximize();
			
			driver.get(" https://login.yahoo.com/account/create?specId=yidReg");
			
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(20000);
			
			//driver.quit();
			 
			
		}
	
	@Test
	public void validateFirstName() {
		
		LohInHomePage hp= new LohInHomePage(driver);
		
		hp.getFirstName().sendKeys("John");
	}
	
	  @Test
	
	  public void validateLastName() {
		
		LohInHomePage hp= new LohInHomePage(driver);
		
		hp.getLasttName().sendKeys("Rony");
	}
	  
	  @Test
	  public void validateEmailAddress() {
		  
		  LohInHomePage hp= new LohInHomePage(driver);
		  
		  hp.getEmailAddress().sendKeys("dffd_77@yahoo.com");
	  }
	  
	  @Test
	  public void validatePassWard() {
		  
		  LohInHomePage hp= new LohInHomePage(driver);
		  
		  hp.getPassward().sendKeys("Rkbkjjk78");
	  }
	  
	  @Test
	  public void validateMobileNumber() {
		  
		  LohInHomePage hp= new LohInHomePage(driver);
		  
		  hp.getMobileNumber().sendKeys("3646464646");
	  }
	
	@Test
	
	public void validateMonth() {
		
		LohInHomePage hp= new LohInHomePage(driver);
		
		Select ddmonth = new Select(hp.getDropdownMonth());
		
		
		
	}
	
	@Test
	public void validateDate() {
		
		LohInHomePage hp= new LohInHomePage(driver);
		
		Select Date = new Select(hp.getDropdownDate());
		
	}
	
	
    @Test
    public void validateYear() {
    	
    	LohInHomePage hp= new LohInHomePage(driver);
    	
    	Select ddyear = new Select(hp.getDropdownYear());
		
	}
    
    @Test
    public void validateYahoo() {
    	
    	LohInHomePage hp= new LohInHomePage(driver);
    	
    	
    	boolean Yahoopresent = hp.getYahooOption().isDisplayed();
    	
    	String actualYahooText = hp.getYahooOption().getText();
    	
    	String expectedText = "Yahoo";
    	String actualTitle = driver.getTitle();
    	
    	//String expectedTitle = "Yahoo login";
    	//System.out.println(actualTitle);
    	Assert.assertTrue(Yahoopresent);
    	
    	Assert.assertEquals(actualYahooText, expectedText);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
		
		
		
		
		
	

    
    
    
    @AfterTest
    public void validateAfterTest() throws InterruptedException {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
    	driver.quit();
    }
		
		

		
		
		
	

}
