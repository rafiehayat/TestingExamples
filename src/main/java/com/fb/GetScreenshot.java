package com.fb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class GetScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.google.com/");
		
//        TakesScreenshot ts = (TakesScreenshot) cd;
//        File src = ts.getScreenshotAs(OutputType.FILE);
//        
//        File dest = new File("/Users/rafiehayat/Desktop/google.png");
//        FileHandler.copy(src, dest);
		
		//Capture Section of a web page
		
//		WebElement section = cd.findElement(By.xpath("//div[@id='LS8OJ']"));
//      File src = section.getScreenshotAs(OutputType.FILE);
//      
//      File dest = new File("/Users/rafiehayat/Desktop/google.png");
//      FileHandler.copy(src, dest);
		
		
		//Capture Button/link of a web page
		
		WebElement section = cd.findElement(By.xpath("//textarea[@id='APjFqb']"));
	      File src = section.getScreenshotAs(OutputType.FILE);
	      
	      File dest = new File("/Users/rafiehayat/Desktop/google.png");
	      FileHandler.copy(src, dest);

        
        
        Thread.sleep(3000);
        cd.quit();



	}

}
