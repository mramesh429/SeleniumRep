package com.javaprj;

public class Palindrome {

	public static void main(String[] args) {
		int n=122,temp,r,sum=0;
		
		temp=n;
		
		while(n>0)
		{
			r= n%10;
			sum =(sum*10)+r;
			n=n/10;
		}
   if(temp==sum)
   {
	   System.out.println("Given Number is Palindrome");
   }
   else
   {
	   System.out.println("Given Number is Not Palindrome");

   }
}

}
