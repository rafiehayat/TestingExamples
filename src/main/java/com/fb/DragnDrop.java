package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
//		cd.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");
		cd.get("https://demo.automationtesting.in/Static.html");
		
		WebElement Source = cd.findElement(By.id("angular"));
		WebElement Target = cd.findElement(By.id("droparea"));
		
		Actions act = new Actions(cd);
		
		act.dragAndDrop(Source, Target).perform();
		
		Thread.sleep(2000);
        cd.quit();

		

	}

}
