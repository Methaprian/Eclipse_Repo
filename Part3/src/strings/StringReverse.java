package strings;

public class StringReverse {

	public static void main(String[] args) {
		String s="Hello";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println("The Reversed String is : "+s1);
	}

}
