package com.practice;

import java.util.Arrays;



public class Solution {
	public static String[] split(String mainString, String oneChar)
	{
		int count=0;
		String arr[]=new String[1000];
		String str="";
		for(int i=0; i<mainString.length(); i++)
		{
			
			if(oneChar.charAt(0)==mainString.charAt(i))
			{
				arr[count++]=str;
				str="";
			}
			str=str+mainString.charAt(i);
		}
		if(mainString.charAt(mainString.length()-1)!= oneChar.charAt(0))
		{
			arr[count++]=str;
		}
		
		
		
		
		String arr2[]=new String[count];

		for(int i=0; i<count; i++)
		{
			arr2[i]=arr[i];
		}
		
		return arr2;
	}
	public static String check(String str)
	{
		String str1[]=split(str, " ");
		String str2[]=split(str," ");
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		for(int i=0; i<str1.length; i++)
		{
			int count=0;
			for(int j=i ; j<str1.length; j++)
			{
				
				if(str1[i].equals(str2[j]))
				{
					count++;
					if(i!=j)
					{
						str1[j]=null;
					}
				}
				
			}
			
			if(str1[i]!=null)
			{
				System.out.println(str1[i]+" "+count);
			}
		}
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		return "";
		
	}
	
//	public static void bi
	

	public static void main(String[] args) {
		check("namzy hi namzy halappa hi halappa xyz hi ");
//		String arr[]=split("namzy hi namzy halappa hi halappa xyz hi", " ");
//		System.out.println(Arrays.toString(arr));
//		check("ASD2JK*S%L");
	}

}
