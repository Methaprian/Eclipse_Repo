package stringbuilder;

public class P1 {

	public static void main(String[] args) 
	{
		StringBuilder s=new StringBuilder("Hello");
		StringBuilder s1=s;
		System.out.println("Before Append");
		System.out.println("S :"+s);
		System.out.println("S1 :"+s1);
		System.out.println(s==s1);
		s1.append("World");
		System.out.println("After Append");
		System.out.println("S :"+s);
		System.out.println("S1 :"+s1);
		System.out.println(s==s1);
		
		
	}

}
