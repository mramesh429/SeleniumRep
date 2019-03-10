package com.javaprj;

public class Factrorial {

	public static void main(String[] args) {
		
		int num=7,fact;
		
		fact = factorial(num);
	System.out.println("Given Number Factorial is " + fact);
	
	
	System.out.println(System.getProperty("user.dir"));

	}

	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	

}
