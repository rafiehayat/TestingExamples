package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTableCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://testautomationpractice.blogspot.com/");
		
		
		List <WebElement> rowList = cd.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("rows :" + rowList.size());
		
		List <WebElement> colList = cd.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("col :" + colList.size());
		
		
		for(int r = 2; r<=rowList.size();r++)
		{
			for(int c = 1;c<=colList.size();c++)
			{
				String data = cd.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.println(data);

			}
		}
		
		
		
		Thread.sleep(3000);
        cd.quit();

	}

}
