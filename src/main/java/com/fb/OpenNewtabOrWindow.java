package com.fb;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewtabOrWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		
		cd.get("https://www.google.com/");
		System.out.println("First page Title - " + cd.getTitle());
		
		cd.switchTo().newWindow(WindowType.TAB);
//		cd.switchTo().newWindow(WindowType.WINDOW);

		cd.get("https://www.facebook.com/");
		System.out.println("Second Tab Title - " + cd.getTitle());
		
		Set <String> windowHandles = cd.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		cd.close();
		cd.switchTo().window(handles.get(0));
		System.out.println("First page Title - " + cd.getTitle());


		


	}

}
