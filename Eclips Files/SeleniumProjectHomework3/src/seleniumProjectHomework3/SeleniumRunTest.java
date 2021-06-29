package seleniumProjectHomework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRunTest {

	public static void main(String[] args) {
		
		
		// Setting up and opening up Browser
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to URL
		
        driver.get("https://www.phptravels.net/register");
		
        driver.findElement(By.name("firstname")).sendKeys("Bob");
		
		driver.findElement(By.name("lastname")).sendKeys("John");
		
		driver.findElement(By.name("phone")).sendKeys("3135667889");
		
		driver.findElement(By.name("email")).sendKeys("john@google.com");
		
		driver.findElement(By.name("password")).sendKeys("S5665tu");
		
		driver.findElement(By.name("confirmpassword")).sendKeys("S5665tu");
		
		
		driver.findElement(By.linkText("submit")).click();

		
		
		

	}

}
