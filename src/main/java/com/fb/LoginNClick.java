package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		cd.manage().window().maximize();
		
		WebElement un = cd.findElement(By.id("user-name"));
		WebElement pass = cd.findElement(By.name("password"));
		
		un.sendKeys("standard_user");
		Thread.sleep(1000);
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);

		
		cd.findElement(By.id("login-button")).click();
//		Thread.sleep(1000);

		
		String CurrWinHandle = cd.getWindowHandle();
		cd.switchTo().window(CurrWinHandle);
		cd.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		Thread.sleep(1000);
		cd.close();

	}

}
