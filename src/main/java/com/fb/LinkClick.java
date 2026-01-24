package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://export.ebay.com/in/");
//		cd.get("https://saucelabs.com/");
		
		WebElement Click = cd.findElement(By.className("desktop-menu__link-item"));
		
		Actions act = new Actions(cd);
		act.moveToElement(Click).perform();
		
		
		Thread.sleep(3000);
        cd.quit();
		
		
		

	}

}
