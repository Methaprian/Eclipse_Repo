package classes;

public class EqualsCase2 {

	public static void main(String[] args) 
	{
		AEquals obj=new AEquals(10);
		AEquals obj1=obj;
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
	}

}
