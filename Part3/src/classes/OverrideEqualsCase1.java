package classes;

public class OverrideEqualsCase1 {

	public static void main(String[] args) 
	{
		OverrideEquals obj=new OverrideEquals(10);
		OverrideEquals obj1=obj;
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		
	}

}
