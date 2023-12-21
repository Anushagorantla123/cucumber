package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearch {

//	WebDriver driver = null;
//
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		System.out.println("Browser is open");
//		
//		
//		String projectpath = System.getProperty("user.dir");
//		System.out.println("The project path is:"+projectpath);
//		System.setProperty("WebDriver.chrome.driver",
//				projectpath+"C:/Users/ADMIN/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();	
//		
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("User is on google page");
//		
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("User enters text in textbox");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//
//		System.out.println("Click on enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		
//		System.out.println("user is navigated to result page");
//		driver.getPageSource().contains("Online Courses");
//	}

}
