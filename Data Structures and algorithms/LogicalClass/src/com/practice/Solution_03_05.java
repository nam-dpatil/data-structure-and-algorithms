package com.practice;

import java.util.Arrays;

public class Solution_03_05 {
	public static void reverse(String str)
	{
		
		String arr1[]=str.split(" ");
		int count=arr1.length-1;
		System.out.println(Arrays.toString(arr1));
		for(int i=0; i<arr1.length/2+1; i++)
		{
			String temp=arr1[i];
			arr1[i]=arr1[count];
			arr1[count]=temp;
			count--;
			
		}
		System.out.println(Arrays.toString(arr1));
		for(int i=0; i<arr1.length; i++)
		{
//			arr1[i].replace(arr[i], arr1[i].length()-1);
		}
	}

	public static void main(String[] args) {
		reverse("hello hi bye");
		 String str="abcde";
		 
		 

	}

}
