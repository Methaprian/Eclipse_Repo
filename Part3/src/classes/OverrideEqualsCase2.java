package classes;

public class OverrideEqualsCase2 {

	public static void main(String[] args) 
	{
		OverrideEquals obj=new OverrideEquals(10);
		OverrideEquals obj1=new OverrideEquals(10);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));	
	}

}
