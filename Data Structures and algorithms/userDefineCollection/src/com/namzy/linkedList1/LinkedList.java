package com.namzy.linkedList1;

import java.util.Collections;

import com.LinkedList.LinkedList.Node;

// doubly linked list
public class LinkedList implements Comparable<String>
{
	Node head;
	Node tail;
	int size;

	class Node 
	{
		String value;
		Node next;
		Node previous;
		public Node(String value)
		{
			this.value=value;
		}
	}
	public void add(String value)
	{
		Node node=new Node(value);
		size++;
		if(head==null)
		{
			head=tail=node;
			
		}
		else
		{
			if(size==1)
			{
				tail.previous=null;
			}
			else
			{
				node.previous=tail;
				tail.next=node;
				tail=node;
			}
		}
	}
	public void printAscending()
	{
		toString();
	}
	
	public void printdescending()
	{
		System.out.print("[");
		Node temp=tail;
		while(temp.previous!=null)
		{
			System.out.print(temp.value+", ");
			temp=temp.previous;
		}
		System.out.print(head.value+"]");
		
	}
	
	@Override
	public String toString() {
		System.out.print("[");
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.value+", ");
			temp=temp.next;
		}
		System.out.print(tail.value+"]");
		return "";
		
	}
	

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		for(int i=1; i<=10; i++)
		{
			
		}
		list.add(10+"");
		list.add(70+"");
		list.add(20+"");
		list.add(30+"");
		System.out.println(list);
		list.printdescending();
		
		
		
	}
	@Override
	public int compareTo(String o) {
		String value=this.tail.value;
		String value2=this.tail.value;
		return value.compareTo(value2);
	
	}
	
	

}
