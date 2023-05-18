package com.namzy.arrayListBuild;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

//	String type array
	String arrayList[]=new String[10];
//	size of the array
	int size=0;
	
	public boolean add(String obj)
	{
		
		arrayList[size++]=obj;
		
		if(size==arrayList.length)
		{
			String newArrayList[]=new String[(size*3/2)+1];
			
			for(int i=0; i<newArrayList.length; i++)
			{
				if(i<size)
				{
					newArrayList[i]=arrayList[i];
				}
			}
			arrayList=newArrayList;
			
			
		}
		
		return true;
	}
	
	public boolean remove(int index)
	{
		if(index<size)
		{
			for(int i=index; i<size-1; i++)
			{
				arrayList[index]=arrayList[index+1];
				index++;
			}
			arrayList[size-1]=null;
			size--;
			return true;
		}
		return false;
	}
	
	public boolean remove(String obj)
	{
		for(int i=0; i<size; i++)
		{
			if(arrayList[i].equals(obj))
			{
				for(int j=i; j<size-1; j++)
				{
					arrayList[j]=arrayList[j+1];
				}
				arrayList[size-1]=null;
				size--;
				return true;
			}
			
		}
		return false;
	}
	
	@Override
	public String toString() {
		System.out.print("[");
		for(int i=0; i<size; i++)
		{
			System.out.print(arrayList[i]);
			if(i!=size-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");
		return "";
	}
	
	

	public static void main(String[] args) {
		
		
		ArrayList1 al1=new ArrayList1();
		for(int i=0; i<=200; i++)
		{
			al1.add(i+"");
		}
		System.out.println(al1);
//		al1.remove(5);
		
		for(int i=100; i<=110; i++)
		{
			al1.remove(i+"");
		}
		System.out.println(al1);
		
//		ArrayList al=new ArrayList();
		
//		al1.add("namzy");
//		al1.add("gomzy");
//		al1.add("sandeep");
//		al1.add("halappa");
//		al1.add("vinay");
		
		
		
		
		
		
	

	}

}
