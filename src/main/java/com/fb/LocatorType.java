package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		cd.manage().window().maximize();
		
		WebElement un = cd.findElement(By.id("user-name"));
		WebElement pass = cd.findElement(By.name("password"));
		WebElement Login = cd.findElement(By.className("submit-button"));
		
		un.sendKeys("standard_user");
		Thread.sleep(1000);
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		Login.click();
		
		String currWindowHandle = cd.getWindowHandle();
		cd.switchTo().window(currWindowHandle);
		
		List <WebElement> elementList = cd.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size = " + elementList.size());
		Thread.sleep(1000);
		cd.close();


		


	}

}
