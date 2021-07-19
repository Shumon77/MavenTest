package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventorypage {
	
	WebDriver driver;
	
	public inventorypage(WebDriver driver) {
		
		
		this.driver = driver;
		
		
		}
	
	public WebElement getSauceLabBackpack() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		
		return x;
	}
	
	
	public WebElement getValuePrice() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
		
		return x;
	}
	
	
	public WebElement getAddToCart() {
		
		WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		return x;
	}
	
	public WebElement getShoppingCart() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
		
		return x;
	}
	
	
	
	
	
	
	
	
	
	

}
