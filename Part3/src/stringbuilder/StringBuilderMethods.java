package stringbuilder;

public class StringBuilderMethods {

	public static void main(String[] args) 
	{
		StringBuilder s=new StringBuilder("Hi Hello World");
		
		//append()
		
		s.append(" Welcome");
		System.out.println("// append() \\");
		System.out.println(s);System.out.println();System.out.println();
		
		//charAt(index int)
		
		char ch=s.charAt(4);
		char ch1=s.charAt(10);
		System.out.println("// charAt(index int) \\");
		System.out.println(ch);
		System.out.println(ch1);System.out.println();System.out.println();
		
		//length()
		
		System.out.println("// length() \\");
		System.out.println(s.length());System.out.println();System.out.println();
		
		//int indexOf(String)
		
		System.out.println("// int indexOf(String) \\");
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf("E"));System.out.println();System.out.println();
		
		//subStirng(int startIndex)
		
		String s2=s.substring(2);
		System.out.println("// subStirng(int startIndex) \\");
		System.out.println(s2);System.out.println();System.out.println();
		
		
		//subStirng(int startIndex, int endIndex)
		
		String s3=s.substring(2,18);
		System.out.println("// subStirng(int startIndex, int endIndex) \\");
		System.out.println(s3);System.out.println();System.out.println();
		
		
		//reverse()
		
		System.out.println("// reverse() \\");
		StringBuilder str=new StringBuilder("Hello World");
		System.out.println("Before Reverse: "+str);
		StringBuilder s4=str.reverse();
		System.out.println("After Reverse: "+s4);System.out.println();System.out.println();
		
		
		//insert(int Index , anyTypeData
		
		
		StringBuilder s5=s.insert(10, " -Hello- ");
		System.out.println("// insert(int Index , anyTypeData \\");
		System.out.println(s5);System.out.println();System.out.println();
		
		
		//setCharAt(int index, char ch)
		
		StringBuilder s7=new StringBuilder("QS1IDERS");
		System.out.println("Before Set: "+s7);
		s7.setCharAt(2, 'P');
		System.out.println("After Set: "+ s7);
		
		
		//trimToSize()
		
		System.out.println("Before Trim");
		StringBuilder s8=new StringBuilder("Hello");
		System.out.println(s8.capacity());
		System.out.println("After Trim");		
		s8.trimToSize();
		System.out.println(s8.capacity());
		
		
		
		
		
		
	}

}
