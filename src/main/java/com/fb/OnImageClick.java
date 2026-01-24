package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnImageClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.opencart.com/index.php?route=cms/demo");
		
		WebElement un = cd.findElement(By.xpath("//img[@title='OpenCart - Demo']"));
		un.click();
		
		if(cd.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test passed");
			
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		cd.quit();

	}

}
