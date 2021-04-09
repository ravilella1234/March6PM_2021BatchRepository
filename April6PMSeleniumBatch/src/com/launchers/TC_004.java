package com.launchers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		windowMaximize();
		
		//driver.findElement(By.partialLinkText("tomer Serv")).click();
		
		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<links.size();i++) { if(!links.get(i).getText().isEmpty()) {
		 * System.out.println(links.get(i).getText()); } }
		 */
	}

}
