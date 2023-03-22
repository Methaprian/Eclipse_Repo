package qsp;

public class Rev {
	static String s="KEERTHI";
	public static void main(String[] args) 
	{
		String str=rev(0,"");
		System.out.println(str);
	}
	public static String rev(int i,String s1)
	{
		//String s2="";
		s1=s.charAt(i)+s1;
		i++;
		if(i<s.length())
		{
			s1=rev(i,s1);
		}
		
		return s1;
	}

}
