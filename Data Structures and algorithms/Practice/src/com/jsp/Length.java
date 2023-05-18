package com.jsp;

public class Length {
	
	public static void check(String str)
	{
		int count=0;
		for(int i=0; i<1000000; i++)
		{
			
			try
			{
				str.charAt(i);
				count++;
				
			}
			catch(Exception obj)
			{
				break;
			}
		}
		System.out.println(count);
	}
	

//	public static void count10(String str)
//	{
//		String str1[]=new String();
//		for()
//	}
//	
//	public static void reverse(String str)
//	{
//		char s[]=new char[];
//		for(int i=0; i<str.length(); i++)
//		{
//			
//		}
//	}
//	if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='A' && str.charAt(i)<='A'))
//	{
//		s=s+str.charAt(i);
//	}
//	else
//	{
//		
//	}
//	bubble sort, armStrong number, occurence of each character, diff b/w two diagonal, multi of two diam
	public static void main(String[] args) {
		check("namzy");

	}

}
