package com.fb;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        ChromeDriver driver = new ChromeDriver();
		        driver.get("http://www.deadlinkcity.com/");
		        driver.manage().window().maximize();

		        List<WebElement> links = driver.findElements(By.tagName("a"));
		        int brokenLinkCount = 0;

		        System.out.println("Total links on page: " + links.size());

		        for (WebElement link : links) {

		            String url = link.getAttribute("href");

		            // Skip empty or null links
		            if (url == null || url.isEmpty()) {
		                continue;
		            }

		            try {
		                URL linkURL = new URL(url);
		                HttpURLConnection connection =
		                        (HttpURLConnection) linkURL.openConnection();

		                connection.setRequestMethod("HEAD");
		                connection.connect();

		                int responseCode = connection.getResponseCode();

		                if (responseCode >= 400) {
		                    System.out.println(url + " --> Broken Link (" + responseCode + ")");
		                    brokenLinkCount++;
		                }

		                connection.disconnect();

		            } catch (Exception e) {
		                System.out.println(url + " --> Exception occurred");
		                brokenLinkCount++;
		            }
		        }

		        System.out.println("Total broken links: " + brokenLinkCount);
		        driver.quit();
		    }
		}


	
