package seleniumRunable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRunable {

	public static void main(String[] args) {
		
		// Setting up and opening up Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to an URL
		
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Bob");
		
		driver.findElement(By.name("lastName")).sendKeys("John");
		
		driver.findElement(By.name("userName")).sendKeys("john@google.com");
		
		driver.findElement(By.linkText("register")).click();
		
		driver.findElement(By.linkText("/images/forms/submit.gif?osCsid=71ec1fd9f4aa80f34b1e2f5a6a1712a0")).click();

	}

}
