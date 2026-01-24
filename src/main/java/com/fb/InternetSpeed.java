package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://fast.com");
		cd.findElement(By.id("speed-value")).getText();
		
		Thread.sleep(10000);
		
		System.out.println(cd.findElement(By.id("speed-value")).getText());
		cd.close();

	}

}
