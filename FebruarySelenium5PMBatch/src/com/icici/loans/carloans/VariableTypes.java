package com.icici.loans.carloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; //instance (or) instance-global (or) non-static
	static String cname = "vmware"; // static (or) static-global
	static VariableTypes obj ;
	
	public void m1()
	{
		//int x=200; // local
		System.out.println(x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	
	public static void main(String[] args) 
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
		
		obj.m1();
	}

}
