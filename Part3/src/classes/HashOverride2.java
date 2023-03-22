package classes;

public class HashOverride2 {

	public static void main(String[] args) {
		HashCodeOverride obj= new HashCodeOverride(10);
		HashCodeOverride obj1= new HashCodeOverride(10);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj.hashCode()==obj1.hashCode());
	}

}
