package com.fb;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		
		cd.get("https://testerwork.com/");
		
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(10));
		StopWatch watch = null;
		
		try {
			watch = StopWatch.createStarted();
//		cd.findElement(By.linkText("Become a Tester")).click();
//			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Become a Tester")));
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(" a Tester")));
			element.click();
		}
		catch(Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.getTime(TimeUnit.SECONDS) + " Seconds");

			
		}
		Thread.sleep(2000);
		cd.quit();


	}

}
