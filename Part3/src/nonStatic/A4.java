package nonStatic;

public class A4 extends A3 
{
	int a=10;
	{
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		
		
		System.out.println(super.a);
		//A3 obj=new A4();
		System.out.println(a);
		
	}
	
}
