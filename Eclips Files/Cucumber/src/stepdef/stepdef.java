package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	
	WebDriver driver;
	
	 
	
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
	    
	}

	@When("^user click on the log in link$")
	public void user_click_on_the_log_in_link()  {
	   
	}

	@Then("^user should navigate to the log in page$")
	public void user_should_navigate_to_the_log_in_page()  {
	    
	}

	@Given("^user is on the signup page$")
	public void user_is_on_the_signup_page()  {
	   
	}

	@When("^user enters username$")
	public void user_enters_username()  {
	   
	}

	@When("^user enters new password$")
	public void user_enters_new_password()  {
	    
	}

	@When("^user enters first name$")
	public void user_enters_first_name()  {
	    
	}

	@When("^user enters last name$")
	public void user_enters_last_name()  {
	   
	}

	@When("^user clicks on the signup button$")
	public void user_clicks_on_the_signup_button() {
	    
	}

	@Then("^new account for the user should be created$")
	public void new_account_for_the_user_should_be_created()  {
	    
	}

	@Then("^user should navigate to the new account page$")
	public void user_should_navigate_to_the_new_account_page()  {
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
