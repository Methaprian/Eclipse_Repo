package strings;

import java.util.Scanner;

public class AptiLogic1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for (int i = s.length()-1; i >=0; i--) {
			char ch=s.charAt(i);
			s1=s1+ ++ch;
		}
		System.out.println(s1);
	}

}
