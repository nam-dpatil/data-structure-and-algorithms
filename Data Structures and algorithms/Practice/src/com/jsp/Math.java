package com.jsp;


public class Math {

	public static double pow(double baseNum, double capNum)
	{
		double result=1;
		for(int i=1; i<=capNum; i++)
		{
			result=result*baseNum;
		}
		return result;
	}
	
	public static double sqrt(double num)
	{
		int result=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				if(i*i==num)
				{
					result=i;
				}
			}
		}
		
		return result;
	}
	
	public static double cbrt(double num)
	{
		int result=0;
		for(int i=1; i<num; i++)
		{
			if((num%i)%i==0)
			{
				if(i*i*i==num)
				{
					result=i;
				}
			}
		}
		
		return result;
	}
	
	public static void fibannacci(int num)
	{
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1+" "+num2);
		for(int i=3; i<=num; i++)
		{
			num3=num1+num2;
			
			num1=num2;
			
			num2=num3;
			System.out.println(num3);
			
		}
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println(pow(2, 5));
//		System.out.println(sqrt(400));
//		System.out.println(cbrt(8));
//		System.out.println(cbrt(125));
//		fibannacci(5);
		
		
	}

}
