package strings;

import java.util.Scanner;

public class ReverseTheWordsInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		String s2="";
		String[] str=s1.split(" ");
		for (int i = str.length-1; i >=0; i--) {
			s2=s2+str[i]+" ";
			
		}System.out.println(s2);
	}

}
