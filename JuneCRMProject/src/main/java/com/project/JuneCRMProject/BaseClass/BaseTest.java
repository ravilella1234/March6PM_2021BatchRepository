package com.project.JuneCRMProject.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import com.project.JuneCRMProject.utils.ExcelAPI;

public class BaseTest 
{
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties p;
	public Properties mainProp;
	public Properties childProp;
	public ExcelAPI xls;
	public String suiteName;
	public String testName;
	
	@BeforeTest
	public void beforeTest() throws Exception 
	{
		System.out.println("iam beforeTest....");  
		init();
	}

	public  void init() throws Exception 
	{
		System.out.println("Initilized the Properties files....");
		
		fis = new FileInputStream(projectPath+"\\src\\test\\resources\\data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath +"\\src\\test\\resources\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("zohourl"));
		
		

		//init the testName
		testName = this.getClass().getSimpleName();
		System.out.println(testName);
		
		//init the xls file
		//How do i come to know the suite?
		String[] pack = this.getClass().getPackage().getName().split("\\.");
		suiteName = pack[pack.length-1];
		System.out.println(suiteName);
		
		System.out.println(childProp.getProperty(suiteName+"_xls"));
		xls = new ExcelAPI(childProp.getProperty(suiteName+"_xls"));
		
		
		
	}

}
