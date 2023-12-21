package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {

	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
//	@FindBy(type="submit")
//	WebElement txt_login;
}
