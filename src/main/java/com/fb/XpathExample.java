package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		cd.manage().window().maximize();
		
		WebElement un = cd.findElement(By.xpath("//input[@id='user-name']"));
		WebElement pass = cd.findElement(By.xpath("//*[@id='password'][@name='password']"));
		WebElement login = cd.findElement(By.xpath("//input[@id='login-button']"));

		
		un.sendKeys("standard_user");
		Thread.sleep(1000);
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		login.click();
		Thread.sleep(2000);
		cd.quit();


		

	}

}
