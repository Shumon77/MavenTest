package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementinteraction {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?.lang=en-MY&.intl=my&.src=yhelp");
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		firstname.sendKeys("");
		
		
		WebElement countrycode = driver.findElement(By.id("relative-country-code"));
		
		
		
		Select ccdd = new Select(countrycode);
		
		
		ccdd.selectByIndex(17);
		
	
		
		
		WebElement month = driver.findElement(By.id("usernamereg-month")); 
		
		month.sendKeys("July");
		
		Select mm = new Select(month);
		
		mm.selectByVisibleText("July");
		
		
		WebElement day = driver.findElement(By.id("usernamereg-day")); 
		
		day.sendKeys("10");
		
		
		Select daydd = new Select(day);
		
		daydd.selectByIndex(10);
		
		day.sendKeys("10");
		
		
		
		
		
		
		
		
		
		
	}

}
