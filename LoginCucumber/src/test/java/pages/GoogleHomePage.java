package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	
	private WebDriver driver;
	
	public GoogleHomePage(WebDriver driver) {
			this.driver = driver;
	}
	
	
	public void enter_search_keyword(String keyword) {
		driver.findElement(By.name("q")).sendKeys(keyword);
	}
	
	public void click_search_button() {
		driver.findElement(By.xpath("btn")).click();	
		}
	
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	public void click_on_first_link_from_result() {
		//
	}

}
