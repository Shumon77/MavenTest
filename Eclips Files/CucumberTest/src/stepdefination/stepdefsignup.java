package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.signuppages;

public class stepdefsignup {
	
	WebDriver driver;
	
	signuppages SP;
	
	
	@Given("^user is in the signup page$")
	public void user_is_in_the_signup_page()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		SP = new signuppages(driver);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
	    
	    
	}

	@When("^user enters first name$")
	public void user_enters_first_name()  {
		
		SP.getFirstName().sendKeys("John");
		
		//driver.findElement(By.id("sign-up-first-name")).sendKeys("John");
	    
	}

	@When("^user enters last name$")
	public void user_enters_last_name()  {
		
		SP.getLasttName().sendKeys("Henry");
		
		//driver.findElement(By.id("sign-up-last-name")).sendKeys("Henry");
		
		System.out.println("user enters last name");
	    
	}

	@When("^user clicks on the signup button$")
	public void user_clicks_on_the_signup_button()  {
	    
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in()  {
	    
	}
	
	@Given("^user is in the signup page  with invalid credentials$")
	public void user_is_in_the_signup_page_with_invalid_credentials() {
		
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		SP = new signuppages(driver);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to("https://identity.flickr.com/sign-up");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
	    
	    
	}

	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() {
		
		SP.getInvalidFirstName().sendKeys("Bob");
		
		//driver.findElement(By.id("sign-up-first-name")).sendKeys("Bob");
	    
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() {
		
		SP.getInvalidLastName().sendKeys("Henry");
		
		
		
		//driver.findElement(By.id("sign-up-last-name")).sendKeys("Henry");
	    
	}

	@When("^user clicks on the signup$")
	public void user_clicks_on_the_signup() {
	    
	}

	@Then("^user should be logged in again$")
	public void user_should_be_logged_in_again() {
		
		driver.quit();
	    
	}





}
