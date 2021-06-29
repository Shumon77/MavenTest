package agile1techtests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SignUpTest {
	
	
	@Test
	public void validateURL() {
		
		
		System.out.println("This is a test 2");
	}
	
	
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is in Before Test");
		
		
	}
	
	@Test
	public void validateTitle() {
		
		System.out.println("This is in Test");
		
		Assert.assertEquals("expected Title", "actual Title");
		
		
	}
	
	@AfterTest
	public void quitTest() {
		
		System.out.println("This is in After Test");
		
		
		
	}

}
