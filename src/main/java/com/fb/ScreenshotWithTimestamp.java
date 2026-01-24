package com.fb;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithTimestamp {

    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String timeStamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        File dest = new File(
                "/Users/rafiehayat/Desktop/google_" + timeStamp + ".png");

        FileHandler.copy(src, dest);

        driver.quit();
    }
}




//package util;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
//
//public class ScreenshotUtil {
//
//    public static void takeScreenshot(WebDriver driver, String testName) {
//
//        try {
//            String timeStamp =
//                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//
//            File src = ((TakesScreenshot) driver)
//                    .getScreenshotAs(OutputType.FILE);
//
//            File dest = new File(
//                "/Users/rafiehayat/Desktop/screenshots/"
//                + testName + "_" + timeStamp + ".png");
//
//            FileHandler.copy(src, dest);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

