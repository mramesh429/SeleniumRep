package com.javaprj;

public class StringOperation1 {

	public static void main(String[] args) {
		
		String s = "Hello Hyderabad";
		
		System.out.println(s.length());
		
		char[] chars = s.toCharArray();
		
		//System.out.println(c[0]);
		
		int count =0;
		
		for(char c: chars)
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
        
		System.out.println("No.of Vowels:" +count);
	}

}
