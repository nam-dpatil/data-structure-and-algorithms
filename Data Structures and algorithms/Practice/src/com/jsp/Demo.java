package com.jsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Demo {
	public static void automorphic(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int i1=i;
			int count=0;
			
			while(i1>0)
			{
				i1=i1/10;
				count++;
			}
			int iSquare=i*i;
			
			int rem=(int) (iSquare%Math.pow(10, count));
			if(rem==i)
			{
				System.out.println("automorphic "+i);
			}
			
		}
		
		
	}
	public static void auto(int n)
	{
		int nSquare=n*n;
		if(n<=9)
		{
			int lastDigit=nSquare%10;
			if(lastDigit==n)
			{
				System.out.println("it is automorphic number");
			}
		}
		int count=0;
		int temp=n;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		int rem=(int)(nSquare%(Math.pow(10, count)));
		System.out.println(1);
		if(rem==n)
		{
			System.out.println("it is automorphic number");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	public static void buzz(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int rem=i%10;
			if(rem==7 || i%7==0)
			{
				System.out.println("buzz no."+i);
			}
		}
	}
	
	public static void circulor(int k)
	{
		for(int n=1; n<=k; n++)
		{
			int n1=n;
			int count=0;
			while(n1>0)
			{
				n1=n1/10;
				count++;
			}
			System.out.println(count);
			for(int j=1; j<=count; j++)
			{
				int primeCount=0;
				for(int i=2; i<n; i++)
				{
					if(n%i==0)
					{
						System.out.println("it is not prime number");
//						return ;
					}
				}
				System.out.println(n);
				if(n<9)
				{
					System.out.println("it is a prime number");
//					return ;
				}
				
			
				
				int rem=n%10;
				int div=n/10;
				n=(int)(div+(Math.pow(10,count-1)*rem));
				
			}
		}
		
		
		
	}
//	public static void coPrime(int n1,int n2)
//	{
//		for(int i=2; i<=)
//	}
	public static void magicNumber(int n)
	{
		
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				n=n/10;
				sum=sum+rem;
			}
			if(sum==1)
			{
				System.out.println("yes");
				return ;
			}
			else
			{
				int temp=sum;
				sum=0;
				while(temp>0)
				{
					int rem=temp%10;
					
					sum=sum+rem;
					temp=temp/10;
				}
			}
			if(sum==1)
			{
				System.out.println(1+" yes");
			}
			else
			{
				System.out.println("no");
			}
			
		
		
	}
	public static void circulor1(int n)
	{
		int count=0;
		int n1=n;
		int count1=0;
		if(n<=9 && n%2!=0 && n%3!=0)
		{
			System.out.println("yes 1");
		}
		while(n1>0)
		{
			n1=n1/10;
			count++;
		}
		for(int j=1; j<=count; j++)
		{
			count1++;
			for(int i=2; i<n; i++)
			{
				if(n%i==0)
				{
					System.out.println("it is not prime no "+n);
					return ;
				}
			}
			
			int rem=n%10;
			
			
			int div=n/10;
			System.out.println("it is prime number "+n);
			n=(int) (div+(Math.pow(10, count-1)*rem));
			
		}
		
		
	}

	public static void main(String[] args) {
//		automorphic(10000);
//		buzz(100);
//		circulor(119345);
//		magicNumber(227);
//		circulor1(199933);
		Set<Double> l=new HashSet();
		l.add(10.0);
		l.add(30.0);
		l.add(50.0);
		l.add(20.0);
		System.out.println(l);
		for(double l1:l)
		{
			System.out.println(l1);
		}
		
		Iterator<Double> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	
		
		
 	}

}
 