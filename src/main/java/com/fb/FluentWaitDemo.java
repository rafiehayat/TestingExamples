package com.fb;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Stopwatch;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver cd = new ChromeDriver();
//		cd.manage().window().maximize();
//		
//		cd.get("https://testerwork.com/");
//		
//		Wait <WebDriver> wait = new FluentWait<WebDriver>(cd)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("This is Custom Message")
//				.ignoring(NoSuchElementException.class);
//		
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(" a Tester")));
////		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Become a Tester")));
//		element.click();
		
		
		WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        cd.get("https://testerwork.com/");

        // ✅ Store values
        Duration timeout = Duration.ofSeconds(10);
        Duration polling = Duration.ofSeconds(2);

        Wait<WebDriver> wait = new FluentWait<>(cd)
                .withTimeout(timeout)
                .pollingEvery(polling)
                .withMessage("This is Custom Message")
                .ignoring(NoSuchElementException.class);

        StopWatch watch = StopWatch.createStarted();

        try {
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.linkText("Become a Tester")
                    )
            );
            element.click();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            watch.stop();

            // ✅ Print values
            System.out.println("Timeout configured : " + timeout.getSeconds() + " seconds");
            System.out.println("Polling interval   : " + polling.getSeconds() + " seconds");
            System.out.println("Total time taken   : " + watch.getTime(TimeUnit.SECONDS) + " seconds");
        }
		
		

	}

}
