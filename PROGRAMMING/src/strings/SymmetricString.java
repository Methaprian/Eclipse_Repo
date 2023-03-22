package strings;

public class SymmetricString {

	public static void main(String[] args) {
		String s="AMMAAMMA";
		int count=0;
		char[] ch=s.toCharArray();
		int midChar = s.length()/2;
		int i =midChar,j=midChar;
		if (s.length()%2==0) {
			i--;
		}
		for (;i>=0||j<ch.length;i--,j++) {
			if (ch[i]!=ch[j]) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(s+ " is a Symmetric String");
		}else {
			System.out.println(s+ " is Not a Symmetric String");
		}
	}

}
