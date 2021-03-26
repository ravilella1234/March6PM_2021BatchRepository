package com.icici.loans.eduloans;

public class VariableType 
{
	//primitive variable
	int x = 100;  // instance (or) instance-global (or ) non-static variable
	static String cname = "vmware";  // static variable (or) static-global variable
	static float roi = 8.5f;
	static VariableType obj= new VariableType();
	
	public void m1()
	{
		int x =200; /// local variable
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		obj = new VariableType();
		System.out.println(obj.x);
		System.out.println(VariableType.cname);
	}
	
	public static void main(String[] args) 
	{
		obj = new VariableType(); //no-primitive or reference variable
		System.out.println(obj.x);
		System.out.println(VariableType.cname);		
	}

}
