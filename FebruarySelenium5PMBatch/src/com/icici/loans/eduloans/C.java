package com.icici.loans.eduloans;

import com.icici.loans.carloans.A;
import com.icici.loans.carloans.B;

public class C extends B
{	
	public void m3()
	{
		System.out.println("iam m3 from ClassC");
	}

	public static void main(String[] args) 
	{
		int i = 100;
		
		B b = new B();
		b.m1();
		b.m2();
		
		C c = new C();
		c.m1();
		c.m3();
	}

}
