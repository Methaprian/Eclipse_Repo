package qsp;
import java.util.Scanner;
public class A1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		int sum=0;

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				sum=sum+ch-'0';
			}
			
		}
		System.out.println("The sum of no.of Digits in the String is "+sum);

	}

}
