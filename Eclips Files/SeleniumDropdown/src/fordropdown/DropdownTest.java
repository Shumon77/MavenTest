package fordropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		
		
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		
		Select monthdd = new Select(month);
		
		monthdd.selectByVisibleText("June");
		
		
		//WebElement CountryCode = driver.findElement(By.name("shortCountryCode"));
		
		//CountryCode.sendKeys("10");
		
		//Select CountryCodedd = new Select(CountryCode);
		
		//CountryCodedd.selectByIndex(10);
				
				
				
		
		WebElement mobile = driver.findElement(By.id("usernamereg-phone"));
		
		mobile.sendKeys("36563647667");
		
		
		
		WebElement day = driver.findElement(By.id("usernamereg-day"));
		
		day.sendKeys("10");
		
		Select daydd = new Select(day);
		
		daydd.selectByIndex(10);
		
		
		WebElement year = driver.findElement(By.id("usernamereg-year"));
		
		year.sendKeys("1981");
		
		Select yeardd = new Select(year);
		
		yeardd.selectByValue("1981");
	
		
		
		
		

	}

}
