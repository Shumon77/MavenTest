package seleniumProjectClass6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRClass6 {

	public static void main(String[] args) {
		
		// Setting up and opening up Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		// Navigate to an URL
		
		Driver.get("https://www.facebook.com");
		
		//WebElement firstName = Driver.findElement(By.id("u_0_f"));
		
		//firstName.sendKeys("bob");
		
		//WebElement lastName = Driver.findElement(By.id("u_0_h"));
		
		//lastName.sendKeys("John");
		
		//WebElement MobileNumber = Driver.findElement(By.id("u_0_k"));
		
		//MobileNumber.sendKeys("703764897654");
		
		//WebElement Passward = Driver.findElement(By.id("u_0_p"));
		
		//Passward.sendKeys("dhgdghfgj");
		
		//Driver.manage().window().maximize();
		
		//Driver.navigate().to("https://www.facebook.com");
		
		String url = Driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title = Driver.getTitle();
		
		System.out.println(title);
		
		WebElement facebookLitelink = Driver.findElement(By.linkText("Facebook Lite"));
		
		String liteText = facebookLitelink.getText();
		
		System.out.println(liteText);
		
		facebookLitelink.click();
		
		String url1 = Driver.getCurrentUrl();
		
		System.out.println(url1);
		
		String title1 = Driver.getTitle();
		
		System.out.println(title1);
		
		
		
		
		
		//String  actualTitle= Driver.getTitle();
		//String expectedTitle = "Facebook login";
    	//System.out.println(actualTitle);
		
		
		
		//driver.findElement(By.linkText("Create a Page")).click();

	}

}
