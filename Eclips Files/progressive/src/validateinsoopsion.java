import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateinsoopsion {
	WebDriver driver; 
	
	
	
	
	
	
	@BeforeTest
	public void setupTest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/");
		
		
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
		
		//driver.quit();
		
		
	}
	
	
	@Test
	public void validateInsuranceOpsion() {
		
		
		
		WebElement Auto = driver.findElement(By.xpath("//*[@id=\"primary\"]"));
		
		boolean autopresent = Auto.isDisplayed();
		
		String Actualautotest = Auto.getText();
	}
	
	
	

}



