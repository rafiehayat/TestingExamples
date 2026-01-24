package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.calculator.net/");

		cd.manage().window().maximize();
		
		List <WebElement> linkElements = cd.findElements(By.tagName("a"));
		
		System.out.println("Total Links On Webpage - " + linkElements.size());
		
		for (WebElement el:linkElements )
		{
			System.out.println(el.getText());
		}
		
		Thread.sleep(2000);
		cd.quit();


	}

}
