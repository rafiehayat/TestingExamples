package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        
        cd.get("https://www.rediff.com/");
        
        cd.switchTo().frame("moneyiframe");
        
        String nseIndex = cd.findElement(By.id("nseindex")).getText();
        System.out.println(nseIndex);
        
        
        Thread.sleep(2000);
        cd.quit();

	}

}
