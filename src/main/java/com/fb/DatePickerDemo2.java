package com.fb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new  ChromeDriver();
		cd.manage().window().maximize();
		
		cd.get("https://www.redbus.in/");
		
	        String expecetedDay = "8";
	        String expecetedMonthyear = "July 2026";
	        
	     WebElement DatePicker = cd.findElement(By.xpath("//div[@class='dateInputWrapper___b6c7d8 dateHighlight___57f48d']"));
	     DatePicker.click();
	     
	     while(true) {
	        	String CalendarMonthYear =  cd.findElement(By.xpath("//p[@class='monthYear___93a489']")).getText();
	    	 
	        	
	        	if(CalendarMonthYear.equals(expecetedMonthyear))
	        	{
	        		cd.findElement(By.xpath("//span[text()='8']")).click();
	        		break;
	        		
	        	}
	        	else {
	        		cd.findElement(By.xpath("//div/li[contains(@class,'dateItem___b1529b date')]")).click();
	        	}


	        	
	         }


	}

}
