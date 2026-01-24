package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        
        cd.get("https://www.calculator.net/");
        
        JavascriptExecutor js = (JavascriptExecutor)cd;
        
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {
        	e.printStackTrace();
        }
//        js.executeScript("window.scrollBy(0,500)");
        
        WebElement element = cd.findElement(By.linkText("Math Calculators")) ;
        js.executeScript("arguments[0].scrollIntoView();",element);
        
        //for bottom of the page
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
//      WebElement element = cd.findElement(By.linkText("Math Calculators")) ;
//      js.executeScript("arguments[0].scrollIntoView();",element);
        
        
        Thread.sleep(5000);
        cd.quit();

	}

}
