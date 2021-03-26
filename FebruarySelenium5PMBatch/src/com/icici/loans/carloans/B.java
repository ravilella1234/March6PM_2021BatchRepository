package com.icici.loans.carloans;

public class B extends A  //ISA Relationship
{	
	
	  public void m1() 
	  {
		  System.out.println("Child : iam m1 overriden from ClassB"); 
	  }
	 
	
	public void m2()
	{
		System.out.println("iam m2 from ClassB");
	}

	public static void main(String[] args) 
	{
		A a  = new A(); // HasA Relationship
		a.m1();
		
		//B b = new B();
		//b.m2();
		//b.m1();
		
		A obj = new B();
		obj.m1();
		
		
		
	}

}
