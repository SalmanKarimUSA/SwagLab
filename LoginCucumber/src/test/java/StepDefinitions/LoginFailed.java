package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomePage;

public class LoginFailed {
	
	WebDriver driver =null;
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step - browser is open");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();						
//	}
	
//	@And("naviagte to homepage")
//	public void naviagte_to_homepage() {
//		System.out.println("Inside Step - user is on google search page");
//		driver.navigate().to("https://www.saucedemo.com/");
//	}
	
	
//	@When("I fill the account information for account LockedOutUser into the Username field and the Password field")
//	public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {
//				 
//		 HomePage homePage = new HomePage(driver);
//		 homePage.typeUsername("locked_out_user");
//		 homePage.typePassword("secret_sauce"); 
//	    	
//	}
	
//	  @And("I click the Login Button")
//	    public void i_click_the_login_button() {
//	    	 System.out.println("Hello");
//	    	 HomePage homePage = new HomePage(driver);
//	 	     homePage.clickSignIn();
//	    }

//	@Then("I verify the Error Message contains the text {string}")
//	public void i_verify_the_error_message_contains_the_text(String string) {
//	boolean t = driver.findElement(By.partialLinkText("Sorry, this user has been locked out")).isDisplayed();
//		   
//
//		}
}