package classes;

public class HashCodeDriver2 {

	public static void main(String[] args) {
		HashCode obj=new HashCode(10);
		HashCode obj1=obj;
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode()==obj1.hashCode());
	}

}
