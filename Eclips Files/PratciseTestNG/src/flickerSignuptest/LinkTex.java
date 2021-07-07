package flickerSignuptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTex {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.linkText("Sign in")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("email_create")).sendKeys("tom@icloud.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		
		WebElement maleradiobutton = driver.findElement(By.name("id_gender"));
		maleradiobutton.click();
		
		boolean z = maleradiobutton.isSelected();
		
		
		driver.findElement(By.name("customer_firstname")).sendKeys("tom");
		
		
		
		
		
		
		
		
		

	}

}
