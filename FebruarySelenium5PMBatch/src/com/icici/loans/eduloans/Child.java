package com.icici.loans.eduloans;


class Parent
{
	public Number workHard()
	{
		System.out.println("Parent : Wakeup Early,Goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent :  Atmost care.....");
	}
}

public class Child extends Parent
{
	
	public strictfp Object workHard()
	{
		System.out.println("Child : Wakeup anytime,Goto bar...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : Iam in love....");
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.workHard();
		obj.care();
		obj.love();

	}

}
