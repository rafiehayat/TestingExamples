package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://testautomationpractice.blogspot.com/");
		
		String actualToolTip = cd.findElement(By.xpath("//input[@id='name']")).getAttribute("title");
		
		String expectedToolTip = "";
		
		if(actualToolTip.equals(expectedToolTip))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		Thread.sleep(3000);
        cd.quit();
		

	}

}
