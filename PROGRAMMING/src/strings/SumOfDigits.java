package strings;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum= 0;
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		char[] ArrayRef = s1.toCharArray();
		for (int i = 0; i < ArrayRef.length; i++) {
			if(ArrayRef[i]>='0'&& ArrayRef[i]<='9')
			{
				String s2=String.valueOf(ArrayRef[i]);
				int a=Integer.parseInt(s2);
				sum+=a;
			}
		}
		System.out.println("Sum of Digits in the Given String is "+ sum);
	}

}
