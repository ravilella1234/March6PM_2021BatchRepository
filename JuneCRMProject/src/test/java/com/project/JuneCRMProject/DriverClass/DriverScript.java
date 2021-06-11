package com.project.JuneCRMProject.DriverClass;

import java.util.Hashtable;
import java.util.Properties;

import com.project.JuneCRMProject.keywords.AppKeywords;
import com.project.JuneCRMProject.utils.ExcelAPI;

public class DriverScript 
{
	public Properties orProp;
	public Properties childProp;
	AppKeywords app;
		
	public void setOrProp(Properties orProp) {
		this.orProp = orProp;
	}
	
	public void setChildProp(Properties childProp) {
		this.childProp = childProp;
	}
	
	public Properties getChildProp() {
		return childProp;
	}

	public void executeKeywords(ExcelAPI xls, String testName,Hashtable<String, String> testData)
	{
		int rows = xls.getRowCount("Keywords");
		System.out.println("Rows : "+ rows);
		
		app = new AppKeywords();
		
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData("Keywords", "TCID", rNum);
			if(tcid.equals(testName))
			{
				String keyword = xls.getCellData("Keywords", "Keyword", rNum);
				
				String objectKey = xls.getCellData("Keywords", "Object", rNum);
				String objectValue = orProp.getProperty(objectKey);
				
				String dataKey = xls.getCellData("Keywords", "Data", rNum);
				String dataValue = testData.get(dataKey);			
				
				app.setObjectKey(objectKey);
				app.setDataKey(dataKey);
				app.setTestData(testData);
				app.setOrProp(orProp);
				app.setChildProp(childProp);
				
				//System.out.println(tcid + "----" +keyword + "----" + objectValue + "----" + dataValue);
				
				if(keyword.equals("openBrowser"))
					app.openBrowser();
				else if(keyword.equals("navigateUrl"))
					app.navigateUrl();
				else if(keyword.equals("clickElement"))
					app.clickElement();
				else if(keyword.equals("typeText"))
					app.typeText();
				else if(keyword.equals("ValidateLoginPage"))
					app.ValidateLoginPage();
			}
			
		}
		
	}

}
