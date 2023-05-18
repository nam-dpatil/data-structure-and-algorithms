package com.jsp;

public class PrimeNumber {
	public static void PrintPrime(int n1)
	{
		int count1=0;
		for(int j=2; j<=1000; j++)
		{
			int count=0;
			
			for(int i=2; i<j; i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==0 && count1<=n1)
			{
				count1++;
				System.out.println(j+" ");
			}
			if(count1==n1)
			{
				break;
			}
		}
	}
	 static long nthEvenFibonacci(long n){
	        long n1=0; 
	        long n2=1; 
	        long n3=0;
	        int count=0;
	        
	        for(long i=1; i<=n*3; i++)
	        {
	            n3=n1+n2;
	            
	            if(n3%2==0)
	            {
	            	
	                ++count;
	                System.out.println(count+" "+n3);
	            }
	            n1=n2;
	            n2=n3;
	            if(count==n)
	            {
	                n3=n3%1000000007;
	                return n3;
	                
	            }
	            
	           
	        }
	        return 0; 
	        
	        
	    }
	
	

	public static void main(String[] args) {
//		PrintPrime(10);
//		nthEvenFibonacci(10);
		int a=10;
		
		

	}

}
