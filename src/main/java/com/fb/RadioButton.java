package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        driver.manage().window().maximize();
        
        List <WebElement> radiobuttonlist = driver.findElements(By.xpath("//input[@type='radio']"));
        
        System.out.println("Total no. of Radio Button on web page " + radiobuttonlist.size());
        Thread.sleep(2000);
        driver.quit();

	}

}
