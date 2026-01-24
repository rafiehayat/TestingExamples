package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLtext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
//		cd.get("file:///Users/rafiehayat/Documents/Untitled 2.html");
		cd.get("file:///Users/rafiehayat/Documents/Test.html");

		
		String text = cd.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		List <WebElement> rowList = cd.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("rows :" + rowList.size());
		
		List <WebElement> colList = cd.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("col :" + colList.size());
		
		
		for(int r = 2; r<=rowList.size();r++)
		{
			for(int c = 1;c<=colList.size();c++)
			{
				String data = cd.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.println(data);

			}
		}
		
		
		
		Thread.sleep(3000);
        cd.quit();

	}

}
