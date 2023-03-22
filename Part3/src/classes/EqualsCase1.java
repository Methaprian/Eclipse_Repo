package classes;

public class EqualsCase1 {

	public static void main(String[] args) 
	{
		AEquals obj=new AEquals(10);
		AEquals obj1=new AEquals(10);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		
	}

}
