package com.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new  ChromeDriver();
		cd.manage().window().maximize();
		
//		cd.get("https://www.goibibo.com/");
		cd.get("https://www.makemytrip.com/");

		
		String expecetedDay = "10";
        String expecetedMonthyear = "July 2026";
        
//        WebElement cancelPopup = cd.findElement(By.xpath("//span[@data-cy='closeModal']"));
//        cancelPopup.click();
        
        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));

        WebElement cancelPopup = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[@data-cy='closeModal']")
                )
        );

        cancelPopup.click();

        
     WebElement DatePicker = cd.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']"));
     DatePicker.click();
     
     while(true) {
     	String CalendarMonthYear =  cd.findElement(By.xpath("//div[contains(text(),'February 2026')]")).getText();
 	 
     	
     	if(CalendarMonthYear.equals(expecetedMonthyear))
     	{
     		cd.findElement(By.xpath("//div[@aria-label='Fri Jul 10 2026']//div[@class='dateInnerCell']")).click();
     		break;
     		
     	}
     	else {
     		cd.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
     	}


     	
      }

	}

}
