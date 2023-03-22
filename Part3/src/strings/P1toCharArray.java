package strings;

public class P1toCharArray {

	public static void main(String[] args) {
		String s="APPLE";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char c1=ch[i];
			System.out.println(c1);
		}
	}

}
