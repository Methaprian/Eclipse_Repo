package classes;

public class Book1Driver {

	public static void main(String[] args) {
		Book1 b1=new Book1(1,"Adams",150);
		System.out.println(b1.hashCode());
		Book1 b2=new Book1(1,"Adams",150);
		System.out.println(b2.hashCode());
		System.out.println(b1.hashCode()==b2.hashCode());
		
	}

}
