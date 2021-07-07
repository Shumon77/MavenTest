package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		//WebDriver driver1 = new ChromeDriver();
		
		
		driver.get("https://mobile.twitter.com/login");
		
		
		//driver1.get("https://www.google.com/");
		
		String url = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		
		System.out.println(url);
		
		System.out.println(title);
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up for Twitter")).click();
		
		
		url = driver.getCurrentUrl();
		
		title = driver.getTitle();
		
		System.out.println(url);
		
		System.out.println(title);
		
		

	}

}
