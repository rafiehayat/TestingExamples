package PageobjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		
		cd.get("https://www.saucedemo.com/");
		
		WebElement user = cd.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		
		WebElement pass = cd.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		WebElement Button = cd.findElement(By.id("login-button"));
		Button.click();


	}

}
