package com.launchers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath +"\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"\\"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
		
	}
	
	public static void openBrowser(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\April Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/DELL/Desktop/April Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProp.getProperty(url));
		 driver.navigate().to(childProp.getProperty(url));
	}
	
	public static void windowMaximize() 
	{
		driver.manage().window().maximize();
	}
	
	public static String getwindowTitle() 
	{
		//String title = driver.getTitle();
		//return title;
		
		return driver.getTitle();
	}
	
	public static String getApplicationUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void delCookies() 
	{
		driver.manage().deleteAllCookies();
	}
	
	public static void windowBack()
	{
		driver.navigate().back();
	}
	
	public static void windowForword()
	{
		driver.navigate().forward();
	}
	
	public static void windowRefresh()
	{
		driver.navigate().refresh();
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}
