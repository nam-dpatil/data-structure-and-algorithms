package com.jsp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demox {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		for(double i=0; i<=10; i++)
		{
			al.add(i);
		}
		
		al.ensureCapacity(15);
		System.out.println(al);
		
		
		

	}

}
