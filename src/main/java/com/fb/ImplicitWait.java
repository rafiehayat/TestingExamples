package com.fb;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		
		cd.get("https://testerwork.com/");
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		StopWatch watch = null;
		
		try {
			watch = StopWatch.createStarted();
//		cd.findElement(By.linkText("Become a Tester")).click();
			cd.findElement(By.linkText("a Tester")).click();

		}
		catch(Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.getTime(TimeUnit.SECONDS) + "Seconds");

			
		}
		cd.quit();

	}

}
