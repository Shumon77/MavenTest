package seleniumProjectClass6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
			
			WebDriver Driver = new ChromeDriver();
			
			Driver.get("https://www.facebook.com");
			
			Driver.manage().deleteAllCookies();
			
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Driver.manage().window().maximize();
			
			// For Drop Down Select Function
			
			
			WebElement month = Driver.findElement(By.id("month"));
			
			Select ddmonth = new Select (month);
			
			ddmonth.selectByVisibleText("Jul");
			
			WebElement year = Driver.findElement(By.id("year"));
			
			Select ddyear = new Select (year);
			
			ddyear.selectByIndex(15);
			
			Driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
			
			
			
			
			
			

	}

}
