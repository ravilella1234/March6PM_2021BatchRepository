package com.icici.loans.collections;

public class Employee1 
{
	private int empId;
	private String empName;
	
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void display()
	{
		System.out.println("EMP ID :"+getEmpId() + " EMP NAME : " +getEmpName());
	}

}
