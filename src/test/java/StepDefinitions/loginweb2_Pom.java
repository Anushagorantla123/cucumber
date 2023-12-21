package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class loginweb2_Pom {
	
	WebDriver driver = null;
	loginpage login;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Running with thorough page object model");
	    
		System.out.println("Browser is open");
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("The project path is:"+projectpath);
		System.setProperty("WebDriver.chrome.driver",
				projectpath+"C:/Users/ADMIN/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	}

	@When("user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String password) throws InterruptedException {
		
		login = new loginpage(driver);
		login.enteruser(username);
		login.enterpasswrd(password);
		
	//    driver.findElement(By.name("username")).sendKeys(username);
	 //   driver.findElement(By.name("password")).sendKeys(password);
	    Thread.sleep(5000);
	   
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.enterlogin();
	    
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		login.dashboard();
		
	//    driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	    System.out.println("User is on Admin page");
	}

}
