package com.project.JuneCRMProject.utils;

import java.lang.reflect.Method;

public class ReflectionDemo 
{

	public static void sampleTest()
	{
		System.out.println("iam sampleTest.....");
	}
	
	public static void sampleTest1()
	{
		System.out.println("iam sampleTest1.....");
	}
	
	
	public static void main(String[] args) 
	{
		String str = "sampleTest1";
		
		/*
		 * if(str.equals("sampleTest")) sampleTest(); else if(str.equals("sampleTest1"))
		 * sampleTest1();
		 */
		
		ReflectionDemo api = new ReflectionDemo();
		Method m;
		try 
		{
			m = api.getClass().getMethod(str);
			m.invoke(api); 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 

	}

}
