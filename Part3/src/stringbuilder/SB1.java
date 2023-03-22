package stringbuilder;

public class SB1 {

	public static void main(String[] args) 
	{
		
		//StringBuilder()	Default Value of StringBuilder Object is '16'
		
		StringBuilder s=new StringBuilder();
		s.append("abcdefghijklmnop");
		System.out.println(s.capacity());
		s.append("q");
		System.out.println(s.capacity());
		s.append("rstuvwxyz1234567890");
		System.out.println(s.capacity());
	
		
		//StringBuilder(int Capacity)
		
		StringBuilder s1=new StringBuilder(100);
		System.out.println(s1.capacity());
		
		
		//StringBuilder(String str)
		
		StringBuilder str=new StringBuilder("Hello");
		System.out.println(str.capacity());
	}
	
	
	
	
	
	
	
	

}
