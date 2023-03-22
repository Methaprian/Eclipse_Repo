package strings;

public class S4CtoSWithoutBuiltIn {

	public static void main(String[] args) {
		char[] ch= {'H','E','L','L','O'};
		String s1="";
		
		for(int i=0;i<ch.length;i++)
		{
			s1=s1+ch[i];
		}
		System.out.println(s1);
	}

}
