package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new  ChromeDriver();
		cd.manage().window().maximize();
		
		cd.get("https://dequeuniversity.com/library/aria/date-picker");
		
	        String expecetedDay = "12";
	        String expecetedMonthyear = "July 2026";
	        
	        
	        WebElement datePicker = cd.findElement(By.xpath("//button[@type='button']"));
	        datePicker.click();
	        
	        while(true) {
	        	String CalendarMonthYear =  cd.findElement(By.id("id-grid-label")).getText();

	        	if(CalendarMonthYear.equals(expecetedMonthyear)) {
	        		List <WebElement> daysList = cd.findElements(By.xpath("//table/tbody/tr/td"));
	        		
	        		for(WebElement e:daysList)
	        		{
	        			String CalendarDay = e.getText();
	        			if(CalendarDay.equals(expecetedDay))
	        			{
	        				e.click();
	        				break;
	        			}
	        		}
	        		break;
	        		

	        	}
	        	else {
	        		cd.findElement(By.xpath("//button[@class='next-month']")).click();
	        	}
	        }
	        Thread.sleep(5000);
	        cd.quit();

	}

}
