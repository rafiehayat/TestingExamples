package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
//		cd.get("https://demo.automationtesting.in/Alerts.html");
		cd.get("https://vinothqaacademy.com/alert-and-popup/");
		
		WebElement AlertBox = cd.findElement(By.xpath("//button[@name='alertbox']"));
		AlertBox.click();
		
		Thread.sleep(1000);
		cd.switchTo().alert().accept();
		
		WebElement AlertBox1 = cd.findElement(By.xpath("//button[@name='confirmalertbox']"));
		AlertBox1.click();
		
		Thread.sleep(1000);		
//		cd.switchTo().alert().dismiss();
		cd.switchTo().alert().accept();
		
		
		WebElement PromptAlertBox = cd.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		PromptAlertBox.click();
		
		Thread.sleep(2000);		
		cd.switchTo().alert().sendKeys("yes");
		cd.switchTo().alert().accept();

		
		
		Thread.sleep(5000);
        cd.quit();

	}

}
