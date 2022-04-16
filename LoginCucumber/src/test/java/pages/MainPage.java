
package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
 
public class MainPage {
 
private WebDriver driver;
	
	public MainPage(WebDriver driver) {
			this.driver = driver;
	}
	
 
         
    // Locator for User Name
    By Username = By.xpath("//input[@id='user-name']");
 
    // Locator for Password field
    By Password= By.xpath("//*[@id=\"password\"]");
 
    // Locator for LogIn Button
    By LogInButton= By.xpath("//*[@id=\"login-button\"]");
 
    // Locator for find Element
     By ErrorMessage=By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");
     
    
    // Method to check HomePage Title
     public String verifyHomepageTitle() {
    	 return driver.getTitle();
     }
    
    
     @Then("I am redirected to the Sauce Demo Main Page")
     public void i_am_redirected_to_the_sauce_demo_main_page() {
     	String URL = driver.getCurrentUrl();
     	Assert.assertEquals(URL, "https://www.saucedemo.com/inventory.html");
     }
}