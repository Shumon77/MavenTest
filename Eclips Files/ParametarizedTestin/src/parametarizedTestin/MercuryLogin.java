package parametarizedTestin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MercuryLogin {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		@BeforeTest
		public void setupTest(String browser) throws InterruptedException {
			
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.progressive.com/home/home/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(20000);
		
		
		}
		
		
		

	}

}
