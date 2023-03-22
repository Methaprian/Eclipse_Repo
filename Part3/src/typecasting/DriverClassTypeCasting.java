package typecasting;

public class DriverClassTypeCasting {

	public static void main(String[] args) {
		ParentClass Object1=new ChildClass();
		if (Object1 instanceof ChildClass) {
			ChildClass Object2=(ChildClass)Object1;// Downcasting
			System.out.println(Object2.ParentVariable);
			System.out.println(Object2.ChildVariable);		
			}else {
				System.out.println("Instance of ChildClass is Not Present");
		}
		
		
	}

}
