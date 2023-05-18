package com.namzy.linkedList1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedList1 {
	
	
	 
	public boolean add(Object obj)
	{
		
	}
	

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.addFirst(11);
		ls.addLast(200);
		ls.add(10);
		ls.add(20);
		ls.add(1, 100);
		System.out.println("repalce element depend on element "+ls.set(1, 1000));
		
//		ls.clear();
		
		System.out.println("retrive first element but not remove "+ls.element()+" or use this method "+ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println("retrieve depending on a index "+ls.get(4));
		System.out.println(ls.indexOf(10));
		System.out.println(ls.isEmpty());
		System.out.println(ls);
		System.out.println(ls.poll()+" poll and pop is same it retrives and remove element "+ls.pop());
		System.out.println(ls);
		ls.push(111);
		System.out.println("push and addFirst method is same ");
		System.out.println(ls);
		List s=ls.subList(3, 4);
		System.out.println(s);
		
		
		

	}

}
