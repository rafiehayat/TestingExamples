package com.fb;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.deadlinkcity.com/");

		cd.manage().window().maximize();
		
		List <WebElement> linkElements = cd.findElements(By.tagName("a"));
		int resCode = 200;
		int brokenLinkCnt = 0;
		
		System.out.println("Total Links On page - " + linkElements.size());
		
		for (WebElement element:linkElements)
		{
			String url= element.getAttribute("href");
			
			try
			{
				URL urlLinkk = new URL(url);
				HttpURLConnection huc  = (HttpURLConnection)urlLinkk.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				
				if(resCode >= 400)
				{
					System.out.println(url + "Broken Link. " );
					brokenLinkCnt ++;
					
				}
			}
//			catch (MalFormedURLException e ) {
//				
//			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Total broken Links: " + brokenLinkCnt);

	}

}
