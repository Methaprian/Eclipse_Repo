package strings;

import java.util.Scanner;

public class NoOfWordsInString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s1=sc.nextLine();
	String[] SplitString = s1.split(" ");
	System.out.println("No of Words in the String is "+SplitString.length);
}
}
