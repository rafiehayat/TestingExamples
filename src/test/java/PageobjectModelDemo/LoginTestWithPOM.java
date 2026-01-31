package PageobjectModelDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestWithPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		
		LoginPageWithPOM LoginPg = new LoginPageWithPOM(cd);
		
		cd.get("https://www.saucedemo.com/");
		
		LoginPg.enterUsername("standard_user");
		LoginPg.enterPassword("secret_sauce");
		
		LoginPg.Clickbtn();

	}

}
