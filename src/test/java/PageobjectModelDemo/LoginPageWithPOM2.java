package PageobjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page Factory
public class LoginPageWithPOM2 {
 
	//Constructor
	WebDriver cd;
	LoginPageWithPOM2(WebDriver d){
		cd = d;
		// this method will create webElements
		PageFactory.initElements(cd, this);
	}
	@FindBy (id="user_name") WebElement username;
	@FindBy (id="password") WebElement password;
	@FindBy (id="login-button") WebElement loginBtn;
	
	public void enterUsername (String uname) {
		username.sendKeys(uname);
	}
	public void enterPassword (String pswd) {
		password.sendKeys(pswd);
	}
	public void Clickbtn () {
		loginBtn.click();
	}

	

	
}
