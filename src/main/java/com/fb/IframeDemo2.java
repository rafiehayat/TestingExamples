package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        
        cd.get("https://vinothqaacademy.com/iframe/");
        
        cd.switchTo().frame(1);
        cd.findElement(By.name("alertbox")).click();

	}

}
