package com.icici.loans.carloans;

import java.util.Date;

public   class A 
{
	public static int x=100;
	int eno = 1200;
	public final static  String cName = "vmware";
	
	
	public  void m1()
	{
		System.out.println("Parent : iam m1 from ClassA");
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static...");
	}
	
	static
	{
		System.out.println("Iam static block...");
	}
	
	static
	{
		Date dt  = new Date();
		System.out.println(dt);
	}
	
			
	public static void main(String[] args)
	{
		A a  = new A();
		a.m1();
		
		A.m4();
		
		System.out.println(x);
		x=200;
		System.out.println(x);
		
		
	}
	
}
