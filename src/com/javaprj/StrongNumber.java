package com.javaprj;

public class StrongNumber {

	public static void main(String[] args) {
		
		int n=146,temp,c=0,a,y=1;
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+fact(a);
			System.out.println(c);
		}

		if(temp==c)
		{
			System.out.println("Given Number is Strong Number");
		}
		else
		{
			System.out.println("Given Number is  Not Strong Number");
		}
	}

	public static int fact(int x)
	{
		int y=1;
		for(int i=1;i<=x;i++)
		{
			
			y=y*i;
		}
		return y;
	}
}
