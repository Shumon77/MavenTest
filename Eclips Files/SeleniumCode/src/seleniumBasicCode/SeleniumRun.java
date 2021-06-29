package seleniumBasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRun {

	public static void main(String[] args) {
		
		
		//import org.openqa.Selenium.WebDriver;
		WebDriver Driver;
		
		
		// Setting up browser
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "//location of the driver file");
		
		Driver = new ChromeDriver();
		
		Driver = new ChromeDriver();
		Driver = new ChromeDriver();
		
		Driver.get("https://www.google.com/");
		
		Driver.get("https://www.facebook.com");
		
		//Driver.quit();

	}

}
