package PageobjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without Page Factory
public class LoginPageWithPOM {
	
	WebDriver cd;
	LoginPageWithPOM(WebDriver d){
		cd = d;
	}
	
	By Username = By.id("user-name");
	By Password = By.id("password");
	By LoginBtn = By.id("login-button");
	
	public void enterUsername (String uname) {
		cd.findElement(Username).sendKeys(uname);
	}
	public void enterPassword (String pswd) {
		cd.findElement(Password).sendKeys(pswd);
	}
	public void Clickbtn () {
		cd.findElement(LoginBtn).click();
	}


}
