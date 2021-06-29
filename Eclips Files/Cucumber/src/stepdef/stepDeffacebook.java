package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.pages;

public class stepDeffacebook {
	
	WebDriver driver;
	
	pages hp;

	
	@Given("^user is on the facebook homepage$")
	public void user_is_on_the_facebook_homepage()  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		hp = new pages(driver);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	    
	}

	

	@When("^user eners last name$")
	public void user_eners_last_name()  {
		
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("John");
		    
		}

		@When("^user enters email address$")
	public void user_enters_email_address()  {
			
	hp.emailphonenumber().sendKeys("john@icloud.com");		
	    
	}

	@When("^user select birthday month$")
	public void user_select_birthday_month()  {
		
	
	    
	}

	@When("^user select birth date$")
	public void user_select_birth_date()  {
	    
	}

	@When("^user select birth year$")
	public void user_select_birth_year()  {
	    
	}

	@Then("^user should have a new account$")
	public void user_should_have_a_new_account()  {
	    
	}

	@Then("^user should be in the new account$")
	public void user_should_be_in_the_new_account()  {
	    
	}
	
	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	    
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	    
	}

	@Then("^user should not be able to create a login$")
	public void user_should_not_be_able_to_create_a_login() throws Throwable {
	    
	}





}
