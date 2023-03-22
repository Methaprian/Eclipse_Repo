package strings;

import java.util.Scanner;

public class NoOfAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		char[] ArrayRef = s1.toCharArray();
		for (int i = 0; i < ArrayRef.length; i++) {
			if(ArrayRef[i]>='A'&& ArrayRef[i]<='Z' ||ArrayRef[i]>='a'&& ArrayRef[i]<='z')
			{
				count++;
			}
		}
		System.out.println("Number of Alphabets in the Given String is "+ count);
	}

}
