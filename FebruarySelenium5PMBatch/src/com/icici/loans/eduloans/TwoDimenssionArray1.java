package com.icici.loans.eduloans;

public class TwoDimenssionArray1 
{

	public static void main(String[] args)
	{
		int[][] a = new int[3][5];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		a[2][3]=100;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
