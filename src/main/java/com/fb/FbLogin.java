package com.fb;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Username or Email");
		String username = sc.next();
		System.out.println("Please Enter Password");
		String password = sc.next();
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
				
		WebElement un = cd.findElement(By.id("email"));
		WebElement pass = cd.findElement(By.name("pass"));
		
		Thread.sleep(1000);
		un.sendKeys(username);
		Thread.sleep(1000);

		pass.sendKeys(password);
		Thread.sleep(1000);
		
		cd.findElement(By.name("login")).click();
//		Thread.sleep(10000);

	}

}
