package com.icici.loans.carloans;

public class MethodOverloading 
{
	
	/*
	 * public void add(int x) { System.out.println(x); }
	 */
	
	/*
	 * public void add(float x) { System.out.println(x); }
	 */
	
	/*
	 * public void add(String x) { System.out.println(x); }
	 */
	
	/*
	 * public void add(Number x) { System.out.println(x); }
	 */
	
	/*
	 * public void add(Integer x) { System.out.println(x); }
	 */
	
	public void add(Object x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
		obj.add(100);
		obj.add(12.34f);
		obj.add("ravilella");
		obj.add(1000);
		obj.add(1.2f);
		obj.add("sai");
	}

}
