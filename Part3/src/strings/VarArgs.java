package strings;

public class VarArgs {

	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(35,456,489,4546));
	}
	public static int  add(int ...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}
