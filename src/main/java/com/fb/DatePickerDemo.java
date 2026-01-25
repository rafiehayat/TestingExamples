package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        
        cd.get("https://jqueryui.com/datepicker/");
        
        
        String expecetedDay = "12";
        String expecetedMonth = "July";
        String expecetedyear = "2027";

        
        
        cd.switchTo().frame(0);
        
        WebElement datePicker = cd.findElement(By.id("datepicker"));
        datePicker.click();
        
        while(true) {
        	String CalendarMonth =  cd.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	String Calendaryear =  cd.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	
        	if(CalendarMonth.equals(expecetedMonth) && Calendaryear.equals(expecetedyear))
        	{
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
        		cd.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        	}
        	
    

        	
        }

	}
}
