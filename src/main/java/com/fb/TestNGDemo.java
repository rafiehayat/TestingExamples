package com.fb;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGDemo {
	
	@Test
	public void verifyPageTitle() {
		
		
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        cd.get("https://www.google.com/");
        
        String ExpectedTitle = "Google";
        String ActualTitle = cd.getTitle();
        
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        
        
        cd.quit();
	}

}
