package signuptestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript {
	
	WebDriver driver;
	
	Pagessignup ps;
	
	
	@BeforeTest
	public void beforetest() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		ps= new Pagessignup(driver);
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		
		
	}
	@Parameters({"firstname","lastname","email","password",})
	@Test
	public void maintest(String firstname, String lastname, String email, String password) {
		
		
		WebElement firstName1 = driver.findElement(By.id("sign-up-first-name"));
		firstName1.sendKeys("firstname");
		
		//ps.getFirstName().sendKeys("John");
		
		WebElement lastName1 = driver.findElement(By.id("sign-up-last-name"));
		lastName1.sendKeys("lastname");
		
		//ps.getLastName().sendKeys("Mac");
		
		
		WebElement email1 = driver.findElement(By.id("sign-up-email")); 
		email1.sendKeys("email");
		
		WebElement password1 = driver.findElement(By.id("sign-up-password"));
		password1.sendKeys("password");
		
		//WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button"));
		//signupButton.click();
		
		//String x = driver.getTitle();
		
		//System.out.println(x);
		
		//String y = driver.getCurrentUrl();
		
		//System.out.println(y);
		
		
		
		
	}
	
	
	@AfterTest
	public void aftertest() {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
