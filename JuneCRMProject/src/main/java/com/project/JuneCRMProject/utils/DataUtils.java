package com.project.JuneCRMProject.utils;

import java.util.Hashtable;

public class DataUtils 
{
	
	public static Object[][] getTestData(ExcelAPI e,String sheetName, String testCaseName)
	{
		int testStartRowNum=0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test starts  from row :" + testStartRowNum);
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		
		//calculate rows of data
		int rows =0 ;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are : " + rows);
		
		
		
		//calculate total columns
		int cols =0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Totla columns are : " + cols);
		
		
		
		//read the test data for matching testcase
		int dataRows=0;
		Object[][] data = new Object[rows][1];
		Hashtable<String, String> table = null;
		
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table = new Hashtable<String, String>();
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				//data[dataRows][cNum] = e.getCellData(sheetName, cNum, rNum);
				String key = e.getCellData(sheetName, cNum, colStartRowNum);
				String value = e.getCellData(sheetName, cNum, rNum);
				table.put(key, value);
			}
			data[dataRows][0]= table;
			dataRows++;
		}
		return data;
		
		
	}

}