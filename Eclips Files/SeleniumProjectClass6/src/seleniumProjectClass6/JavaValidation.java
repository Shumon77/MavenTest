package seleniumProjectClass6;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaValidation {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.facebook.com");
		
		// Implicit Wait
		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
