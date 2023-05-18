package com.jsp;

import java.util.Scanner;

public class Wrapper {
	static void m1()
	{
		
	}

	public static void main(String[] args) {
		int a=10;
		Double a1=(double) a;  
		System.out.println(a + " " +a1);
		Wrapper.m1();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		sc.close();

	}

}
