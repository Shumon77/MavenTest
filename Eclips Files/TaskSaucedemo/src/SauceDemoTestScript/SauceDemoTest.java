package SauceDemoTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SauceDemoPages.homepage;
import SauceDemoPages.inventorypage;

public class SauceDemoTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		homepage hp = new homepage(driver);
		
		inventorypage ip = new inventorypage(driver);
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		hp.getUserName().sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		hp.getPassword().sendKeys("secret_sauce");
		
		String login = hp.getLogin().getText();
		
		hp.getLogin().click();
		
		System.out.println("login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String x = ip.getSauceLabBackpack().getText();
		
		System.out.println(x);
		
		
		String y = ip.getValuePrice().getText();
		
		
		System.out.println(y);
		
		
		ip.getAddToCart().click();
		
		Thread.sleep(1000);
		
		
		ip.getShoppingCart().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
