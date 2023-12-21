package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	By txt_username = By.name("username");
	By txt_password = By.name("password");
	By txt_loginbtn =By.xpath("//button[@type='submit']");
	By dashboard = By.xpath("//h6[text()='Dashboard']");
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enteruser(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpasswrd(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void enterlogin() {
		driver.findElement(txt_loginbtn).click();
	}
	
	public void dashboard() {
		driver.findElement(dashboard).isDisplayed();
	}
	
	
	public void login(String username,String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(txt_loginbtn).click();
	}

}
