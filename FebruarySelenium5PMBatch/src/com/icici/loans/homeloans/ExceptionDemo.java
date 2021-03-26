package com.icici.loans.homeloans;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc = new Scanner(System.in);
				
		while(true) 
		{
			System.out.println("Enter Numarator value : ");
			nr = sc.nextInt();
			System.out.println("Enter the Denominator value : ");
			dr = sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}	
			finally 
			{
				System.out.println("Iam finally Block.....");
			}
		}

	}

}
