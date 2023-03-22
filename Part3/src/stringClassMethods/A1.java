package stringClassMethods;

public class A1 {
	public static void main(String[] args) {
		String s="Apple";
	
	//char charAt(int index)
		
		char c=s.charAt(4);
		System.out.println("char charAt(int index)");
		System.out.println(c);
	
	//char[] toCharArray()
		
		char[] ch=s.toCharArray();
		System.out.println("char[] toCharArray()");
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			System.out.println(ch1);
		}
		
	//String toUpperCase()
		
		String s1=s.toUpperCase();
		System.out.println("//String toUpperCase()");
		System.out.println(s1);
		
		
		//String toLowerCase()
		
				String s2=s.toLowerCase();
				System.out.println("//String toLowerCase()");
				System.out.println(s2);
				
		//String concat(String str)
				
				String s3=s.concat("Tree");		//	"Apple".concat("Tree")=AppleTree
				System.out.println("//String concat(String str)");
				System.out.println(s3);
				
		//boolean contains(charSequence String)
				
				boolean s4=s.contains("pp");
				boolean s5=s.contains("pA");
				
				System.out.println("//boolean contains(charSequence String)");
				System.out.println(s4);
				System.out.println(s5);
				
		//int indexOf(char ch)
				
				int j=s.indexOf('p');
				int j1=s.indexOf('a');
				System.out.println("//int indexOf(char ch)");
				System.out.println(j);
				System.out.println(j1);
				
		//String subString(int StartIndex)
				
				String s6=s.substring(2);
				String s7=s.substring(3);
				System.out.println("//String subString(int StartIndex)");
				System.out.println(s6);
				System.out.println(s7);
				
		//String subString(int StartIndex, int EndIndex)
				
				String s8=s.substring(2,4);
				String s9=s.substring(1,3);
				System.out.println("//String subString(int StartIndex, int EndIndex)");
				System.out.println(s8);
				System.out.println(s9);
				
		//byte[] getBytes()
				
				String st1="ABCD";
				byte[] b1=st1.getBytes();
				System.out.println("//byte[] getBytes()");
				for(int i=0;i<st1.length();i++)
				{
					System.out.println(b1[i]);
				}
				
				
		//String[] split(String str)
				
				String s10="Hi Hello How Are You";
				String[] str1=s10.split("");
				System.out.println("//String[] split(String str)");
				for(int i=0;i<str1.length;i++)
				{
					System.out.println(str1[i]);
				}
				
		//boolean endsWith(String str)
				
				boolean b2="LAPTOP".endsWith("P");
				boolean b3="LAPTOP".endsWith("e");
				System.out.println("//boolean endsWith(String str)");
				System.out.println(b2);
				System.out.println(b3);
				
		//boolean startsWith(String str)
				
				boolean b4="LAPTOP".startsWith("L");
				boolean b5="LAPTOP".startsWith("e");
				System.out.println("//boolean startsWith(String str)");
				System.out.println(b4);
				System.out.println(b5);
				
		//String trim()
				
				
				String s11="     Laptop    ";
				String s12=s11.trim();
				System.out.println("//String trim()");
				System.out.println("Before Trim :"+s11);
				System.out.println("After Trim :"+s12);
				
		//boolean equals(String str)
				
				boolean b6=s.equals("Apple");
				boolean b7=s.equals("apple");
				System.out.println("//boolean equals(String str)");
				System.out.println(b6);
				System.out.println(b7);
				
		//boolean equalsIgnoreCase(String str)
				
				boolean b8=s.equalsIgnoreCase("Apple");
				System.out.println("//boolean equalsIgnoreCase(String str)");
				System.out.println(b8);
				
				
		//int compareTo(String str)
				
				int i2=s.compareTo("Apple");
				int i3=s.compareTo("Ap");
				System.out.println("//int compareTo(String str)");
				System.out.println(i2);
				System.out.println(i3);
				
		//int hashCode()
				
				int i4=s.hashCode();
				System.out.println("//int compareTo(String str)");
				System.out.println(i4);
				
				
				
								
				
				
	}

}
