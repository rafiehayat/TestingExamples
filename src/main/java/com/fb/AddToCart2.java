package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		cd.manage().window().maximize();
		
//		WebElement un = cd.findElement(By.cssSelector("input#user-name"));
		WebElement un = cd.findElement(By.xpath("//input[contains(@id,'user')]"));

//		WebElement pass = cd.findElement(By.cssSelector("input[type=password]"));
		WebElement pass = cd.findElement(By.xpath("//*[@id='password'][@name='password']"));

//		WebElement login = cd.findElement(By.cssSelector("input.submit-button"));
		WebElement login = cd.findElement(By.xpath("//input[@id='login-button']"));

		
		un.sendKeys("standard_user");
		Thread.sleep(1000);
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		login.click();
		
		String CurrWinHandle = cd.getWindowHandle();
		cd.switchTo().window(CurrWinHandle);
		WebElement cart1 = cd.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']"));
		WebElement cart2 = cd.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']"));
		
		cart1.click();
		cart2.click();
		
		Thread.sleep(2000);
		cd.quit();
	}

}
