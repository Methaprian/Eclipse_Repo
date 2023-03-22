package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		String s2="";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			s2=ch[i]+s2;
			
		}
		
		System.out.println("The Reversed String is "+ s2);
		
	}

}
