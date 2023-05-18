package com.LinkedList;

import com.namzy.linkedList1.LinkedList.Node;

public class LinkedList {
	Node head;
	Node tail;
	int size;
	
	public class Node
	{
		int value;
		Node next;
		public Node(int value)
		{
			this.value=value;
			
		}
	}
	
	public void add(int value)
	{
		Node node=new Node(value);
		size++;
		if(head==null)
		{
			head=tail=node;
		}
		else
		{
			tail.next=node;
			tail=node;
		}
	}
	
	public void addFirst(int value)
	{
		Node node=new Node(value);
		if(head==null)
		{
			head=node;
		}
		else
		{
			head.next=node;
			head=node;
		}
	}

	@Override
	public String toString() {
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
		
		System.out.println(tail.value);
		return "";
	}

}

