package progressive2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateTitle1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void validateInsuranceOption() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		//hp = new Homepages(driver);
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/home/home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		//driver.quit();
		
	
	}
	
	@Test
	public void validateTitle() {
		
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Progressive insursnce";
		
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		
		
	}

}
