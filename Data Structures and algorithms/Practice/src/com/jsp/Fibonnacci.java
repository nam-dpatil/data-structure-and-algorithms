package com.jsp;

import java.util.Arrays;

public class Fibonnacci {
	static long nthFibonacci(long n){

		long n1=0;
		long n2=1;
		long n3=0;
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}

		else
		{
			{
				for(long i=3; i<=n/2; i++)
				{
					n3=n1+n2;
					n1=n2;
					n2=n3;
				}
			}
		}
		return n3;
	}
	
	public static int[] findFibSubset(int arr[], int n)
    {
        
        
    }
	
	
	

	public static void main(String[] args) {
//		System.out.println(nthFibonacci(65));
		int arr[]={0, 2, 8, 5, 2, 1, 4,13, 23};
		findFibSubset(arr, 10);
		
		

	}

}
