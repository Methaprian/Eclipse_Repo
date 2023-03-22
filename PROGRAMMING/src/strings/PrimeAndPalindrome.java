package strings;

import java.util.TreeSet;

public class PrimeAndPalindrome {

	public static void main(String[] args) {
		TreeSet<Object> hs=new TreeSet<>();
		for (int i = 0; i <=100; i++) {
			int n=i;
			int a=2;
			int count=0;
			while(a<=n/2) {
				if(n%a==0) {
					count++;
				}
				a++;
			}
			if(count==0){
				hs.add(i);
			}
		int num=i;
		int rev=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
		if(rev==i) {
			hs.add(i);
		}
		}System.out.println(hs);
	}
}
	
	


