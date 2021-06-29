package seleniumProjectClass6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNonRClass {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		
		Driver.get("https://www.facebook.com");
		

	}

}
