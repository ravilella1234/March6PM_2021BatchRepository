package com.project.JuneCRMProject.keywords;

import java.util.Hashtable;
import java.util.Properties;

public class Generickeywords 
{
	public String objectKey;
	public String dataKey;
	public Properties childProp;
	public Properties orProp;
	public Hashtable<String, String> testData;
	
	
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
		System.out.println("Opening Browser...." +testData.get(dataKey) );
	}
	
	public void navigateUrl()
	{
		System.out.println("Navigating to WebSite...." + childProp.getProperty("zohourl"));
	}
	
	public void clickElement()
	{
		System.out.println("Clicked on WebElement !" + orProp.getProperty(objectKey));
	}
	
	public void typeText()
	{
		System.out.println("Entered the test !" + orProp.getProperty(objectKey) +"-----"+ testData.get(dataKey));
	}
	
	

}
