package seleniumProjectHomework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bdlist24ClickSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=FAADABE436FB3BF4A0BF3574623488C8?signonForm=");
		
		driver.findElement(By.name("username")).sendKeys("Shumon");
		
        //driver.findElement(By.name("email")).sendKeys("syed.shumon7@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Orangeplus2");
		
		//driver.findElement(By.name("cpassword")).sendKeys("Orangeplus2");
		
		//driver.findElement(By.name("")).sendKeys("");
		
		//driver.findElement(By.name("")).sendKeys("");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register Now!")).click();
		
		
		

	}

}
