package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
//		cd.get("https://www.opencart.com/index.php?route=account/register");
		cd.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");

		cd.manage().window().maximize();
		
		WebElement element = cd.findElement(By.className("form-select"));
		
		Select DropDown = new Select(element);
		
//		DropDown.selectByVisibleText("Albania");
//		DropDown.selectByValue("Argentina");
		DropDown.selectByIndex(4);
		
		if(DropDown.isMultiple())
		{
			System.out.println("DropDown is Multiple");
		}
		else
		{
			System.out.println("DropDown is not Multiple");

		}
		List <WebElement> allDropdownOptions = DropDown.getOptions();
		System.out.println("Total Options: " + allDropdownOptions.size());
		
		for(WebElement el: allDropdownOptions)
		{
			System.out.println(el.getText());
		}
		
		
		Thread.sleep(2000);
		cd.quit();

	}

}
