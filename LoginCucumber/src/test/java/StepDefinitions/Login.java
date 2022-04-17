package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.HomePage;



public class LoginValid {
 
  	    WebDriver driver =null;
		
		@Given("browser is open")
		public void browser_is_open() {
			System.out.println("Inside Step - browser is open");
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is : "+projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();						
		}

		
		@When("naviagte to homepage")
		public void naviagte_to_homepage() {
			System.out.println("Inside Step - user is on google search page");
			driver.navigate().to("https://www.saucedemo.com/");
		}
		
	  
        @And("I am on the Sauce Demo Login Page")
         public void i_am_on_the_Sauce_Demo_Login_Page() {
    	 //System.out.println("I am on the sauce demo login page");
    	 driver.navigate().to("https://saucedemo.com");
    	 
    }

      
    @When("I fill the account information for account StandardUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {
    	// Type EmailAddress
	    HomePage homePage = new HomePage(driver);
	    homePage.typeUsername("standard_user");
		 homePage.typePassword("secret_sauce"); 
   
    }

    @And("I click the Login button")
    public void i_click_the_login_button() {
    	 System.out.println("Hello");
    	 HomePage homePage = new HomePage(driver);
 	     homePage.clickSignIn();
    }
   
    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_sauce_demo_main_page() {
    	String URL = driver.getCurrentUrl();
    	Assert.assertEquals(URL, "https://www.saucedemo.com/inventory.html");
    }

    
    @And("I verify the App Logo exists")
    public void i_verify_the_app_logo_exists() {
       	HomePage homePage = new HomePage(driver);
    	String homeTitle =homePage.verifyHomepageTitle();
    	//System.out.println("The error message is ::" + homeTitle);
		 Assert.assertEquals("Swag Labs", homeTitle);
    }
    	
    @When("I fill the account information for account LockedOutUser into the Username field and the Password field")
	public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {
				 
		 HomePage homePage = new HomePage(driver);
		 homePage.typeUsername("locked_out_user");
		 homePage.typePassword("secret_sauce"); 
		 
    }
    
    @Then("I verify the Error Message contains the text {string}")
	public void i_verify_the_error_message_contains_the_text(String string) {
	 driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
			//findElement(By.partialLinkText("Sorry, this user has been locked out")).isDisplayed();
		   

		}
    
    

}