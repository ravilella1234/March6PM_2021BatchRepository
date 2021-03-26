package com.icici.loans.collections;

public class Student 
{
	private int sno=1745;
	private String sname="sai";
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println(s1.sno);
		System.out.println(s1.sname);
	}

}
