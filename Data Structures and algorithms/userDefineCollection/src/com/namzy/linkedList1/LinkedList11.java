package com.namzy.linkedList1;

public class LinkedList11 {
	Node head;
	 
	public void add(int value) {
		Node node=new Node();
		node.value=value;
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
	

	

}
