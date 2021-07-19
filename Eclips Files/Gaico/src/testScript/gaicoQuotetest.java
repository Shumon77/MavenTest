package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SalesGaico;
import pages.homepage;

public class gaicoQuotetest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		
		WebDriver driver;
		
		homepage hp;
		
		
		driver = new ChromeDriver();
		
		hp = new homepage(driver);
		
		SalesGaico sg = new SalesGaico(driver);
		
		
		driver.get("https://www.geico.com/auto-insurance/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		hp.getzipCodeBox().sendKeys("20192");
		
		String buttonValue = hp.getReviewYourQuote().getText();
		
		hp.getReviewYourQuote().click();
		
		System.out.println("buttonValue");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		sg.getdateOfBirth().sendKeys("01/01/1988");
		
		
		
		
		

	}

}
