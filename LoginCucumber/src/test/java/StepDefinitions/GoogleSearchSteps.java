//package StepDefinitions;
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
//import pages.GoogleHomePage;
//
//
//public class GoogleSearchSteps{
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
//		
//	}
//
//			
//
//	@Given("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step - user is on google search page");
//		driver.navigate().to("https://google.com");
//		
//	
//		
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("Inside Step - user enters a text in search page");
////		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		GoogleHomePage googleHomePage = new GoogleHomePage(driver);
//		googleHomePage.enter_search_keyword("best selenium tutorials");
//		
//		
//	}
//
//	@When("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside Step - hit enters");
//	GoogleHomePage googleHomePage = new GoogleHomePage(driver);
//		//GoogleHomePage googleHomePage = pageObjectManager.getGoogleHomepage();
//		googleHomePage.hit_enter();
//		
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step - user is navigated to search result");
//		driver.getPageSource().contains("Online Courses");
//		driver.quit();
//		
//	}
//
//
//}
