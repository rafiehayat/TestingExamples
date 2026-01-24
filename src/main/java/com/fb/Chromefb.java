package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromefb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		
		WebElement un = cd.findElement(By.id("email"));
		WebElement pass = cd.findElement(By.name("pass"));
		
		un.sendKeys("Rafiehayat");
		pass.sendKeys("2345");
		Thread.sleep(1000);
		un.clear();
		un.sendKeys("HayatRafie");
		cd.findElement(By.name("login")).click();
		Thread.sleep(10000);
//		cd.close();

		
		

	}

}
