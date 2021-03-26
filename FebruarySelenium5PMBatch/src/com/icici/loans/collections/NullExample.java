package com.icici.loans.collections;

import java.util.Hashtable;

public class NullExample 
{

	public static void main(String[] args) 
	{
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put(null, null);
		h.put("one", null);
		h.put("two", null);
		h.put("three", null);
		
		System.out.println(h);
	}

}
