package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        
        cd.get("https://login.salesforce.com/?locale=in");
		JavascriptExecutor js = (JavascriptExecutor) cd;
		
		WebElement element = cd.findElement(By.xpath("//input[@id='Login']"));
		JavascriptutilityDemo.drawBorder(element, cd);
		System.out.println(JavascriptutilityDemo.getTitleByJS(cd)) ;

	}

}
