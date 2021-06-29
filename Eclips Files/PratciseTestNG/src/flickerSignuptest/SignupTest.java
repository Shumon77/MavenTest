package flickerSignuptest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignupTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		
		
	}
	
	@Parameters({"firstname","lastname","email","password",})
	@Test
	public void flickrtest(String firstname, String lastname, String email, String password) {
		
		WebElement firstname1 = driver.findElement(By.id("sign-up-first-name"));
		firstname1.sendKeys(firstname);
		
		
		WebElement lastname1 = driver.findElement(By.id("sign-up-last-name"));
		lastname1.sendKeys(lastname);
		
		
		WebElement email1 = driver.findElement(By.id("sign-up-email"));
		email1.sendKeys(email);
		
		
		WebElement password1 = driver.findElement(By.id("sign-up-password"));
		password1.sendKeys(password);
		
		
		
		
	}
	
	
	@AfterTest
	public void aftertest() {
		
		
		
	}

}
