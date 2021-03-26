package com.icici.loans.eduloans;

public class DataType 
{
	byte b; // 1 byte
	short s; // 2 bytes
	int i; // 4 bytes
	long l;  // 8 bytes
	
	float f;  // 4 bytes
	double d; // 8 bytes
	
	char ch; // 2 bytes
	boolean bb;
	
	String str;
	
	static float sal;
	static String cname ;
	
	public static void main(String[] args) 
	{
		int x = 0;
		
		DataType obj = new DataType();
		System.out.println("Byte : " + obj.b);
		System.out.println("Short : " + obj.s);
		System.out.println("Int : " + obj.i);
		System.out.println("Long : " + obj.l);
		
		System.out.println("Float  : " + obj.f);
		System.out.println("Double : " + obj.d);
		
		System.out.println("Char : " + obj.ch);
		System.out.println("Boolean : " + obj.bb);
		
		System.out.println("String :" + obj.str);
		
		System.out.println("Cname : " + cname);
		System.out.println("Sal : " + sal);
		
		System.out.println("X : "+ x);

	}

}
