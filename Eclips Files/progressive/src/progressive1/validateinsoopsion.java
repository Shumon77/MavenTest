package progressive1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateinsoopsion {
	WebDriver driver; 
	
	Homepages hp;
	
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
        hp = new Homepages(driver);
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.progressive.com/home/home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
		
		//driver.quit();
		 
		
	}
	
	
	@Test
	public void validateInsuranceOpsionAuto() {
		
		
		
		WebElement auto = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/ul[1]/li[2]"));
		
		boolean autoypresent = hp.getAutoOption().isDisplayed();
		
		boolean autoEnable = hp.getAutoOption().isEnabled();
		String actualautoText = hp.getAutoOption().getText();
		
		Assert.assertTrue(autoEnable);
		Assert.assertTrue(autoypresent);
		
		
	}
	
	@Test
	public void validateInsuranceOpsionHome() {
		
		
		
		WebElement Home = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/ul[1]/li[3]/div/ul[1]/li[1]"));
		
		boolean Homeypresent = hp.getHomeOption().isDisplayed();
		
		boolean HomeEnable = hp.getHomeOption().isEnabled();
		String actualHomeText = hp.getHomeOption().getText();
		
		Assert.assertTrue(HomeEnable);
		Assert.assertTrue(Homeypresent);
		
	
	}
	@Test
	public void validateInsuranceOpsionsProperty() {
		
		
		
		WebElement property = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/ul[1]/li[3]"));
		
		boolean propertypresent = property.isDisplayed();
		
		String actualPropertyText = property.getText();
		String expectedPropertyWText = "Property";
		
		Assert.assertTrue(propertypresent);
		Assert.assertEquals(actualPropertyText, expectedPropertyWText);
		
		
		}}



