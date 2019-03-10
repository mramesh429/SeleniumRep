package com.javaprj;

public class Vowels {

	public static void main(String[] args) {
		
		String s = "Hello Hyderabaad";
	/*	
		char[] chars = s.toCharArray();
		int count=0;
		for(Character c: chars)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count++;
				break;
			
			}
			
		}   
		
		System.out.println(count); */
 
		char[] c = s.toCharArray();
		String str1 = "";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				str1 = str1+c[i]	;
			}
			
			else
			{
			 //str1 = str1+c[i]	;
			}
			
		}
		System.out.println(str1);
		
	}

}
