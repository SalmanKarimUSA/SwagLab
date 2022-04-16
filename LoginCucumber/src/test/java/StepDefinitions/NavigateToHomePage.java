//package StepDefinitions;
//
//
//import java.util.concurrent.TimeUnit;
//
//import org.checkerframework.checker.guieffect.qual.UI;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//
//public class NavigateToHomePage {
//	
//	WebDriver driver =null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step - browser is open");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//					
//		
//	}
//
//	@When("naviagte to homepage")
//	public void naviagte_to_homepage() {
//		System.out.println("Inside Step - user is on google search page");
//		driver.navigate().to("https://www.saucedemo.com/");
//	}
//	
//	@Then("user is on homepage")
//	public void user_is_on_homepage() {
//	    System.out.println(" Sauce Demo Login page");
//	}
//
//}
