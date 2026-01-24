package com.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		cd.manage().window().maximize();
		
		WebElement un = cd.findElement(By.cssSelector("input#user-name"));
		WebElement pass = cd.findElement(By.cssSelector("input[type=password]"));
		WebElement login = cd.findElement(By.cssSelector("input.submit-button"));
		
		un.sendKeys("standard_user");
		Thread.sleep(1000);
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		login.click();
//		Thread.sleep(1000);

		
		String CurrWinHandle = cd.getWindowHandle();
		cd.switchTo().window(CurrWinHandle);
//		cd.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-backpack']")).click();
//		cd.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
//		WebElement AddCart = cd.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-backpack']"));
//		AddCart.click();
		
		 cd.findElement(By.cssSelector("button[name*=light")).click();


		
		Thread.sleep(10000);
		cd.close();

	}
//	public static void main(String[] args) throws InterruptedException {
//
//	    ChromeDriver cd = new ChromeDriver();
//	    cd.get("https://www.saucedemo.com/");
//	    cd.manage().window().maximize();
//
//	    WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
//
//	    // Login page elements
//	    cd.findElement(By.id("user-name")).sendKeys("standard_user");
//	    cd.findElement(By.id("password")).sendKeys("secret_sauce");
//	    cd.findElement(By.id("login-button")).click();
//
//	    // Wait for inventory page to load & Add to Cart to appear
//	    WebElement addCart = wait.until(
//	        ExpectedConditions.elementToBeClickable(
//	            By.id("add-to-cart-sauce-labs-backpack")
//	        )
//	    );
//
//	    addCart.click();
//		Thread.sleep(2000);
//
//
//	    cd.quit();
//	}

}
