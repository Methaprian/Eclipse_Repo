package strings;

import java.util.Arrays;

public class CharacterOccurence {

	public static void main(String[] args) {
		String s="KARNATAKA";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
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
