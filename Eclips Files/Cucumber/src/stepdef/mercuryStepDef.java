package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.mercurypages;

public class mercuryStepDef {
	
	WebDriver driver;
	
	 mercurypages hp;
	
	@Given("^user is on the mercury signup page$")
	public void user_is_on_the_mercury_signup_page()  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		hp = new mercurypages(driver);
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		
	    
	}

	@Given("^users enters firstname \"([^\"]*)\" for positive data$")
	public void users_enters_firstname_for_positive_data(String firstname)  {
		
		hp.getfirstnameName().sendKeys(firstname);
		
	
	    
	}

	@When("^user enters last name mercury signup \"([^\"]*)\" for positive data$")
	public void user_enters_last_name_mercury_signup_for_positive_data(String lastname)  {
		
		hp.getlastnameName().sendKeys(lastname);
	    
	}

	@When("^user enters email  \"([^\"]*)\" for positive data$")
	public void user_enters_email_for_positive_data(String email)  {
		
		hp.emailphone().sendKeys(email);
	    
	}

	@When("^user enters phone number \"([^\"]*)\" for positive data$")
	public void user_enters_phone_number_for_positive_data(String arg1)  {
	    
	}

	@When("^user enters first name mercury signup page \"([^\"]*)\" for nagative data$")
	public void user_enters_first_name_mercury_signup_page_for_nagative_data(String arg1)  {
	    
	}

	@Then("^user enters last name mercury signup page \"([^\"]*)\" for negative data$")
	public void user_enters_last_name_mercury_signup_page_for_negative_data(String arg1)  {
	    
	}

	@Then("^user enters phone number mercury signup page \"([^\"]*)\" for negative data$")
	public void user_enters_phone_number_mercury_signup_page_for_negative_data(String arg1) {
	    
	}

	@Then("^user enters email mercury signup page \"([^\"]*)\" for negative data$")
	public void user_enters_email_mercury_signup_page_for_negative_data(String arg1)  {
	    
	}

	//@Given("^I want to write a step with precondition$")
	//public void i_want_to_write_a_step_with_precondition() {
	    
	//}

	//@Given("^some other precondition$")
	//public void some_other_precondition()  {
	    
	//}

	//@When("^I complete action$")
	//public void i_complete_action()  {
	    
	//}

	//@When("^some other action$")
	//public void some_other_action()  {
	    
	//}

	//@When("^yet another action$")
	//public void yet_another_action() {
	    
	//}

	//@Then("^I validate the outcomes$")
	//public void i_validate_the_outcomes()  {
	    
	//}

	//@Then("^check more outcomes$")
	//public void check_more_outcomes() {
	   
	//}

	@Given("^I want to write a step with <name>$")
	public void i_want_to_write_a_step_with_name() {
	    
	}

	@When("^I check for the <value> in step$")
	public void i_check_for_the_value_in_step()  {
	   
	}

	@Then("^I verify the <status> in step$")
	public void i_verify_the_status_in_step()  {
	    
	}
	
	@Given("^user enters first name with John$")
	public void user_enters_first_name_with_John()  {
	    
	}

	@When("^user enters last name with Bob$")
	public void user_enters_last_name_with_Bob()  {
	    
	}

	@When("^user can close the browser$")
	public void user_can_close_the_browser()  {
	    
	}

	@Given("^user enters first name with String$")
	public void user_enters_first_name_with_String()  {
	   
	}

	@When("^user enters last name with Vence$")
	public void user_enters_last_name_with_Vence()  {
	   
	}

	@Given("^user enters first name with (\\d+)$")
	public void user_enters_first_name_with(int arg1)  {
	    
	}

	@When("^user enters last name with Jef$")
	public void user_enters_last_name_with_Jef()  {
	    
	}

	@Given("^user enters first name with Clarck$")
	public void user_enters_first_name_with_Clarck()  {
	    
	}

	@When("^user enters last name with Jem$")
	public void user_enters_last_name_with_Jem()  {
	    
	}





}
