package seleniumRunable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNonRunable {

	public static void main(String[] args) {
		
		WebDriver Driver;
		
		// Setting up browser
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
	
		Driver = new ChromeDriver();
		
		Driver = new ChromeDriver();
		
		Driver = new ChromeDriver();
		
		Driver.get("https://newtours.demoaut.com/mercuryregister.php");

	}

}
