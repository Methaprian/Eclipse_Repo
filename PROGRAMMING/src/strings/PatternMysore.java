package strings;

public class PatternMysore {

	public static void main(String[] args) {
		int n=3;
		int index=0;
		String s="Mysore";
		char[] ch=s.toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(ch[index]+" ");
					index++;
				}
			}System.out.println();
		}
	}

}
