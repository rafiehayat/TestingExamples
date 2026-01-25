package com.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new  ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		Thread.sleep(10000);
		cd.close();
		
		

	}

}
