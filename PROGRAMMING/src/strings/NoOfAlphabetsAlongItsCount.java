package strings;

import java.util.Scanner;

public class NoOfAlphabetsAlongItsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char[] ch = s.toCharArray();
		int count=0;
		int i = 0;
		for (; i < ch.length-1; i++) {
			
			if(ch[i]==ch[i+1]) {
				count++;
			}else {
				count++;
				System.out.print(ch[i]);
				System.out.print(count);
				count=0;
			}
			
		}
		count++;
		System.out.print(ch[i]);
		System.out.print(count);
	}

}
