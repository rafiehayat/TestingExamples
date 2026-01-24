package com.fb;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class JavaScriptExecDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
//		cd.get("https://www.google.com/");
//		JavascriptExecutor js = (JavascriptExecutor) cd;
		
//		js.executeScript("document.getElementsByClassName('gLFyf')[0].value='India';");
//		
//		WebElement element = cd.findElement(By.xpath("//input[@name='btnK']"));
//		js.executeScript("arguments[0].click();", element);
		
		
		//get domain name
//		String domain = js.executeScript("return document.domain;").toString();
//		System.out.println("Domain " + domain);
		
		
		//get title name
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println("Title " + title);
		
		//get url name
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println("URL " + url);
		
//		Thread.sleep(2000);
		cd.get("https://login.salesforce.com/?locale=in");
		JavascriptExecutor js = (JavascriptExecutor) cd;
//
//
		WebElement element = cd.findElement(By.xpath("//input[@id='Login']"));
//		js.executeScript("arguments[0].style.border = '3px solid red';", element);
		
		
		//to refresh webpage
//		js.executeScript("history.go(0);");
		
//		js.executeScript("document.body.style.zoom='50%';");
//		System.out.println(js.executeScript("return window.innerHeight;").toString());
//		System.out.println(js.executeScript("return window.innerWidth;").toString());
		
		//scroll vertically till the end
//		js.executeScript("window.scrollby(0,document.body.scrollHeight)");
		
		//scroll vertically page up
//		js.executeScript("window.scrollby(0,-document.body.scrollHeight)");
		
		//to create alert
//		js.executeScript("alert('This is my alert message');");
		
		// to navigate different page using javascript
//		js.executeScript("window.location = 'https://www.youtube.com/'");
		
//		to flash webelement
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i< 50 ; i++)
		{
			js.executeScript("arguments[0].style.backgroundColor='#000000'",element);
		
		
		
        try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        js.executeScript("arguments[0].style.backgroundColor= ' " + bgcolor + " ' ",element);
        
        try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
        
		

	}

}
