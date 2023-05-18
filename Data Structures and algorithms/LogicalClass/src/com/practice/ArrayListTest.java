package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class ArrayListTest implements Comparable<Integer>{
	@Override
	public int compareTo(Integer o) {
		return this.compareTo(o);
	}

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(30);
		System.out.println(al);
		Collections.sort(al);
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		

	}

	

}
