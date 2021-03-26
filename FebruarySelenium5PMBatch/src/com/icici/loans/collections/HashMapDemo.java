package com.icici.loans.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		Map<Integer,Employee1> hm = new HashMap<Integer, Employee1>();
		
		Employee1 e1 = new Employee1(101, "ravikanth1");
		Employee1 e2 = new Employee1(102, "ravikanth2");
		Employee1 e3 = new Employee1(103, "ravikanth3");
		Employee1 e4 = new Employee1(104, "ravikanth4");
		
		hm.put(e1.getEmpId(), e1);
		hm.put(e2.getEmpId(), e2);
		hm.put(e3.getEmpId(), e3);
		hm.put(e4.getEmpId(), e4);
		
		Set<Entry<Integer, Employee1>> entries = hm.entrySet();
		
		for(Entry<Integer, Employee1> emp : entries)
		{
			System.out.println(emp.getKey());
			Employee1 employee = emp.getValue();
			employee.display();
		}
	}
}
