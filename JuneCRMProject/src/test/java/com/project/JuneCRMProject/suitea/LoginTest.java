package com.project.JuneCRMProject.suitea;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.JuneCRMProject.BaseClass.BaseTest;
import com.project.JuneCRMProject.utils.DataUtils;

public class LoginTest extends BaseTest
{
  
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  System.out.println("iam f Test from LoginTest...");
	  
	  if(data.get("Runmode").equals("N"))
		  throw new SkipException("Testcase Set Runmode as NO....");
		  
	  ds.executeKeywords(xls, testName, data);
  }
  
  @DataProvider
  public Object[][] getData()
  {
	System.out.println("Iam DataProvider....");
	String sheetName = "Data";
	
	return DataUtils.getTestData(xls, sheetName, testName);
  }
}
