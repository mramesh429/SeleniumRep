package com.javaprj;

public class StringManupulation {

	public static void main(String[] args) {
	
		String s = "hello983@%Hyd";
		
		char[] c = s.toCharArray();
		String str1="";
		for(int i=0;i<c.length;i++)
		{
			if((c[i]>48 && c[i]<=57)||(c[i]>=97 && c[i]<=122))
			{
				str1 =str1+c[i];
			}
		}
  System.out.println(str1);
}
	}
	


