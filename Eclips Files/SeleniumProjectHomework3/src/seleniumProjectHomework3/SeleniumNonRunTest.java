package seleniumProjectHomework3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNonRunTest {

	public static void main(String[] args) {
		
		// Setting up Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		WebDriver Driver1 = new ChromeDriver();
		WebDriver Driver2 = new ChromeDriver();
		
		Driver.get("https://www.phptravels.net/register");
		

	}

}
