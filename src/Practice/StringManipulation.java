package Practice;

import java.util.HashSet;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {
		
		int n1=0,n2=1;
		System.out.print(n1 + " "+n2);
		for(int i=0;i<=5;i++)
		{
			int n3;
			n3= n1+n2;
			n1 =n2;
			n2=n3;
			System.out.print(" "+n3);
		}

	}
}
