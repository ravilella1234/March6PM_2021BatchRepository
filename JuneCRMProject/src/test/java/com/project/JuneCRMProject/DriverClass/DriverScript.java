package com.project.JuneCRMProject.DriverClass;

import java.util.Hashtable;
import java.util.Properties;

import com.project.JuneCRMProject.utils.ExcelAPI;

public class DriverScript 
{
	public Properties orProp;
	public Properties childProp;
		
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
				String url = childProp.getProperty(dataValue);
				System.out.println(url);
				
				
				System.out.println(tcid + "----" +keyword + "----" + objectValue + "----" + dataValue);
			}
			
		}
		
	}

}
