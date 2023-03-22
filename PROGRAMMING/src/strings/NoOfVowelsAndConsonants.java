package strings;

import java.util.Scanner;

public class NoOfVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int VowelCount = 0;
		int ConsonantCount=0;
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		char[] ArrayRef = s1.toCharArray();
		for (int i = 0; i < ArrayRef.length; i++) {
			if(ArrayRef[i]=='A'||ArrayRef[i]=='E'||ArrayRef[i]=='I'||ArrayRef[i]=='O'||ArrayRef[i]=='U'||ArrayRef[i]=='a'||ArrayRef[i]=='e'||
					ArrayRef[i]=='i'||ArrayRef[i]=='o'||ArrayRef[i]=='u')
			{
				VowelCount++;
			}
			else if(ArrayRef[i]>='B'&& ArrayRef[i]<='D'||ArrayRef[i]>='F'&& ArrayRef[i]<='H'||ArrayRef[i]>='J' && ArrayRef[i]<='N'||ArrayRef[i]>='P' && ArrayRef[i]<='T'
					|| ArrayRef[i]>='V'&& ArrayRef[i]<='Z'||ArrayRef[i]>='b'&& ArrayRef[i]<='d'||ArrayRef[i]>='f'&& ArrayRef[i]<='h'||ArrayRef[i]>='j' && ArrayRef[i]<='n'||
					ArrayRef[i]>='p' && ArrayRef[i]<='t'|| ArrayRef[i]>='v'&& ArrayRef[i]<='z') {
				ConsonantCount++;
			}
							
		}
		System.out.println("No. of Vowels in the String : "+ VowelCount);
		System.out.println("No. of Consonants in the String : "+ ConsonantCount);
	}

}
