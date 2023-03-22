package strings;

import java.util.Scanner;

public class ReverseAllCharAndWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		String s2="";
		String[] str=s1.split(" ");
		for (int i = 0; i<str.length; i++) {
			s2=s2+reverse(str[i])+" ";
			
		}System.out.println(s2);
	}
		
		public static String reverse(String s) {
			String s1="";
			for(int i=0;i<s.length();i++) {
				s1=s.charAt(i)+s1;
			}
				return s1;
			}
	}

