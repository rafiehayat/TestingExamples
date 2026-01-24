package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://demoqa.com/buttons");
		
//		WebElement Button = cd.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement Button = cd.findElement(By.xpath("//button[@id='rightClickBtn']"));

		
		Actions act = new Actions(cd);
//		act.doubleClick(Button).perform();
		act.contextClick(Button).perform();
		
		Thread.sleep(2000);
        cd.quit();

	}

}
