package seleniumProjectClass6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		WebDriver Driver;
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
			
			Driver = new ChromeDriver();
			Driver.get("");
			Driver.get("https://www.facebook.com");
			
			Driver.manage().deleteAllCookies();
			
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			WebElement linkpeople = Driver.findElement(By.linkText("People"));
			
			String linkText = linkpeople.getText();
			
			System.out.println(linkText);
			
			linkpeople.click();
			
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println(Driver.getCurrentUrl());
			
			System.out.println(Driver.getTitle());
			
			
			Driver.navigate().back();
			
			Driver.navigate().forward();
			
			Driver.navigate().refresh();
			
			

	}

}
