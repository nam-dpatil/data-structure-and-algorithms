package com.jsp;

public class Santa1 {

	public static void main(String[] args) {
		int n=9;
		int sq,sum=0;
		sq=n*n;
		while(sq>0)
		{
			sum=sum+sq%10;
			sum=sum/10;
		}
		if(sq==sum)
		{
			System.out.println("is nean number");
		}
		else
		{
			System.out.println();
		}

	}

}
