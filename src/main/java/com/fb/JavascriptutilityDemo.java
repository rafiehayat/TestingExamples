package com.fb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptutilityDemo {
	public static void drawBorder(WebElement element , WebDriver cd) {
		JavascriptExecutor js = ((JavascriptExecutor) cd);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	public static  String getTitleByJS( WebDriver cd) {
		JavascriptExecutor js = ((JavascriptExecutor) cd);
		String title = js.executeScript("return document.title();").toString();
		return title;
		
	}

}
