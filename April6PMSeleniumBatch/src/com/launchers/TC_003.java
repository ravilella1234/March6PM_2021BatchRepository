package com.launchers;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class);

	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		log.info("Init the Properties files....");
		
		openBrowser("chromebrowser");
		log.info("Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Opened the Url : " + childProp.getProperty("amazonurl"));
		
		windowMaximize();
		log.info("Maximized the window....");
		
		selectOption("amazondropdown_id","Books");
		log.info("Selected the option Books by using Locator :- " + orProp.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		log.info("Entered the test HarryPotter By using the locator :-" + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on amazon search button By using locatoer :- "+ orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}
}
