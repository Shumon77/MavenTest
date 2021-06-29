package seleniumBasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

	public static void main(String[] args) {
		
		// Setting up and opening up Browser
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to an URL
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.name("firstname")).sendKeys("bob");
		
		//driver.findElement(By.name("lastname")).sendKeys("John");
		
		//driver.findElement(By.name("reg_email__")).sendKeys("703764897654");
		
		
		//driver.findElement(By.name("reg_passwd__")).sendKeys("dhgdghfgj");
		
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//driver.quit();
		
		
		String url1 = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	}

}
