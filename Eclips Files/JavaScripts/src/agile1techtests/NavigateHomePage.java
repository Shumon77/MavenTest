package agile1techtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigateHomePage {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setupTest() {
		
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
		
	}
	
	
	@Test
	public void validateTitle() {
		
        String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		
		
		
	}
	
	@AfterTest
	public void quitTest() {
		
		driver.quit();
		
		
		
	}

}
