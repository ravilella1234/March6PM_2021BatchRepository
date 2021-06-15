package com.project.JuneCRMProject.keywords;

import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generickeywords 
{
	public String objectKey;
	public String dataKey;
	public Properties childProp;
	public Properties orProp;
	public Hashtable<String, String> testData;
	public WebDriver driver;
	
	
	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public void setChildProp(Properties childProp) {
		this.childProp = childProp;
	}
	
	public void setOrProp(Properties orProp) {
		this.orProp = orProp;
	}
	
	public void setTestData(Hashtable<String, String> testData) {
		this.testData = testData;
	}

	public void openBrowser()
	{
		String browser = testData.get(dataKey);
		System.out.println("Opening Browser...." +browser );
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public void navigateUrl() throws Exception
	{
		String url = childProp.getProperty("zohourl");
		System.out.println("Navigating to WebSite...." + url);
		driver.navigate().to(url);
		Thread.sleep(5000);
	}
	
	public void clickElement() throws Exception
	{
		System.out.println("Clicked on WebElement !" + orProp.getProperty(objectKey));
		//driver.findElement(By.xpath(orProp.getProperty(objectKey))).click();
		getElement(objectKey).click();
		Thread.sleep(5000);
	}
	
	public void typeText() throws Exception
	{
		System.out.println("Entered the test !" + orProp.getProperty(objectKey) +"-----"+ testData.get(dataKey));
		//driver.findElement(By.xpath(orProp.getProperty(objectKey))).sendKeys(testData.get(dataKey));
		getElement(objectKey).sendKeys(testData.get(dataKey));
		Thread.sleep(5000);
	}
	
	public void verifyTitle()
	{
		System.out.println("Title Verified...");
	}
	
	public WebElement getElement(String objectKey)
	{
		WebElement element = null ; 
		
		if(objectKey.endsWith("_id")) {
			element = driver.findElement(By.id(orProp.getProperty(objectKey)));
		}else if(objectKey.endsWith("_name")) {
			element = driver.findElement(By.name(orProp.getProperty(objectKey)));
		}else if(objectKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orProp.getProperty(objectKey)));
		}else if(objectKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orProp.getProperty(objectKey)));
		}else if(objectKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orProp.getProperty(objectKey)));
		}else if(objectKey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orProp.getProperty(objectKey)));
		}else if(objectKey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orProp.getProperty(objectKey)));
		}
		
		return element;
	}
	
	public void quit()
	{
		if(driver!=null)
			driver.quit();
	}

}
