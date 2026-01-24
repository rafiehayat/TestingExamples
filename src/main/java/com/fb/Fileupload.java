package com.fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://demoqa.com/upload-download");
		
		cd.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("/Users/rafiehayat/Desktop/simple.txt");
		
		Thread.sleep(3000);
        cd.quit();
		
//		 WebElement button =  cd.findElement(By.xpath("//input[@id='uploadFile']"));
//		 
//		 Actions act = new Actions(cd);
//		 act.moveToElement(button).click().perform();
//		 
//		 Robot rb = new Robot();
//		 rb.delay(2000);
//		 
//		 StringSelection ss = new StringSelection("/Users/rafiehayat/Desktop/simple.txt");
//		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, ss);
//		 
////		 rb.keyPress(KeyEvent.VK_CONTROL);  // For Windows Control
//		 rb.keyPress(KeyEvent.VK_META);   // for mac command
//		 rb.keyPress(KeyEvent.VK_V);
//		 
////		 rb.keyRelease(KeyEvent.VK_CONTROL);
//		 rb.keyPress(KeyEvent.VK_META);
//		 rb.keyRelease(KeyEvent.VK_V);
//		 
//		 rb.keyPress(KeyEvent.VK_ENTER);
//		 rb.keyRelease(KeyEvent.VK_ENTER);

		 

	}

}
