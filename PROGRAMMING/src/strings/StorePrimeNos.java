package strings;

import java.util.ArrayList;

public class StorePrimeNos {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
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
					al.add(i);
				}
		}
		System.out.println(al); 
	}

}
