package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().window().maximize();
		 
		 driver.navigate().to("https://azure.microsoft.com/en-us/");
		 
		 
		WebElement Signin = driver.findElement(By.linkText("Sign in"));
		Signin.click();
		
		Thread.sleep(10000);
		driver.navigate().back();
		 
		 Thread.sleep(10000);
		 WebElement Overview = driver.findElement(By.linkText("Overview")); 
		 Overview.click();
		 
		 Thread.sleep(10000);
		 driver.navigate().back();
		 
		 
		 Thread.sleep(10000);
		 WebElement Develop_productively = driver.findElement(By.linkText("Develop productively, collaborate globally"));
		 Develop_productively.click();
		 
		 Thread.sleep(10000);
		 driver.navigate().back();
		 
		 

   
		 
		 
		
		
		

	}

}
