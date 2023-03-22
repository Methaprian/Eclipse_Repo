package nonStatic;

public class A2 {

	public static void main(String[] args) {
		
		//Using Object Creation
		
		A1 obj=new A1();
		System.out.println(obj.a);
		
		
		//Using Super Keyword
		
		System.out.println();
		
	}
	
	public int nonStatic(int a)
	{
		return 10;
	}

}
