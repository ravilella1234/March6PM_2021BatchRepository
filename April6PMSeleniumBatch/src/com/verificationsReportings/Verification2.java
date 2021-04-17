package com.verificationsReportings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\April Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		String txt = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		
		System.out.println("Text is : "  +txt);

	}

}
