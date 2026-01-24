package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://login.salesforce.com/?locale=in");
		
		WebElement un =  cd.findElement(By.id("username"));
		WebElement pw = cd.findElement(By.name("pw"));
		WebElement login = cd.findElement(By.name("Login"));
		WebElement fgPass = cd.findElement(By.linkText("Forgot Your Password?"));
		WebElement ucd = cd.findElement(By.partialLinkText("Custom"));

		
//		un.sendKeys("test@gmail.com");
//		pw.sendKeys("12345");
//		login.click();
//		fgPass.click();
		ucd.click();

	}

}
