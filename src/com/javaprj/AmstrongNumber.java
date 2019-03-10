package com.javaprj;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int n =153,a,b,c=0;
		int temp = n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}

		if(temp==c)
		{
			System.out.println("Given num is Amstrong Number");
		}
		else
		{
			System.out.println("Given num is  Not Amstrong Number");

		}
	
}
}
